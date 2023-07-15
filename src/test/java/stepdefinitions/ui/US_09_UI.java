package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LessonPage;
import pojos.LessonPostPojo;
import pojos.LessonResponseObjectPojo;
import pojos.LessonResponsePojo;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.awt.*;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class US_09_UI {


  LessonPage lessonPage = new LessonPage();
  LessonResponseObjectPojo lessonResponseObjectPojo;
  LessonPostPojo expectedData;
  LessonResponsePojo actualData;
  Response response;


  String createdLessonName;

  @Then("user verifies Lesson Name, Compulsory, Credit Score fields are visible")
  public void userVerifiesLessonNameCompulsoryCreditScoreFieldsAreVisible() {
    assertTrue(lessonPage.lessonNameColumnName.isDisplayed());
    assertTrue(lessonPage.compulsoryColumnName.isDisplayed());
    assertTrue(lessonPage.creditScoreColumnName.isDisplayed());


  }
  String createdLesson;

  @When("user enters information for new lesson and click on submit button")
  public void userEntersInformationForNewLessonAndClickOnSubmitButton() {
    Faker faker = new Faker();
    int number = faker.number().numberBetween(100,1000);
    createdLesson = "Norwegian" + number;
    lessonPage.lessonName.sendKeys(createdLesson);
    lessonPage.compulsory.click();
    lessonPage.creditScore.sendKeys(String.valueOf(number));
    lessonPage.submitButton.click();

  }
  WebElement tableBody;

  @Then("user verifies a new lesson is created.")
  public void userVerifiesANewLessonIsCreated() throws AWTException {

    assertTrue(lessonPage.lessonCreatedText.isDisplayed());
    System.out.println("step1");

//    Robot robot = new Robot();
//    robot.mouseWheel(15);
    JSUtils.scrollDownByJS();
    ReusableMethods.clickWithJS(lessonPage.goToLastPage);  //it does not work

    //it gives just first page
    tableBody = Driver.getDriver().findElement(By.xpath("//*[@id=\"controlled-tab-example-tabpane-lessonsList\"]//table//tbody"));
    System.out.println(tableBody.getText());
    List<WebElement> rows = Driver.getDriver().findElements(By.xpath("//*[@id=\"controlled-tab-example-tabpane-lessonsList\"]//table//tbody//tr"));
    System.out.println(rows.size());
    System.out.println("step2");

    assertTrue(tableBody.getText().contains(createdLesson));
    System.out.println("step3");

  }

  int size;
  @When("user clicks on delete button for this lesson")
  public void userClicksOnDeleteButtonForThisLesson() {

    List<WebElement> deleteList = Driver.getDriver().findElements(By.xpath("//button[@class='btn btn-danger']"));
    size =deleteList.size();
    System.out.println(size);
    System.out.println("step4");
    //the last delete icon is    (//button[@class='btn btn-danger'])[9]
    ReusableMethods.clickWithJS(Driver.getDriver().findElement(By.xpath("(//button[@class='btn btn-danger'])["+size+"]")));

    System.out.println("step5");


  }

  @Then("user verifies the lesson is deleted")
  public void userVerifiesTheLessonIsDeleted() {

    WebElement lastRow = Driver.getDriver().findElement(By.xpath("//*[@id=\"controlled-tab-example-tabpane-lessonsList\"]//tbody//tr["+ (size-1)+" ]//td[1]"));

    System.out.println(lastRow.getText());

    assertFalse(lastRow.getText().equalsIgnoreCase(createdLesson));
    System.out.println("step6");
  }


}


