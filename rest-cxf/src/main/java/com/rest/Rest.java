package com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by christmo on 3/11/16.
 */
@Path("/")
public interface Rest {

    @GET
    @Path("/info")
    Object info();

    @GET
    @Path("/test")
    Object test();

}
