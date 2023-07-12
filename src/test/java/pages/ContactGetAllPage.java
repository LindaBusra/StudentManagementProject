package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactGetAllPage {

    public ContactGetAllPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//table//th[1]")
    public WebElement name;

    @FindBy(xpath = "//table//th[2]")
    public WebElement email;

    @FindBy(xpath = "//table//th[3]")
    public WebElement date;

    @FindBy(xpath = "//table//th[4]")
    public WebElement subject;

    @FindBy(xpath = "//table//th[5]")
    public WebElement message;



}