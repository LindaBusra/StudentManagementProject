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

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "(//div[.='Required'])[1]")
    public WebElement requiredTextForLessonName;

    @FindBy(xpath = "//*[.='Required']")
    public WebElement requiredTextForCreditScore;





}