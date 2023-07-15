package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanManagementPage {

    public ViceDeanManagementPage() {
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

    @FindBy(id = "password")
    public WebElement password;





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

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement usernameRequiredText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public WebElement passwordRequiredText;

    @FindBy(xpath = "//*[.='Please enter valid SSN number']")
    public WebElement pleaseEnterSSNnumberText;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[.='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement minimum11CharacterText;

    @FindBy(xpath = "//*[.='Minimum 8 character']")
    public WebElement minimum8CharacterText;

//    @FindBy(xpath = "//*[.='Vice dean Saved']")
//    public WebElement viceDeanSavedText;

    @FindBy(xpath = "//*[contains(text(),’Saved’)]")
    public WebElement viceDeanSavedText;

    @FindBy(xpath = "//*[contains(text(),’already register’)]")
    public WebElement alreadyRegisterText;



















}