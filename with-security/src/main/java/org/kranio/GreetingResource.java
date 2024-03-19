package org.kranio;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import io.quarkus.security.Authenticated;
import jakarta.annotation.security.PermitAll;

@Path("/poc")
public class GreetingResource {

    
    @GET
    @Path("/authenticated/example")
    @Produces(MediaType.TEXT_PLAIN)
    public String authenticated() {
        return "Endpoint que solicita JWT";
    }

    @GET
    @Path("/withoutAuthenticated")
    @Produces(MediaType.TEXT_PLAIN)
    @PermitAll
    public String withoutAuthenticated() {
        return "Endpoint que no solicita JWT";
    }

}
