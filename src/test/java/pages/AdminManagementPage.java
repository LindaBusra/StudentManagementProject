package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminManagementPage {

    public AdminManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[.='Menu']")
    public WebElement menuIcon;

    @FindBy(xpath = "//a[.='Vice Dean Management']")
    public WebElement viceDeanManagementButton;

    @FindBy(xpath = "//*[.='Contact Get All']")
    public WebElement contactGetAllButton;

    //these three are also in GuestUserPage, I tried both of them
    @FindBy(xpath = "//*[.='Guest User']")
    public WebElement guestUserButton;

//    @FindBy(linkText = "Guest User")
//    public WebElement guestUserButton;




}