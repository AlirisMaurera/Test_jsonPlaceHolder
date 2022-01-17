package base;

import io.cucumber.java.Before;
import static io.restassured.RestAssured.*;

public class SetUp {

    @Before
    public void initialize(){
        baseURI = "https://jsonplaceholder.typicode.com/";
        basePath = "posts/";
    }
}
