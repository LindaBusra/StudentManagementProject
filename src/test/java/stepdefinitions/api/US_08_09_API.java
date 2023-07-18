package stepdefinitions.api;

import com.github.javafaker.Faker;
import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.lessonPojo.LessonDeleteResponsePojo;
import pojos.lessonPojo.LessonPostPojo;
import pojos.lessonPojo.LessonResponseObjectPojo;
import pojos.lessonPojo.LessonResponsePojo;
import utilities.JsonUtils;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import static utilities.AdminAuthentication.generateTokenForAdmin;

public class US_08_09_API {


  LessonResponseObjectPojo lessonResponseObjectPojo;
  LessonPostPojo expectedData;
  LessonResponsePojo actualData;
  LessonDeleteResponsePojo actualData2;
  Response response;
  int lessonId;
  JsonPath json;
  Response response2;
  Response response3;
  String lessonName;

  @And("User sets the expected data for create lesson")
  public void userSetsTheExpectedDataForCreateLesson() {
    Faker faker = new Faker();
    int number = faker.number().numberBetween(100,1000);
    lessonName = "Chemistry" + number;
    expectedData=new LessonPostPojo(true, 100, lessonName);
  }


  @And("User sends the post request for create lesson and gets the response")
  public void userSendsThePostRequestForCreateLessonAndGetsTheResponse() {

    response = given().when().contentType(ContentType.JSON).body(expectedData).headers("Authorization","Bearer "+generateTokenForAdmin()).post("https://managementonschools.com/app/lessons/save");
    response.prettyPrint();
  }


  @Then("user verifies that status code is {int}")
  public void userVerifiesThatStatusCodeIs(int statusCode) {
    assertEquals(statusCode, response.getStatusCode());
  }



    @And("user sends get request and get the response with lesson name")
    public void userSendsGetRequestAndGetTheResponseWithLessonName() {
            response2 = given().header("Authorization", "Bearer "+generateTokenForAdmin()).when()
            .get("https://managementonschools.com/app/lessons/getLessonByName?lessonName=" +lessonName );

    }



  @Then("user verifies that status code is {int} for getting response with lesson name")
  public void userVerifiesThatStatusCodeIsForGettingResponseWithLessonName(int statusCode) {
    Assert.assertEquals(statusCode, response2.getStatusCode());


  }





  @And("user does assertion according to Get request")
  public void userDoesAssertionAccordingToGetRequest() throws JsonProcessingException {

    actualData= response.as(LessonResponsePojo.class);

    assertTrue(actualData.getObject().getLessonName().contains(lessonName));

    Assert.assertEquals(expectedData.getCreditScore(),actualData.getObject().getCreditScore());
    Assert.assertEquals(expectedData.getLessonName(),actualData.getObject().getLessonName());
    Assert.assertEquals(expectedData.isCompulsory(),actualData.getObject().isCompulsory());
    Assert.assertEquals("Lesson Created",actualData.getMessage());
    Assert.assertEquals("OK",actualData.getHttpStatus());
  }



  @When("user send delete request with lessonId")
  public void userSendDeleteRequestWithLessonId() {

    LessonResponsePojo responsePojo = JsonUtils.convertJsonToJavaObject(response.asString(), LessonResponsePojo.class);
    System.out.println(responsePojo);

    //FROM LessonResponsePojo I take the value of lessonId
    int lessonId = responsePojo.getObject().getLessonId();
    System.out.println("I will delete lesson with lessonId: " + lessonId);


    response3 = given().header("Authorization", "Bearer "+generateTokenForAdmin()).when()
            .delete("https://managementonschools.com/app/lessons/delete/" + lessonId);

    //https://managementonschools.com/app/lessons/getAllLessonByLessonId?lessonId=1731
  }



  @When("user makes verification for delete operation")
  public void userMakesVerificationForDeleteOperation() {
    actualData2= response3.as(LessonDeleteResponsePojo.class);
    Assert.assertEquals(200, response3.getStatusCode());
    Assert.assertEquals("Lesson Deleted",actualData2.getMessage());
    Assert.assertEquals("OK",actualData2.getHttpStatus());
  }


}


