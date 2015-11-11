package api.domain;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import api.domain.model.oauth.AuthorizationRequest;
import api.domain.model.user.achievements.Achievements;
import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.interceptor.OutInterceptors;

@InInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingInInterceptor")
@OutInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingOutInterceptor")
public interface OpenApiV3RestClient {

    /**
     * Achievements
     */
    @GET
    @Path("/Users/{userId}/achievements")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Encoded
    public Achievements achievementsGet(@PathParam("userId") int userId, @QueryParam("activityType") String activityType, @QueryParam("achievementType") String achievementType, @QueryParam("workoutClassification") String workoutClassification);

    @POST
    @Path("/OAuth2/Authorize")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Encoded
    public Response OAuth2Authorize(AuthorizationRequest authenticate);

}