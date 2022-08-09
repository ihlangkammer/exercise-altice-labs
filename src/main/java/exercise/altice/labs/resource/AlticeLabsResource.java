package exercise.altice.labs.resource;

import exercise.altice.labs.controller.AlticeLabsController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/alticci")
public class AlticeLabsResource {

    private AlticeLabsController controller;

    @GET
    @Path("{n}")
    public Integer calculateSequence(@PathParam("n") int nValue) {
        return controller.calculateSequence(nValue);
    }
}