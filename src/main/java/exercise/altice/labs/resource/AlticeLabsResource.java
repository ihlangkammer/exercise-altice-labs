package exercise.altice.labs.resource;

import exercise.altice.labs.controller.AlticeLabsController;
import exercise.altice.labs.entity.AlticeLabs;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@Path("/alticci")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name = "Altice Labs", description = "Calcular a sequência de alticci")
public class AlticeLabsResource {

    private AlticeLabsController controller = new AlticeLabsController();
    private Set<AlticeLabs> alticeLabs = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ping() {
        return "pong";
    }

    @GET
    @Produces
    @Operation(
            operationId = "calculateSequence",
            summary = "Calcular Sequência",
            description = "Calcular o valor de N"
    )
    @APIResponse(
            responseCode = "200",
            description = "Operação Completa",
            content = @Content(mediaType = MediaType.APPLICATION_JSON)
    )
    @Path("/{n}")
    public Set<AlticeLabs> calculateSequence (
            @PathParam("n") int nValue) {
        alticeLabs.add(controller.calculateSequence(nValue));
        return alticeLabs;
    }
}