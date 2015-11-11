package api.domain;



import api.Identity;
import exceptions.RestServiceException;

import javax.ws.rs.core.Response;

public interface OpenApiV3Service {

    Identity getIdentity();

    void setup();

    void loginToOpenApi(String email, String password) throws RestServiceException;

    /**
     * Achievements
     */
    Response getAchievementsStats(int userId);

}
