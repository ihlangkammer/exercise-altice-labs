package exercise.altice.labs.resource;

import exercise.altice.labs.controller.AlticeLabsController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/alticci")
public class AlticeLabsResource {

    private AlticeLabsController controller = new AlticeLabsController();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ping() {
        return "pong";
    }

    @GET
    @Path("/{n}")
    public String calculateSequence(@PathParam("n") int nValue) {
        return controller.calculateSequence(nValue);
    }
}