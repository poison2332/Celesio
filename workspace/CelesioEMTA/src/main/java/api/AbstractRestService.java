package api;

import exceptions.RestServiceException;

import javax.ws.rs.core.Response;

public abstract class AbstractRestService {
    protected Identity sessionOwner;

    public AbstractRestService() throws RestServiceException {
    }

    public void createNewSession(Identity sessionOwner) throws RestServiceException {
        this.sessionOwner = sessionOwner;
        this.doAuthorize();
    }

    public abstract void doAuthorize() throws RestServiceException;

}