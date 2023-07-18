package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LessonPage {

    public LessonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[.='Lesson Management'])[4]")
    public WebElement lessonManagement;

//    @FindBy(xpath = "(//*[.='Teacher Management'])[4]")
//    public WebElement teacherManagement;

    @FindBy(xpath = "//*[text()='Teacher Management']")
    public WebElement teacherManagement;



    @FindBy(id = "controlled-tab-example-tab-lessonsList")
    public WebElement lesson;

    @FindBy(id = "controlled-tab-example-tab-lessonProgram")
    public WebElement lessonProgram;

    @FindBy(id = "lessonName")
    public WebElement lessonName;

    @FindBy(id = "creditScore")
    public WebElement creditScore;

    @FindBy(xpath = "//input[@id='compulsory']")
    public WebElement compulsory;

    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement submitButton;

    @FindBy(xpath = "(//div[.='Required'])[1]")
    public WebElement requiredTextForLessonName;


    @FindBy(xpath = "//*[.='Required']")
    public WebElement requiredTextForCreditScore;

    @FindBy(xpath = "//*[.='Lesson Created']")
    public WebElement lessonCreatedText;

    //columns
    @FindBy(xpath = "(//*[.='Lesson Name'])[4]")
    public WebElement lessonNameColumnName;

    @FindBy(xpath = "(//*[.='Compulsory'])[4]")
    public WebElement compulsoryColumnName;

    @FindBy(xpath = "(//*[.='Credit Score'])[4]")
    public WebElement creditScoreColumnName;

//    @FindBy(xpath = "//*[.='»']")
//    public WebElement goToLAstPage;

    @FindBy(xpath = "(//a[@class='page-link'])[8]")
    public WebElement goToLastPage;


    @FindBy(xpath = "//*[@class='fa-solid fa-trash']")
    public WebElement deleteButton;


    //lessonProgram
    @FindBy(xpath = "//div[@class=' css-1xc3v61-indicatorContainer']")
    public WebElement selectCourseDropDown;

    @FindBy(id = "educationTermId")
    public WebElement selectSemesterDropDown;

    @FindBy(id = "day")
    public WebElement selectDayDropDown;

    @FindBy(id = "startTime")
    public WebElement startTime;

    @FindBy(id = "stopTime")
    public WebElement stopTime;

    @FindBy(xpath= "(//*[.='Submit'])[7]")
    public WebElement addLessonProgramSubmitButton;

    @FindBy(xpath= "//*[.='Created Lesson Program']")
    public WebElement createdLessonProgram;





}