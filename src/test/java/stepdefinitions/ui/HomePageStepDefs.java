package stepdefinitions.ui;

import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageStepDefs {
    HomePage homePage = new HomePage();


    @When("User clicks Contact")
    public void user_clicks_contact() {
        homePage.contactIcon.click();
    }
}
