package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JdbcUtils;
import utilities.ReusableMethods;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class US_02_UI {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AdminManagementPage adminManagementPage = new AdminManagementPage();
    GuestUserPage guestUserPage = new GuestUserPage();




    @And("user clicks on GuestUser Button")
    public void userClicksOnGuestUserButton() {

//        Driver.getDriver().navigate().to("https://managementonschools.com/guest-user");   //it does not work

//        guestUserPage.guestUserButton.click();                                            //it does not work

        ReusableMethods.clickWithJS(adminManagementPage.guestUserButton);                   //it does not work

        ReusableMethods.waitFor(2);
    }


    @Then("user verifies Name, Phone Number, SSN and User Name information field is visible")
    public void userVerifiesNamePhoneNumberSSNAndUserNameInformationFieldIsVisible() {

        assertTrue(guestUserPage.nameField.isDisplayed());
        assertTrue(guestUserPage.phoneNumberField.isDisplayed());
        assertTrue(guestUserPage.ssnField.isDisplayed());
        assertTrue(guestUserPage.userNameField.isDisplayed());

    }

    @And("user clicks on delete button for first user")
    public void userClicksOnDeleteButtonForFirstUser() {
        guestUserPage.deleteButton.click();
    }

    @Then("user verifies {string} text is visible after deleting")
    public void userVerifiesTextIsVisibleAfterDeleting(String arg0) {
        assertTrue(Driver.getDriver().switchTo().alert().getText().equalsIgnoreCase(" Guest User deleted Successful"));
    }


}


