package stepdefinitions.ui;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.ViceDeanPostPojo;

import static base_url.StudentManagementBaseUrlWithoutAnnotation.spec;
import static io.restassured.RestAssured.given;
import static utilities.AdminAuthentication.generateTokenForAdmin;

import pojos.ViceDeanResponsePojo;

import pojos.contactPojos.Root;
import utilities.JsonUtils;
import utilities.ReusableMethods;

public class US_06_API {

    Response response;
    Response response2;
    ViceDeanPostPojo expectedData;
    ViceDeanResponsePojo actualData;
    JsonPath json;
    int userId;
    Faker faker = new Faker();

    //Request URL for post
    //https://managementonschools.com/app/vicedean/save


    @And("User sets the expected data")
    public void userSetsTheExpectedData() {
        String name = faker.name().firstName();
        String lastname = faker.name().lastName();
        String username = name+lastname;
        String password=name.toUpperCase().substring(0,1)+lastname.toLowerCase().substring(0,5)+"1234.";
        String phoneNumber = faker.phoneNumber().cellPhone();
        String ssnNumber = faker.idNumber().ssnValid();
        expectedData = new ViceDeanPostPojo("2018-02-05","Norway", "MALE", name, password,
                phoneNumber, ssnNumber, lastname, username);

      }

    @And("User sends the post request and gets the response")
    public void userSendsThePostRequestAndGetsTheResponse() {
        response = given()
                .header("Authorization", "Bearer "+generateTokenForAdmin())
                .contentType(ContentType.JSON).body(expectedData)
                .when()
//                .post("/{first}/{second}/{third}");
                .post("https://managementonschools.com/app/vicedean/save");
        response.prettyPrint();
    }

    @Then("verify that status code is {int}")
    public void verifyThatStatusCodeIs(int statusCode) {
        Assert.assertEquals(statusCode, response.getStatusCode());
    }

    @And("Do assertion according to post request")
    public void doAssertionAccordingToPostRequest() {

        json = response.jsonPath();
        Assert.assertEquals(expectedData.getBirthDay(), json.getString("birthDay"));
        Assert.assertEquals(expectedData.getBirthPlace(), json.getString("birthPlace"));
        Assert.assertEquals(expectedData.getGender(), json.getString("gender"));
        Assert.assertEquals(expectedData.getName(), json.getString("name"));
        Assert.assertEquals(expectedData.getPassword(), json.getString("password"));
        Assert.assertEquals(expectedData.getPhoneNumber(), json.getString("phoneNumber"));
        Assert.assertEquals(expectedData.getSsn(), json.getString("ssn"));
        Assert.assertEquals(expectedData.getSurname(), json.getString("surname"));
        Assert.assertEquals(expectedData.getUsername(), json.getString("username"));
    }


    //Request URL for get
    //https://managementonschools.com/app/vicedean/getViceDeanById/21


    @And("User sends the Get request and gets the response")
    public void userSendsTheGetRequestAndGetsTheResponse() {
        userId = json.getInt("userId");   //from response
        response2 = given().header("Authorization", "Bearer "+generateTokenForAdmin()).when()
                .get("https://managementonschools.com/app/vicedean/getViceDeanById/" + userId);
        response2.prettyPrint();
    }


    @Then("verify that status code is {int} for get request")
    public void verifyThatStatusCodeIsForGetRequest(int statusCode) {
        Assert.assertEquals(statusCode, response2.getStatusCode());
    }

    @And("Do assertion according to Get request")
    public void doAssertionAccordingToGetRequest() {
//        actualData = JsonUtils.convertJsonToJava(response2.asString(), ViceDeanResponsePojo.class);
        actualData = response2.as(ViceDeanResponsePojo.class);
        Assert.assertEquals("100 CONTINUE", actualData.getHttpStatus());
        Assert.assertEquals("string", actualData.getMessage());
        Assert.assertEquals(expectedData.getBirthDay(), actualData.getObject().getBirthDay());
        Assert.assertEquals(expectedData.getBirthPlace(),actualData.getObject().getBirthPlace());
        Assert.assertEquals(expectedData.getGender(), actualData.getObject().getGender());
        Assert.assertEquals(expectedData.getName(), actualData.getObject().getName());
        Assert.assertEquals(expectedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        Assert.assertEquals(expectedData.getSsn(), actualData.getObject().getSsn());
        Assert.assertEquals(expectedData.getSurname(), actualData.getObject().getSurname());
        Assert.assertEquals(expectedData.getUsername(), actualData.getObject().getUsername());



   }



}



