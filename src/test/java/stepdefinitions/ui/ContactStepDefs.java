package stepdefinitions.ui;

import base_url.StudentManagementBaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.ContactPage;
import pojos.contactPojos.Root;
import utilities.ReusableMethods;

import static base_url.StudentManagementBaseUrlWithoutAnnotation.spec;
import static io.restassured.RestAssured.given;
import static base_url.StudentManagementBaseUrl.*;

public class ContactStepDefs {
    ContactPage contactPage = new ContactPage();
    Faker faker = new Faker();
    String fakerEmail = faker.internet().emailAddress();
    Response response;


    @When("User enters name into name field")
    public void user_enters_name_into_name_field() {
        contactPage.name.sendKeys(faker.name().name());
    }

    @When("User enters email into email field")
    public void user_enters_email_into_email_field() {
        contactPage.email.sendKeys(fakerEmail);
    }

    @When("User enters subject into subject field")
    public void user_enters_subject_into_subject_field() {
        contactPage.subject.sendKeys(faker.lorem().characters(5,16));
    }

    @When("User enters message into message field")
    public void user_enters_message_into_message_field() {
        contactPage.message.sendKeys(faker.lorem().sentence());
    }

    @When("User clicks the Send Message button")
    public void user_clicks_the_send_message_button() {
        //contactPage.sendButton.click();
        ReusableMethods.clickWithJS(contactPage.sendButton);
    }


    @Then("User verify success message is displayed")
    public void userVerifySuccessMessageIsDisplayed() {
        Assert.assertTrue(contactPage.successAlert.isDisplayed());

    }

    @And("User sends get request from API")
    public void userSendsGetRequestFromAPI() {
        String getUrl = "https://managementonschools.com/app/contactMessages/searchByEmail";

        response = given().
                header("Authorization",ReusableMethods.getToken()).
                when().get("https://managementonschools.com/app/contactMessages/searchByEmail?email="+fakerEmail);


    }

    @Then("User verifies emails")
    public void userVerifiesEmails() {

        Root actual = response.as(Root.class);
        Assert.assertTrue(actual.content.toString().contains(fakerEmail));

    }
}
