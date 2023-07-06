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

    @FindBy(xpath = "//*[.='Vice Dean Management']")
    public WebElement viceDeanManagementButton;




}