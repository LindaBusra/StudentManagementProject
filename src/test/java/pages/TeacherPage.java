package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherPage {

    public TeacherPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //Requirement texts
    @FindBy(xpath = "(//*[.='Required'])[1]")
    public WebElement requiredText;



    @FindBy(id = "name")
    public WebElement nameField;

    @FindBy(id = "surname")
    public WebElement surnameField;

    @FindBy(id = "birthPlace")
    public WebElement birthPlaceField;

    @FindBy(id = "email")
    public WebElement emailField;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumberField;

    @FindBy(id = "ssn")
    public WebElement ssnField;

    @FindBy(id = "birthDay")
    public WebElement birthDayField;

    @FindBy(id = "username")
    public WebElement usernameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "isAdvisorTeacher")
    public WebElement isAdvisorTeacherField;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement femaleRadioButton;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleRadioButton;

    @FindBy(xpath = "//*[.='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement minimum11CharacterText;

    @FindBy(xpath = "(//*[.='Submit'])[3]")
    public WebElement submitButton;

    @FindBy(xpath = "//*[.='Please enter valid SSN number']")
    public WebElement enterValidSSNText;






}