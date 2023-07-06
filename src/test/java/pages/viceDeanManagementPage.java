package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class viceDeanManagementPage {

    public viceDeanManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(id = "name")
    public WebElement nameField;

    @FindBy(id = "surname")
    public WebElement surnameField;

    @FindBy(id = "birthPlace")
    public WebElement birthPlaceField;

    @FindBy(xpath = "(//input[@name='gender'])[1]")
    public WebElement female;

    @FindBy(xpath = "(//input[@name='gender'])[2]")
    public WebElement male;

    @FindBy(id = "birthDay")
    public WebElement birthDay;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "username")
    public WebElement username;





    //Required Texts
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement nameRequiredText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement surnameRequiredText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement birthPlaceRequiredText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement birthDayRequiredText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement phoneNumberRequiredText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement ssnRequiredText;



















}