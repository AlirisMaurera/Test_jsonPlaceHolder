package steps;

import base.Constant;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class GetAresourceById implements Constant {

    private Response response;
    private RequestSpecification request;

    @Given("a user be a endpoint")
    public void a_user_be_a_endpoint() {
        request = given();
    }

    @When("do get with a id {string}")
    public void do_get_with_a_id(String id) {
        response = request.when()
                .get(id)
                .then()
                .extract().response();
    }

    @Then("status code returned is {int}")
    public void status_code_returned_is(int status) {
        Assert.assertEquals(status, response.getStatusCode());
    }

    @Then("it shows a body of the requested resource with equal id {string}")
    public void it_shows_a_body_of_the_requested_resource(String id) {

        Assert.assertTrue(response.jsonPath().get("id").toString().equalsIgnoreCase(id));
        Assert.assertTrue(response.jsonPath().get().toString().contains("title"));
        Assert.assertTrue(response.jsonPath().get().toString().contains("body"));
        Assert.assertTrue(response.jsonPath().get().toString().contains("userId"));

    }

}
