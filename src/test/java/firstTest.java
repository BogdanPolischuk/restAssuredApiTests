import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class firstTest {
@Test
public void myfirstTest (){
    given().
            when().get("https://swapi.dev/api/people/1").
            then().statusCode(200);


}
}
