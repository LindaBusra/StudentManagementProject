package stepdefinitions.ui;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.AdminManagementPage;
import pages.ContactGetAllPage;
import pages.LessonPage;
import pojos.LessonPostPojo;
import pojos.LessonResponseObjectPojo;
import pojos.LessonResponsePojo;
import utilities.Driver;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import static utilities.AdminAuthentication.generateTokenForAdmin;

public class US_08_UI {


  LessonPage lessonPage = new LessonPage();



    @And("user clicks on LessonManagement Button")
    public void userClicksOnLessonManagementButton() {
        lessonPage.lessonManagement.click();
    }


    @Then("user clicks on Lesson field")
    public void userClicksOnLessonField() {
      lessonPage.lesson.click();
    }


    @And("user enters name of lesson as {string}")
    public void userEntersNameOfLessonAs(String text) {
      lessonPage.lessonName.sendKeys(text);
    }

    @Then("user verifies {string} text is not visible for Lesson Name field.")
    public void userVerifiesTextIsNotVisibleForLessonNameField(String arg0) {
     assertTrue( lessonPage.requiredTextForLessonName.isDisplayed());
    }

    @And("user clicks on compulsory checkbox")
    public void userClicksOnCompulsoryCheckbox() {
      lessonPage.compulsory.click();
    }

    @Then("user verifies compulsory checkbox is marked")
    public void userVerifiesCompulsoryCheckboxIsMarked() {
      assertTrue(lessonPage.compulsory.isSelected());
    }

    @Then("user verifies {string} text is visible for Credit Score field.")
    public void userVerifiesTextIsVisibleForCreditScoreField(String arg0) {
      assertTrue( lessonPage.requiredTextForCreditScore.isDisplayed());
    }

    @And("user enters the Credit Score as {string}")
    public void userEntersTheCreditScoreAs(String num) {
        lessonPage.creditScore.sendKeys(num);
    }

    @Then("user verifies {string} text is not visible for Credit Score field.")
    public void userVerifiesTextIsNotVisibleForCreditScoreField(String arg0) {
      assertFalse(Driver.getDriver().getPageSource().contains("Required"));
    }


    //----------------------------------------API-------------------------------------------------------------------------



    LessonResponseObjectPojo lessonResponseObjectPojo;
    LessonPostPojo expectedData;
    LessonResponsePojo actualData;
    Response response;



  @And("User sends the post request for create lesson and gets the response")
  public void userSendsThePostRequestForCreateLessonAndGetsTheResponse() {
    expectedData=new LessonPostPojo(true, 100, "Matlaging for nye");

    response = given().when().contentType(ContentType.JSON).body(expectedData).headers("Authorization","Bearer "+generateTokenForAdmin()).post("https://managementonschools.com/app/lessons/save");

    System.out.println(expectedData);

    assertEquals(200, response.getStatusCode());

  }

  @And("user does assertion according to Get request")
  public void userDoesAssertionAccordingToGetRequest() throws JsonProcessingException {

    actualData= new ObjectMapper().readValue(response.asString(), LessonResponsePojo.class);

    Assert.assertEquals(expectedData.getCreditScore(),actualData.getObject().getCreditScore());
    Assert.assertEquals(expectedData.getLessonName(),actualData.getObject().getLessonName());
    Assert.assertEquals(expectedData.isCompulsory(),actualData.getObject().isCompulsory());
    Assert.assertEquals("Lesson Created",actualData.getMessage());
    Assert.assertEquals("httpStatus",actualData.getHttpStatus());
  }
}


