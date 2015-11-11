package api.domain;


import api.AbstractRestService;
import api.Identity;
import api.domain.model.AdvancedTypeConverter;
import api.domain.model.oauth.AuthorizationRequest;
import api.domain.model.oauth.AuthorizationResponse;
import exceptions.RestServiceException;
import org.apache.cxf.common.util.Base64Utility;
import org.apache.cxf.jaxrs.client.Client;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.apache.cxf.jaxrs.provider.json.JSONProvider;
import org.apache.cxf.rs.security.oauth2.client.OAuthClientUtils;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import java.util.Arrays;

public class OpenApiV3ServiceImpl extends AbstractRestService implements OpenApiV3Service {

    private static final String consumerId = "Auto_client";
    private static final String consumerKey = "Auto_client";
    private static final boolean CHUNKING_DEFAULT_VALUE = false;

    //@CCProperty("open.api.rest.v3")
    private String openApiV3BaseUrl;
    private OpenApiV3RestClient proxyClient;
    private AuthorizationResponse authorizationResponse;
    private JSONProvider jsonProvider;
    private OAuthClientUtils.Consumer consumer;

    private String basicKey;
    private String httpAuthorizationBasic;

    public OpenApiV3ServiceImpl() throws RestServiceException {
    }


    public void setOpenApiV3BaseUrl(String openApiV3BaseUrl) {
        this.openApiV3BaseUrl = openApiV3BaseUrl;
    }

    @Override
    public void setup() {
        ClientConfiguration clientConfiguration;
        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
        HTTPConduit httpConduit;
        WebClient webClient;

        consumer = new OAuthClientUtils.Consumer(consumerId, consumerKey);
        basicKey = consumer.getKey() + ":" + consumer.getSecret();
        httpAuthorizationBasic = "Basic " + Base64Utility.encode(basicKey.getBytes());

        proxyClient = JAXRSClientFactory.create(openApiV3BaseUrl, OpenApiV3RestClient.class, Arrays.asList(getJSONProvider()));

        clientConfiguration = WebClient.getConfig(proxyClient);
        httpConduit = (HTTPConduit) clientConfiguration.getConduit();
        httpClientPolicy.setAllowChunking(CHUNKING_DEFAULT_VALUE);
        httpConduit.setClient(httpClientPolicy);

        webClient = WebClient.fromClient(WebClient.client(proxyClient));
        webClient.header(HttpHeaders.AUTHORIZATION, httpAuthorizationBasic);

        proxyClient = JAXRSClientFactory.fromClient(webClient, OpenApiV3RestClient.class, true);
    }

    public JSONProvider getJSONProvider() {
        jsonProvider = new JSONProvider();

        jsonProvider.setSupportUnwrapped(true);
        jsonProvider.setDropRootElement(true);
        jsonProvider.setDropCollectionWrapperElement(true);
        jsonProvider.setIgnoreNamespaces(true);
        jsonProvider.setTypeConverter(new AdvancedTypeConverter());

//        jsonProvider.setSerializeAsArray(true); TODO: near future realization
//        jsonProvider.setArrayKeys(Arrays.asList("circuits", "sets", "exercises", "components"));

        return jsonProvider;
    }

    @Override
    public void doAuthorize() throws RestServiceException {
        WebClient webClient = null;
        Client client;
        AuthorizationRequest authorizationRequest = new AuthorizationRequest();

        authorizationRequest.setEmail(sessionOwner.getEmail());
        authorizationRequest.setPassword(sessionOwner.getPassword());

        webClient = WebClient.fromClient(WebClient.client(proxyClient));
        webClient.header(HttpHeaders.AUTHORIZATION, httpAuthorizationBasic);
        proxyClient = JAXRSClientFactory.fromClient(webClient, OpenApiV3RestClient.class, true);
        Response response = proxyClient.OAuth2Authorize(authorizationRequest);
        checkResponseStatus(response);
        //authorizationResponse = response.readEntity(AuthorizationResponse.class);
        client = WebClient.client(proxyClient);
        webClient = WebClient.fromClient(client);
        webClient.replaceHeader(HttpHeaders.AUTHORIZATION, "Bearer " + authorizationResponse.getAccessToken());

        proxyClient = JAXRSClientFactory.fromClient(webClient, OpenApiV3RestClient.class, true);

    }

    @Override
    public Identity getIdentity() {
        return sessionOwner;
    }

    public void checkResponseStatus(Response response) throws RestServiceException{
        if (response.getStatus() != 200) {
           // ErrorResponse error = response.readEntity(ErrorResponse.class);
            //throw new RestServiceException(error.getError().getKey());
        }
    }

    @Override
    public void loginToOpenApi(String email, String password) throws RestServiceException {
        sessionOwner = new Identity();
        sessionOwner.setEmail(email);
        sessionOwner.setPassword(password);
        doAuthorize();
    }

    @Override
    public Response getAchievementsStats(int userId) {
        return null;
    }

}
