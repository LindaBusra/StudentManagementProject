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

    @FindBy(id = "controlled-tab-example-tab-lessonsList")
    public WebElement lesson;

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






}