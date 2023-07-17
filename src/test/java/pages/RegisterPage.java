package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {

    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "surname")
    public WebElement surname;

    @FindBy(id = "birthPlace")
    public WebElement birthPlace;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement female;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement male;

    @FindBy(id = "birthDay")
    public WebElement birthDay;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[.='Register']")
    public WebElement registerButton;



    //Required Texts
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement nameRequiredText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement surnameRequiredText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement birthPlaceRequiredText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement phoneNumberRequiredText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement birthDayRequiredText;


    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement ssnRequiredText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement usernameRequiredText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public WebElement passwordRequiredText;

  //  @FindBy(xpath = "//*[.='Minimum 8 character']")
 //   public WebElement minimum8CharacterText;

 //   @FindBy(xpath = "//*[contains(text(),'Minimum 8 character')]")

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public WebElement minimum8CharacterText;
}