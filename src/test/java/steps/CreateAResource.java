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

public class CreateAResource {

    private Response response;
    private RequestSpecification request;
    private GetJson getJson;

    @Given("a valid data {string} {string} {int}")
    public void a_valid_data(String title, String body, int userId) {
        getJson = new GetJson();
        String json = getJson.createJson(title, body, userId);

        request = given()
                .body(json)
                .contentType(ContentType.JSON);
    }

    @When("do post in the endpoint")
    public void do_post_in_the_endpoint() {
        response = request.when()
                .post()
                .then()
                .extract().response();
    }

    @Then("is returned status code {int}")
    public void is_returned_status_code(int status) {
        Assert.assertEquals(status, response.getStatusCode());
    }

    @Then("the data {string} {string} {string}")
    public void the_data(String title, String body, String userId) {
        Assert.assertEquals(title, response.jsonPath().get("title").toString());
        Assert.assertEquals(body, response.jsonPath().get("body").toString());
        Assert.assertEquals(userId, response.jsonPath().get("userId").toString());
    }

}
