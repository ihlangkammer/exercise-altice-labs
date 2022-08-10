package exercise.altice.labs;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class AlticeLabsResourceTest {
    @Test
    public void testCalculateSequenceEndpoint() {
        given()
                .when().get("/alticci/10")
                .then()
                .statusCode(200)
                .body(is("9"));
    }

    public void failedTestCalculateSequenceEndpoint() {
        given()
                .when().get("/alticci/p")
                .then()
                .statusCode(404);
    }
}