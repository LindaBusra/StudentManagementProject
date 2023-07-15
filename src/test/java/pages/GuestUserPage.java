package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuestUserPage {

    public GuestUserPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Guest User List
    @FindBy(xpath = "//*[.='Name']")
    public WebElement nameField;

    @FindBy(xpath = "//*[.='Phone Number']")
    public WebElement phoneNumberField;

    @FindBy(xpath = "//*[.='Ssn']")
    public WebElement ssnField;

    @FindBy(xpath = "//*[.='User Name']")
    public WebElement userNameField;

    @FindBy(className = "fa-solid fa-trash")
    public WebElement deleteButton;


    //these three are also in AdminManagementPage, I tried both of them
//    @FindBy(xpath = "//*[.='Guest User']")
//    public WebElement guestUserButton;


//    @FindBy(xpath = "(//div//a[@role='button'])[20]")
//    public WebElement guestUserButton;

//    @FindBy(linkText = "Guest User")
//    public WebElement guestUserButton;

    //-------------------------------------------------------------------

}