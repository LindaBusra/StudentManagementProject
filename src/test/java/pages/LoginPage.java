package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement loginButton;

//
//    @FindBy(xpath = "//a[@href='/account/register']")
//    public WebElement registerOption;
//
//    @FindBy(id = "entity-menu")
//    public WebElement itemsAndTitles;
//
//    @FindBy(linkText = "Room")
//    public WebElement roomOption;
//
//    @FindBy(xpath = "//span[.='Administration']")
//    public WebElement administration;
//
//    @FindBy(xpath = "//span[.='User management']")
//    public WebElement userManagementLink;
//
//
//
//    // -----------zeynep---------------
//    @FindBy(xpath = "(//*[@data-icon='user'])[2]")
//    public WebElement userIconName;
//
//    @FindBy(xpath = "//span[.='Sign out']")
//    public WebElement signOut;
//
//
//    @FindBy(xpath = "//*[.='MY PAGES']")
//    public WebElement myPagesButton;
//
//    @FindBy(xpath = "//*[.='My Appointments']")
//    public WebElement myAppointmentsButton;
//
//
//
//
////----------Mert-----------------
//
//    @FindBy(id = "firstName")
//    public WebElement firstNameInputForAppointment;
//
//    @FindBy(xpath = "//*[.='Your FirstName is required.']")
//    public WebElement firstNameWarningMessage;
//
//    @FindBy(id = "lastName")
//    public WebElement lastNameInputForAppointment;
//
//    @FindBy(xpath = "//*[.='Your LastName is required.']")
//    public WebElement lastNameWarningMessage;
//
//    @FindBy(xpath = "//input[@id='ssn']")
//    public WebElement ssnInputForAppointment;
//
//    @FindBy(xpath = "//*[.='Your SSN is required.']")
//    public WebElement SSNWarningMessage;
//
//    @FindBy(id = "email")
//    public WebElement emailInputForAppointment;
//
//    @FindBy(xpath = "//*[.='Your email is required.']")
//    public WebElement emailWarningMessage;
//
//    @FindBy(id = "phone")
//    public WebElement phoneNumberInputForAppointment;
//
//    @FindBy(xpath = "//*[.='Phone number is required.']")
//    public WebElement phoneNumberWarningMessage;
//
//    @FindBy(xpath = "//*[.='Phone number is invalid']")
//    public WebElement phoneNumberInvalidMessage;
//
//    @FindBy(id = "appoDate")
//    public WebElement dateInputForAppointment;
//
//    @FindBy(id = "register-submit")
//    public WebElement sendAnAppointmentRequestButton;
//
//    @FindBy(xpath = "//*[.='MY PAGES(PATIENT)']")
//    public WebElement myPagesButtonPatient;
//
//
//
//    //------------------ US_27 -----------------
//    @FindBy(xpath = "//span[.='CONTACT']")
//    public WebElement contactIcon;
//
//    //------------------ US_19 -----------------
//    @FindBy(xpath = "//span[.='Physician']")
//    public WebElement physicianLink;
//
//
//
//    //------------------ US_20 -----------------
//    @FindBy(xpath = "(//span[.='Staff'])[1]")
//    public WebElement staffLink;
//
//   @FindBy(xpath = "(//span[.='Country'])[1]")
//    public WebElement countryLink;
//
//
//    @FindBy(xpath = "(//span[.='State/City'])[1]")
//    public WebElement stateOrCityLink;


}