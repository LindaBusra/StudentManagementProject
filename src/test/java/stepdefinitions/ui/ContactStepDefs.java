package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ContactPage;
import utilities.ReusableMethods;

public class ContactStepDefs {
    ContactPage contactPage = new ContactPage();
    Faker faker = new Faker();


    @When("User enters name into name field")
    public void user_enters_name_into_name_field() {
        contactPage.name.sendKeys(faker.name().name());
    }

    @When("User enters email into email field")
    public void user_enters_email_into_email_field() {
        contactPage.email.sendKeys(faker.internet().emailAddress());
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
}
