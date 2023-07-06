package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginIcon;

    @FindBy(xpath = "//a[@href='/register']")
    public WebElement registerIcon;

    @FindBy(xpath = "//*[.='Home']")
    public WebElement homeIcon;

    @FindBy(xpath = "//*[.='Courses']")
    public WebElement coursesIcon;

    @FindBy(xpath = "//*[.='Events']")
    public WebElement eventsIcon;

    @FindBy(xpath = "//*[.='Blog']")
    public WebElement blogIcon;

    @FindBy(xpath = "//*[.='Contact']")
    public WebElement contactIcon;



}