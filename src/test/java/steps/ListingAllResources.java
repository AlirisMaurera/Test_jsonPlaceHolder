package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class ListingAllResources {

    private Response response;
    private RequestSpecification request;


    @Given("user be a endpoint")
    public void user_be_a_endpoint() {
        request = given();
    }
    @When("do get")
    public void do_get() {
        response = request
                .when()
                .get()
                .then().extract().response();
    }

    @Then("status code is {int}")
    public void status_code_is(int status) {
        Assert.assertEquals(status, response.getStatusCode());
    }

    @Then("display a list of resources greater than or equal to {int}")
    public void display_a_list_of_resources_greater_than_or_equal_to(int value) {
       Assert.assertTrue((response.jsonPath().getList("$").size()>=value));
    }

}
