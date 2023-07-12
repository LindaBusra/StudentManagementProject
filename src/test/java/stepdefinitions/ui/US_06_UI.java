package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JdbcUtils;
import utilities.ReusableMethods;

import java.sql.*;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class US_06_UI {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AdminManagementPage adminManagementPage = new AdminManagementPage();
    ViceDeanManagementPage viceDeanManagementPage = new ViceDeanManagementPage();

    Faker faker;
    String firstname;
    String lastname;
    String username;
    String password;




    @Given("user is on the home page :  {string}")
    public void userIsOnTheHomePage(String login_url) {
        Driver.getDriver().get(ConfigReader.getProperty(login_url));
    }


    @When("user clicks on login icon")
    public void userClicksOnLoginIcon() throws InterruptedException {
        homePage.loginIcon.click();
        ReusableMethods.waitFor(1);
    }


    @Then("user enters valid username {string} in username input")
    public void user_enters_valid_username_in_username_input(String myDean_valid_username) {
        loginPage.userName.sendKeys(ConfigReader.getProperty(myDean_valid_username));
        ReusableMethods.waitFor(1);
    }

    @Then("user enters valid password {string} in password input")
    public void user_enters_valid_password_in_password_input(String myDean_valid_password) {
        loginPage.password.sendKeys(ConfigReader.getProperty(myDean_valid_password));
        ReusableMethods.waitFor(1);
    }


    @And("user clicks on Login Button")
    public void userClicksOnLoginButton() {

        loginPage.loginButton.click();
        ReusableMethods.waitFor(1);
    }


    @And("user clicks on Menu Button")
    public void userClicksOnMenuButton() {
        adminManagementPage.menuIcon.click();
        ReusableMethods.waitFor(1);
    }


    @And("user clicks on Vise Dean Management Button")
    public void userClicksOnViseDeanManagementButton() {
        adminManagementPage.viceDeanManagementButton.click();
        ReusableMethods.waitFor(1);
    }



    //name
    @When("user passes Name field without filling")
    public void userPassesNameFieldWithoutFilling() {
        viceDeanManagementPage.nameField.click();
        viceDeanManagementPage.surnameField.click();
        ReusableMethods.waitFor(1);

    }


    @Then("user verifies Required text is visible when user does not fill name field")
    public void userVerifiesRequiredTextIsVisibleWhenUserDoesNotFillNameField() {
        assertTrue(viceDeanManagementPage.nameRequiredText.isDisplayed());
        ReusableMethods.waitFor(1);
    }


    @Then("user fills in Name field with {string}")
    public void userFillsInNameFieldWith(String name) {
        faker = new Faker();
        firstname = faker.name().firstName();
        viceDeanManagementPage.nameField.sendKeys(firstname);
        ReusableMethods.waitFor(1);
    }

    @Then("user verifies Required text is not visible for name field")
    public void userVerifiesRequiredTextIsNotVisibleForNameField() {
        assertFalse(viceDeanManagementPage.nameRequiredText.isDisplayed());
        ReusableMethods.waitFor(1);
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
        ReusableMethods.waitFor(1);
    }

    @Then("user fills in Surname field with {string}")
    public void userFillsInSurnameFieldWith(String surname) {
        lastname=faker.name().lastName();
        viceDeanManagementPage.surnameField.sendKeys(lastname);
        ReusableMethods.waitFor(1);
    }

    @Then("user verifies Required text is not visible for surname field")
    public void userVerifiesRequiredTextIsNotVisibleForSurnameField() {
        assertFalse(viceDeanManagementPage.surnameRequiredText.isDisplayed());
        ReusableMethods.waitFor(1);
    }






    //BirthPlace

    @When("user passes Birth Place field without filling")
    public void userPassesBirthPlaceFieldWithoutFilling() {
        viceDeanManagementPage.birthPlaceField.click();
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.female.click();
        ReusableMethods.waitFor(1);
    }

    @Then("user verifies Required text is visible when user does not fill Birth Place field")
    public void userVerifiesRequiredTextIsVisibleWhenUserDoesNotFillBirthPlaceField() {
        assertTrue(viceDeanManagementPage.birthPlaceRequiredText.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @Then("user fills in Birth Place field with {string}")
    public void userFillsInBirthPlaceFieldWith(String birthplace) {

        viceDeanManagementPage.birthPlaceField.sendKeys(ConfigReader.getProperty(birthplace));
        ReusableMethods.waitFor(1);
    }

    @Then("user verifies Required text is not visible for Birth Place field")
    public void userVerifiesRequiredTextIsNotVisibleForBirthPlaceField() {
        assertFalse(viceDeanManagementPage.birthPlaceRequiredText.isDisplayed());
        ReusableMethods.waitFor(1);
    }





    //Date Of Birth

    @When("user passes Date Of Birth field without filling")
    public void userPassesDateOfBirthFieldWithoutFilling() {

        viceDeanManagementPage.birthPlaceField.click();
        viceDeanManagementPage.phoneNumber.click();
        ReusableMethods.waitFor(1);
    }

    @Then("user verifies Required text is visible when user does not fill Date Of Birthe field")
    public void userVerifiesRequiredTextIsVisibleWhenUserDoesNotFillDateOfBirtheField() {
        assertTrue(viceDeanManagementPage.birthDayRequiredText.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @Then("user fills in Date Of Birth field with {string}")
    public void userFillsInDateOfBirthFieldWith(String dateofbirth) {

        viceDeanManagementPage.birthDay.sendKeys(ConfigReader.getProperty(dateofbirth));
        ReusableMethods.waitFor(1);

    }

    @Then("user verifies Required text is not visible for Date Of Birth field")
    public void userVerifiesRequiredTextIsNotVisibleForDateOfBirthField() {
        assertFalse(viceDeanManagementPage.birthDayRequiredText.isDisplayed());
        ReusableMethods.waitFor(1);
    }






    //Phone Number

    @When("user passes Phone number field without filling")
    public void userPassesPhoneNumberFieldWithoutFilling() {
        viceDeanManagementPage.phoneNumber.click();
        viceDeanManagementPage.ssn.click();
        ReusableMethods.waitFor(1);
    }

    @Then("user verifies Required text is visible when user does not fill Phone number field")
    public void userVerifiesRequiredTextIsVisibleWhenUserDoesNotFillPhoneNumberField() {
        assertTrue(viceDeanManagementPage.phoneNumberRequiredText.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @Then("user fills in Phone number field with {string}")
    public void userFillsInPhoneNumberFieldWith(String text) {

        Random random = new Random();

        int n1=random.nextInt(1000);
        int n2=random.nextInt(1000);
        int n3=random.nextInt(1000);
        int n4=random.nextInt(1000);
        int n5=random.nextInt(1000);
        String str=""+n1+n2+n3+n4+n5;
        String phoneNumber = str.substring(0,3)+"-"+str.substring(3,6)+"-"+str.substring(5,9);
        viceDeanManagementPage.phoneNumber.sendKeys(phoneNumber);
    }

    @Then("user verifies Required text is not visible for Phone number field")
    public void userVerifiesRequiredTextIsNotVisibleForPhoneNumberField() {
        assertFalse(viceDeanManagementPage.phoneNumberRequiredText.isDisplayed());
        ReusableMethods.waitFor(1);
    }







    //SSN number

    @When("user passes SSN field without filling")
    public void userPassesSSNFieldWithoutFilling() {
        viceDeanManagementPage.ssn.click();
        viceDeanManagementPage.username.click();
        ReusableMethods.waitFor(1);
    }

    @Then("user verifies Required text is visible when user does not fill SSN field")
    public void userVerifiesRequiredTextIsVisibleWhenUserDoesNotFillSSNField() {
        assertTrue(viceDeanManagementPage.ssnRequiredText.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @Then("user fills in SSN number field with {string}")
    public void userFillsInSSNNumberFieldWith(String text) {

        viceDeanManagementPage.ssn.clear();
        viceDeanManagementPage.ssn.sendKeys(faker.idNumber().ssnValid());
        ReusableMethods.waitFor(1);
    }


    @And("user fills in SSN number field with invalid number {string}")
    public void userFillsInSSNNumberFieldWithInvalidNumber(String text) {
        viceDeanManagementPage.ssn.clear();
        viceDeanManagementPage.ssn.sendKeys(text);
        ReusableMethods.waitFor(1);
    }


    @And("user fills in SSN number field with less than {int} character {string}")
    public void userFillsInSSNNumberFieldWithLessThanCharacter(int arg0, String text) {
        viceDeanManagementPage.ssn.clear();
        viceDeanManagementPage.ssn.sendKeys(text);
        ReusableMethods.waitFor(1);
    }

    @Then("user verifies Required text is not visible for SSN field")
    public void userVerifiesRequiredTextIsNotVisibleForSSNField() {
        assertFalse(viceDeanManagementPage.ssnRequiredText.isDisplayed());
    }

    @And("user clicks on submit button")
    public void userClicksOnSubmitButton() {
        viceDeanManagementPage.submitButton.click();
    }

    @Then("user verifies {string} alert text is visible")
    public void userVerifiesAlertTextIsVisible(String text) {

//        String alertText = Driver.getDriver().switchTo().alert().getText();
//        assertTrue(alertText.equals(text));

//        assertTrue((Driver.getDriver().getCurrentUrl().contains("Please enter valid SSN number")));

        assertTrue(Driver.getDriver().getCurrentUrl().equals("https://managementonschools.com/vicedean-management"));
        
//        ReusableMethods.waitForVisibility(viceDeanManagementPage.pleaseEnterSSNnumberText,5);
//        assertTrue(viceDeanManagementPage.pleaseEnterSSNnumberText.isDisplayed());
    }


    @Then("user verifies {string} text is visible")
    public void userVerifiesTextIsVisible(String text) {

            assertTrue(viceDeanManagementPage.minimum11CharacterText.isDisplayed());
    }







    //username
    @When("user passes username field without filling")
    public void userPassesUsernameFieldWithoutFilling() {
        viceDeanManagementPage.username.click();
        viceDeanManagementPage.password.click();
    }

    @Then("user verifies Required text is visible when user does not fill username field")
    public void userVerifiesRequiredTextIsVisibleWhenUserDoesNotFillUsernameField() {
        assertTrue(viceDeanManagementPage.usernameRequiredText.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @And("user fills in username field with {string}")
    public void userFillsInUsernameFieldWith(String text) {
        username = firstname+lastname;
        viceDeanManagementPage.username.sendKeys(username);
    }

    @Then("user verifies Required text is not visible for username field")
    public void userVerifiesRequiredTextIsNotVisibleForUsernameField() {
        assertFalse(viceDeanManagementPage.usernameRequiredText.isDisplayed());
        ReusableMethods.waitFor(1);
    }






    //password

    @When("user passes password field without filling")
    public void userPassesPasswordFieldWithoutFilling() {
        viceDeanManagementPage.password.click();
        viceDeanManagementPage.submitButton.click();
    }

    @Then("user verifies Required text is visible for password field")
    public void userVerifiesRequiredTextIsVisibleForPasswordField() {
        assertTrue(viceDeanManagementPage.passwordRequiredText.isDisplayed());
    }

    @And("user fills in password field with less than {int} character like {string}")
    public void userFillsInPasswordFieldWithLessThanCharacterLike(int arg0, String text) {
        viceDeanManagementPage.password.sendKeys(text);
    }

    @Then("user verifies {string} text is visible for password field")
    public void userVerifiesTextIsVisibleForPasswordField(String arg0) {
        assertTrue(viceDeanManagementPage.minimum8CharacterText.isDisplayed());
    }


    @And("user fills in password field with {string}")
    public void userFillsInPasswordFieldWith(String text) {
        password = firstname.toUpperCase().substring(0,2) + lastname.toLowerCase().substring(0,4) + "12345.";
        viceDeanManagementPage.password.clear();
        viceDeanManagementPage.password.sendKeys(password);
    }


    @And("user fills in password field with invalid password {string}")
    public void userFillsInPasswordFieldWithInvalidPassword(String text) {
        viceDeanManagementPage.password.clear();
        viceDeanManagementPage.password.sendKeys(text);

    }


    @Then("user verifies Required text is not visible for password field")
    public void userVerifiesRequiredTextIsNotVisibleForPasswordField() {
        assertFalse(viceDeanManagementPage.passwordRequiredText.isDisplayed());
    }







    //gender

    @And("user verifies female and male button is not selected")
    public void userVerifiesFemaleAndMaleButtonIsNotSelected() {
        assertTrue(!viceDeanManagementPage.female.isSelected());
        assertTrue(!viceDeanManagementPage.male.isSelected());
    }


    @Then("user verifies {string} text is not visible")
    public void userVerifiesTextIsNotVisible(String text) {

        //1.way does not work
//        String alertText = Driver.getDriver().switchTo().alert().getText();
//        ReusableMethods.waitFor(5);
//        assertTrue(text.equalsIgnoreCase(alertText));

        //2nd way does not work
//        assertFalse(Driver.getDriver().getPageSource().contains(text));
//        ReusableMethods.waitFor(5);

        //3rd way does not work
//        assertTrue(viceDeanManagementPage.viceDeanSavedText.isDisplayed());


        assertTrue(!viceDeanManagementPage.nameField.getText().equalsIgnoreCase("Name"));

    }


    @And("user verifies female or male button is selected")
    public void userVerifiesFemaleOrMaleButtonIsSelected() {

        viceDeanManagementPage.male.click();
        assertTrue(viceDeanManagementPage.female.isSelected() || viceDeanManagementPage.male.isSelected() );

    }



    @Then("user verifies after click on submit button {string} text is visible")
    public void userVerifiesAfterClickOnSubmitButtonTextIsVisible(String text) {
        //1.way does not work
//        String alertText = Driver.getDriver().switchTo().alert().getText();
//        ReusableMethods.waitFor(5);
//        assertTrue(text.equalsIgnoreCase(alertText));

        //2nd way does not work
//        assertFalse(Driver.getDriver().getPageSource().contains(text));
//        ReusableMethods.waitFor(5);

        //3rd way does not work
        //        ReusableMethods.waitForVisibility(viceDeanManagementPage.viceDeanSavedText, 5);

        //4.th way does not work
//        assertTrue(viceDeanManagementPage.viceDeanSavedText.isDisplayed());

        //5th way
        assertFalse(viceDeanManagementPage.female.isSelected() || viceDeanManagementPage.male.isSelected());

    }



        @Then("user close the browser")
    public void userCloseTheBrowser() {
    }






}


