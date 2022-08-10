package exercise.altice.labs.swagger;

import javax.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                description = "Projeto desenvolvido para o processo seletivo da Altice Labs.",
                title = "Altice Labs",
                version = "1.0",
                contact = @Contact(name = "Isabelle Langkammer", email = "isabellelangkammer@gmail.com")
        )
)
public class AplicationSwagger extends Application {
}