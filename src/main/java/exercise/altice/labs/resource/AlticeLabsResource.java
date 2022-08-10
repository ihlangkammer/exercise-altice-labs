package exercise.altice.labs.resource;

import exercise.altice.labs.controller.AlticeLabsController;
import exercise.altice.labs.entity.AlticeLabs;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@Path("/alticci")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AlticeLabsResource {

    private AlticeLabsController controller = new AlticeLabsController();
    private Set<AlticeLabs> alticeLabs = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ping() {
        return "pong";
    }

    @GET
    @Path("/{n}")
    public Set<AlticeLabs> calculateSequence (
            @PathParam("n") int nValue) {
        alticeLabs.add(controller.calculateSequence(nValue));
        return alticeLabs;
    }
}