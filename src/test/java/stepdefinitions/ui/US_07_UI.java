package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.*;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US_07_UI {


    AdminManagementPage adminManagementPage = new AdminManagementPage();
    ContactGetAllPage contactGetAllPage = new ContactGetAllPage();


    @And("user clicks on Contact Get All Button")
    public void userClicksOnContactGetAllButton() {
        adminManagementPage.contactGetAllButton.click();
    }


    @Then("user verifies Name, Email, Date, subject, Message fields are visible")
    public void userVerifiesNameEmailDateSubjectMessageFieldsAreVisible() {

        assertTrue(contactGetAllPage.name.isDisplayed());
        assertTrue(contactGetAllPage.email.isDisplayed());
        assertTrue(contactGetAllPage.date.isDisplayed());
        assertTrue(contactGetAllPage.subject.isDisplayed());
        assertTrue(contactGetAllPage.message.isDisplayed());
    }


}


