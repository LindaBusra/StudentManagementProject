package stepdefinitions.ui;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
public class US_02_UI {


    AdminManagementPage adminManagementPage = new AdminManagementPage();
    GuestUserPage guestUserPage = new GuestUserPage();




    @And("user clicks on GuestUser Button")
    public void userClicksOnGuestUserButton() {

//        Driver.getDriver().get("https://managementonschools.com/guest-user");       //it does not work
//        adminManagementPage.guestUserButton.click();                                            //it does not work
//        ReusableMethods.clickWithJS(adminManagementPage.guestUserButton);                   //it does not work
        ReusableMethods.clickWithJS(guestUserPage.guestUserButton);


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


