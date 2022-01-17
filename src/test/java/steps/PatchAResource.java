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

public class PatchAResource implements Constant{

    private Response response;
    private RequestSpecification request;
    private GetJson getJson;

    @Given("a valid data of user existing {string}")
    public void a_valid_data_of_user_existing(String title) {
      getJson = new GetJson();
       String json = getJson.createJsonPatch(title);

        request = given()
                .body(json)
                .contentType(ContentType.JSON);
    }
    @When("do patch in the endpoint in a register with id {string}")
    public void do_patch_in_the_endpoint_in_a_register_with_id(String id) {
        response = request.when()
                .patch(id)
                .then()
                .extract().response();
    }
    @Then("return a status code {int}")
    public void return_a_status_code(int status) {
        Assert.assertEquals(status, response.getStatusCode());
    }
    @Then("the data is update {string}")
    public void the_data_is_update(String title) {
        Assert.assertEquals(title, response.jsonPath().get("title").toString());
    }

}
