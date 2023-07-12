package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AdminManagementPage;
import pages.ContactGetAllPage;
import pages.LessonPage;
import utilities.Driver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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



}


