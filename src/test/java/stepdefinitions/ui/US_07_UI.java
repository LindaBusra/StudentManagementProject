package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.*;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.replaceFiltersWith;
import static org.junit.Assert.assertTrue;
import static utilities.AdminAuthentication.generateTokenForAdmin;

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


