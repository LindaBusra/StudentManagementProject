package stepdefinitions.ui;

import io.cucumber.java.en.*;
import pages.*;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class US_06_UI {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AdminManagementPage adminManagementPage = new AdminManagementPage();
    viceDeanManagementPage viceDeanManagementPage = new viceDeanManagementPage();




    @Given("user is on the home page :  {string}")
    public void userIsOnTheHomePage(String url) {
        Driver.getDriver().get(url);
    }


    @When("user clicks on login icon")
    public void userClicksOnLoginIcon() throws InterruptedException {
        homePage.loginIcon.click();
        ReusableMethods.waitFor(2);
    }


    @Then("user enters valid username {string} in username input")
    public void user_enters_valid_username_in_username_input(String username) {
        loginPage.userName.sendKeys(username);
        ReusableMethods.waitFor(2);
    }

    @Then("user enters valid password {string} in password input")
    public void user_enters_valid_password_in_password_input(String password) {
        loginPage.password.sendKeys(password);
        ReusableMethods.waitFor(2);
    }


    @And("user clicks on Login Button")
    public void userClicksOnLoginButton() {

        loginPage.loginButton.click();
        ReusableMethods.waitFor(2);
    }


    @And("user clicks on Menu Button")
    public void userClicksOnMenuButton() {
        adminManagementPage.menuIcon.click();
        ReusableMethods.waitFor(2);
    }


    @And("user clicks on Vise Dean Management Button")
    public void userClicksOnViseDeanManagementButton() {
        adminManagementPage.viceDeanManagementButton.click();
        ReusableMethods.waitFor(2);
    }



    //name
    @When("user passes Name field without filling")
    public void userPassesNameFieldWithoutFilling() {
        viceDeanManagementPage.nameField.click();
        viceDeanManagementPage.surnameField.click();
        ReusableMethods.waitFor(2);

    }


    @Then("user verifies Required text is visible when user does not fill name field")
    public void userVerifiesRequiredTextIsVisibleWhenUserDoesNotFillNameField() {
        assertTrue(viceDeanManagementPage.nameRequiredText.isDisplayed());
        ReusableMethods.waitFor(2);
    }


    @Then("user fills in Name field with {string}")
    public void userFillsInNameFieldWith(String text) {
        viceDeanManagementPage.nameField.sendKeys(text);
        ReusableMethods.waitFor(2);
    }

    @Then("user verifies Required text is not visible for name field")
    public void userVerifiesRequiredTextIsNotVisibleForNameField() {
        assertFalse(viceDeanManagementPage.nameRequiredText.isDisplayed());
        ReusableMethods.waitFor(2);
    }



    //surname
    @Then("user passes Surname field without filling")
    public void userPassesSurnameFieldWithoutFilling() {
        viceDeanManagementPage.surnameField.click();
        viceDeanManagementPage.birthPlaceField.click();
    }


    @Then("user verifies Required text is visible when user does not fill surname field")
    public void userVerifiesRequiredTextIsVisibleWhenUserDoesNotFillSurnameField() {
        assertTrue(viceDeanManagementPage.surnameRequiredText.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("user fills in Surname field with {string}")
    public void userFillsInSurnameFieldWith(String text) {
        viceDeanManagementPage.surnameField.sendKeys(text);
        ReusableMethods.waitFor(2);
    }

    @Then("user verifies Required text is not visible for surname field")
    public void userVerifiesRequiredTextIsNotVisibleForSurnameField() {
        assertFalse(viceDeanManagementPage.surnameRequiredText.isDisplayed());
        ReusableMethods.waitFor(2);
    }



    //BirthPlace

    @When("user passes Birth Place field without filling")
    public void userPassesBirthPlaceFieldWithoutFilling() {
        viceDeanManagementPage.birthPlaceField.click();
        ReusableMethods.waitFor(2);
        viceDeanManagementPage.female.click();
        ReusableMethods.waitFor(2);
    }

    @Then("user verifies Required text is visible when user does not fill Birth Place field")
    public void userVerifiesRequiredTextIsVisibleWhenUserDoesNotFillBirthPlaceField() {
        assertTrue(viceDeanManagementPage.birthPlaceRequiredText.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("user fills in Birth Place field with {string}")
    public void userFillsInBirthPlaceFieldWith(String text) {
        viceDeanManagementPage.birthPlaceField.sendKeys(text);
        ReusableMethods.waitFor(2);
    }

    @Then("user verifies Required text is not visible for Birth Place field")
    public void userVerifiesRequiredTextIsNotVisibleForBirthPlaceField() {
        assertFalse(viceDeanManagementPage.birthPlaceRequiredText.isDisplayed());
        ReusableMethods.waitFor(2);
    }





    //Date Of Birth

    @When("user passes Date Of Birth field without filling")
    public void userPassesDateOfBirthFieldWithoutFilling() {

        viceDeanManagementPage.birthPlaceField.click();
        viceDeanManagementPage.phoneNumber.click();
        ReusableMethods.waitFor(2);
    }

    @Then("user verifies Required text is visible when user does not fill Date Of Birthe field")
    public void userVerifiesRequiredTextIsVisibleWhenUserDoesNotFillDateOfBirtheField() {
        assertTrue(viceDeanManagementPage.birthDayRequiredText.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("user fills in Date Of Birth field with {string}")
    public void userFillsInDateOfBirthFieldWith(String text) {
        viceDeanManagementPage.birthDay.sendKeys("29.11.2004");
        ReusableMethods.waitFor(2);

    }

    @Then("user verifies Required text is not visible for Date Of Birth field")
    public void userVerifiesRequiredTextIsNotVisibleForDateOfBirthField() {
        assertFalse(viceDeanManagementPage.birthDayRequiredText.isDisplayed());
        ReusableMethods.waitFor(2);
    }


    //Phone Number

    @When("user passes Phone number field without filling")
    public void userPassesPhoneNumberFieldWithoutFilling() {
        viceDeanManagementPage.phoneNumber.click();
        viceDeanManagementPage.ssn.click();
        ReusableMethods.waitFor(2);
    }

    @Then("user verifies Required text is visible when user does not fill Phone number field")
    public void userVerifiesRequiredTextIsVisibleWhenUserDoesNotFillPhoneNumberField() {
        assertTrue(viceDeanManagementPage.phoneNumberRequiredText.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("user fills in Phone number field with {string}")
    public void userFillsInPhoneNumberFieldWith(String text) {
        viceDeanManagementPage.phoneNumber.sendKeys(text);
    }

    @Then("user verifies Required text is not visible for Phone number field")
    public void userVerifiesRequiredTextIsNotVisibleForPhoneNumberField() {
        assertFalse(viceDeanManagementPage.phoneNumberRequiredText.isDisplayed());
        ReusableMethods.waitFor(2);
    }


    @When("user passes SSN field without filling")
    public void userPassesSSNFieldWithoutFilling() {
        viceDeanManagementPage.ssn.click();
        viceDeanManagementPage.username.click();
        ReusableMethods.waitFor(2);
    }

    @Then("user verifies Required text is visible when user does not fill SSN field")
    public void userVerifiesRequiredTextIsVisibleWhenUserDoesNotFillSSNField() {
        assertTrue(viceDeanManagementPage.ssnRequiredText.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("user fills in SSN number field with {string}")
    public void userFillsInSSNNumberFieldWith(String text) {
        viceDeanManagementPage.ssn.sendKeys(text);
        ReusableMethods.waitFor(2);
    }

    @Then("user verifies Required text is not visible for SSN field")
    public void userVerifiesRequiredTextIsNotVisibleForSSNField() {
        assertFalse(viceDeanManagementPage.ssnRequiredText.isDisplayed());
    }



    @Then("user close the browser")
    public void userCloseTheBrowser() {
        Driver.getDriver().close();
    }





}


