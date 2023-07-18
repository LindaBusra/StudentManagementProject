package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pages.LessonPage;
import pojos.lessonPojo.LessonPostPojo;
import pojos.lessonPojo.LessonResponseObjectPojo;
import pojos.lessonPojo.LessonResponsePojo;
import utilities.Driver;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class US_08_UI {


  LessonPage lessonPage = new LessonPage();
  LessonResponseObjectPojo lessonResponseObjectPojo;
  LessonPostPojo expectedData;
  LessonResponsePojo actualData;
  Response response;


  @And("user clicks on Lesson Management Button")
  public void userClicksOnLessonManagementButton() {
    lessonPage.lessonManagement.click();
  }

    @Then("user clicks on Lesson field")
    public void userClicksOnLessonField() {
      lessonPage.lesson.click();
    }

    @When("user passes Lesson Name field without filling")
    public void userPassesLessonNameFieldWithoutFilling() {

      lessonPage.compulsory.click();
    }

    @Then("user verifies Required text is visible for Lesson Name field")
    public void userVerifiesRequiredTextIsVisibleForLessonNameField() {
      assertTrue( lessonPage.requiredTextForLessonName.isDisplayed());
    }

    @And("user enters name of lesson as {string}")
    public void userEntersNameOfLessonAs(String text) {

      Faker faker = new Faker();
      String lessonName = text + faker.number().numberBetween(1000,5000);
      lessonPage.lessonName.sendKeys(lessonName);
    }

    @Then("user verifies {string} text is not visible for Lesson Name field.")
    public void userVerifiesTextIsNotVisibleForLessonNameField(String arg0) {
     assertTrue( lessonPage.requiredTextForCreditScore.isDisplayed());
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


  @Then("user clicks on Submit Button")
  public void userClicksOnSubmitButton() {
      lessonPage.submitButton.click();

  }

  @Then("user verifies {string} text is visible for this new lesson")
  public void userVerifiesTextIsVisibleForThisNewLesson(String arg0) {

    assertTrue(lessonPage.lessonCreatedText.isDisplayed());
  }



}


