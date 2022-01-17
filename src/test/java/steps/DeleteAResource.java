package steps;

import base.Constant;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import utils.GetJson;

import static io.restassured.RestAssured.given;

public class DeleteAResource implements Constant{

    private Response response;
    private RequestSpecification request;
    private String id;

    @Given("a valid id {string}")
    public void a_valid_id(String idValue) {
       id = idValue;

       request = given();
    }
    @When("do delete in the endpoint")
    public void do_delete_in_the_endpoint() {
        response = request.when()
                .delete(id)
                .then()
                .extract().response();
    }
    @Then("status code returned {int}")
    public void status_code_returned(int status) {
        Assert.assertEquals(status, response.getStatusCode());
    }

}
