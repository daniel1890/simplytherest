package nl.han.oose.dea.rest.services.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/lives")
public class LivesCheckResource {

    @GET
    public String lives() {
        return "You have 3 lives";
    }
}