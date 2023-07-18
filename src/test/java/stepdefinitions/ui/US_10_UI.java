package stepdefinitions.ui;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.LessonPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class US_10_UI {


  LessonPage lessonPage = new LessonPage();


  @Then("user clicks on Lesson Program field")
  public void userClicksOnLessonProgramField() {
    lessonPage.lessonProgram.click();
  }


  @And("user verifies that user can select {string} course")
  public void userVerifiesThatUserCanSelectCourse(String course) {

    WebElement dropdown = Driver.getDriver().findElement(By.xpath("//div[@class=' css-1xc3v61-indicatorContainer']"));
    System.out.println("1");
    dropdown.click();
    System.out.println("2");
    Select options = new Select(dropdown);
    System.out.println(options.getFirstSelectedOption().getText());
    System.out.println("3");
    List<WebElement> optionslist  = options.getOptions();

    System.out.println("size" + optionslist.size() );

//    options.selectByIndex(2);
//    System.out.println("3");

    List<WebElement> allOptions =options.getOptions();
    for (WebElement eachOption:allOptions){
      System.out.println(eachOption.getText());
    }
//    System.out.println("step0");
//    lessonPage.selectCourseDropDown.click();
//    System.out.println("step1");
//    Select select = new Select(lessonPage.selectCourseDropDown);
//    ReusableMethods.waitFor(3);
//    System.out.println("step2");
//    select.selectByIndex(2);
//    System.out.println("step3");
  }


  @And("user verifies that user can select {string} semester")
  public void userVerifiesThatUserCanSelectSemester(String semester) {




//    lessonPage.selectSemesterDropDown.click();

//    Select select = new Select(lessonPage.selectSemesterDropDown);
//    ReusableMethods.waitFor(3);
//    select.selectByVisibleText(semester);
  }


  @And("user verifies that user can select {string} for the course")
  public void userVerifiesThatUserCanSelectForTheCourse(String day) {
    Select select = new Select(lessonPage.selectDayDropDown);
    select.selectByValue(day);
  }


  @And("user verifies that user can select the start and end time for the course")
  public void userVerifiesThatUserCanSelectTheStartAndEndTimeForTheCourse() {
    lessonPage.startTime.sendKeys("10:00");
    lessonPage.stopTime.sendKeys("16:00");
  }


  @Then("user clicks on Submit Button for Add Lesson Program")
  public void userClicksOnSubmitButtonForAddLessonProgram() {
    lessonPage.addLessonProgramSubmitButton.click();
    assertTrue(lessonPage.createdLessonProgram.isDisplayed());
  }


}


