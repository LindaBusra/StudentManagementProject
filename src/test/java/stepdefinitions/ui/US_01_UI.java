package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static utilities.JSUtils.clickElementByJS;
import static utilities.JSUtils.scrollDownByJS;

public class US_01_UI {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    Faker faker = new Faker();
    String name = faker.name().firstName();
    String surname = faker.name().lastName();
    String username = name+surname;
    String password=name.toUpperCase().substring(0,1)+surname.toLowerCase().substring(0,2)+"123AB.";

    @Given("user is on the home page")
    public void user_is_on_the_home_page(){
        Driver.getDriver().get(ConfigReader.getProperty("managementonschools_url"));
    }

    @When("user clicks on registration icon")
    public void user_clicks_on_registration_icon() {
    homePage.registerIcon.click();
    ReusableMethods.waitFor(2);
    }

    @When("user is on the registration page")
    public void user_is_on_the_registration_page() {
        assertTrue(registerPage.name.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @When("user fills in Name")
    public void user_fills_in_name() {registerPage.name.sendKeys(name);
    ReusableMethods.waitFor(2);
    }

    @When("user fills in Surname")
    public void user_fills_in_surname() { registerPage.surname.sendKeys(surname);
    ReusableMethods.waitFor(2);
    }
    @When("user fills in Birth Place field")
    public void user_fills_in_birth_place_field() {
        registerPage.birthPlace.sendKeys(faker.country().capital());
        ReusableMethods.waitFor(2);}

    @When("user fills in Date Of Birth field")
    public void user_fills_in_date_of_birth_field() {
        registerPage.birthDay.sendKeys( "01.01.2000");
        ReusableMethods.waitFor(2);
    }
    @When("user fills in Phone number field")
    public void user_fills_in_phone_number_field() {
        int randNumber1 = faker.number().numberBetween(500, 600);
        int randNumber2 = faker.number().numberBetween(100, 999);
        int randNumber3 = faker.number().numberBetween(1000, 9999);
        registerPage.phoneNumber.sendKeys(randNumber1 + "-" + randNumber2 + "-" + randNumber3);
        ReusableMethods.waitFor(4);


    }
    @When("user chooses gender")
    public void user_chooses_gender() {
        clickElementByJS(registerPage.female);
    }

    @When("user fills in SSN number field")
    public void user_fills_in_ssn_number_field() {
        int randomNumber1 = faker.number().numberBetween(100, 899);
        int randomNumber2 = faker.number().numberBetween(10, 99);
        int randomNumber3 = faker.number().numberBetween(1000, 9999);
        registerPage.ssn.sendKeys(randomNumber1 + "-" + randomNumber2 + "-" + randomNumber3);
        ReusableMethods.waitFor(2);
    }

    @When("user fills in username field")
    public void user_fills_in_username_field() {

    registerPage.username.sendKeys(username);
    ReusableMethods.waitFor(2);
    }
    @When("user enters valid password field")
    public void user_enters_valid_password_field() {
        registerPage.password.sendKeys(password);
        ReusableMethods.waitFor(2);

    }

    @And("user clicks on submit button to register")
    public void userClicksOnSubmitButtonToRegister() {
        registerPage.registerButton.submit();

    }

  /*  @Then("user verifies that registration success text is visible")
    public void userVerifiesThatRegistretionSuccessTextIsVisible() {
        String alertText = Driver.getDriver().switchTo().alert().getText();
        ReusableMethods.waitFor(3);
        assertTrue(alertText.contains("Guest User"));
}
   */

    @Then("user verifies that registration is successful")
    public void userVerifiesThatRegistrationIsSuccessful() {
 //       assertTrue(Driver.getDriver().switchTo().alert().getText().contains("Guest User registered"));
        ReusableMethods.waitFor(3);
        assertFalse(registerPage.usernameRequiredText.isDisplayed());
        assertFalse(registerPage.passwordRequiredText.isDisplayed());
    }

    @Then("close the application")
    public void closeApplication() {
        Driver.closeDriver();
    }

//  US01_TC02 Scenario: Missing Name

    @When("user passes Registration Name field without filling")
    public void user_passes_registration_name_field_without_filling() {

       registerPage.name.click();
       registerPage.surname.click();
        ReusableMethods.waitFor(2);
    }

    @Then("user verifies Required text is visible as a warning")
    public void user_verifies_required_text_is_visible_as_a_warning() {

        assertTrue(registerPage.nameRequiredText.isDisplayed());
        ReusableMethods.waitFor(2);
         }

    @Then("user verifies Required text is not visible")
    public void user_verifies_required_text_is_not_visible() {
        assertFalse(registerPage.nameRequiredText.isDisplayed());

    }

    //  US01_TC03 Scenario: Missing Surname
    @When("user passes Surname  field")
    public void user_passes_surname_field() {
        registerPage.surname.click();
        registerPage.birthPlace.click();

    }
    @Then("user verifies Required text for Surname is visible as a warning")
    public void user_verifies_required_text_for_surname_is_visible_as_a_warning() {
        assertTrue(registerPage.surnameRequiredText.isDisplayed());
        ReusableMethods.waitFor(2);

    }
    @Then("user verifies that Required text  is not visible for Surname")
    public void user_verifies_that_required_text_is_not_visible_for_surname() {
        assertFalse(registerPage.surnameRequiredText.isDisplayed());
    }

//    @US01_TC04 Scenario: Missing Birth Place

    @When("user passes birth Place field")
    public void user_passes_birth_place_field() {
        registerPage.birthPlace.click();
        scrollDownByJS();
        registerPage.phoneNumber.click();

    }
    @Then("user verifies Required text for birth Place is visible as a warning")
    public void user_verifies_required_text_for_birth_place_is_visible_as_a_warning() {
        assertTrue(registerPage.birthPlaceRequiredText.isDisplayed());
        ReusableMethods.waitFor(2);

    }
    @Then("user verifies Required text for birth Place is not visible")
    public void user_verifies_required_text_for_birth_place_is_not_visible() {
        assertFalse(registerPage.birthPlaceRequiredText.isDisplayed());

    }

    //    @US01_TC05 Scenario: Missing Phone Number
    @When("user passes in Phone number field")
    public void user_passes_in_phone_number_field() {
        registerPage.phoneNumber.click();
        ReusableMethods.waitFor(2);
        clickElementByJS(registerPage.female);
        ReusableMethods.waitFor(2);
    }
    @Then("user verifies Required text for  Phone number is visible as a warning")
    public void user_verifies_required_text_for_phone_number_is_visible_as_a_warning() {
        assertTrue(registerPage.phoneNumberRequiredText.isDisplayed());
        ReusableMethods.waitFor(2);
    }
    @Then("user verifies Required text for Phone number is not visible")
    public void user_verifies_required_text_for_phone_number_is_not_visible() {
        ReusableMethods.waitFor(3);
        assertFalse(registerPage.phoneNumberRequiredText.isDisplayed());
    }

   // @US01_TC06 Missing gender
// It does not give any warning for missing gender user
    @And("user passes gender")
    public void userPassesGender() {
        clickElementByJS(registerPage.birthDay);
    }


    // @US01_TC07 Missing Date Of Birth
    @And("user passes Date Of Birth field")
    public void userPassesDateOfBirthField() {
        clickElementByJS(registerPage.birthDay);
        clickElementByJS(registerPage.ssn);
    }

    @Then("user verifies Required text for Date Of Birth is visible as a warning")
    public void userVerifiesRequiredTextForDateOfBirthIsVisibleAsAWarning() {
        assertTrue(registerPage.birthDayRequiredText.isDisplayed());
    }

    @Then("user verifies Required text for Date Of Birth is not visible")
    public void userVerifiesRequiredTextForDateOfBirthIsNotVisible() {
        assertFalse(registerPage.birthDayRequiredText.isDisplayed());
    }

    // @US01_TC08 Missing SSN
    @And("user passes SSN number field")
    public void userPassesSSNNumberField() {
        clickElementByJS(registerPage.ssn);
        clickElementByJS(registerPage.username);
    }

    @Then("user verifies Required text for SSN is visible as a warning")
    public void userVerifiesRequiredTextForSSNIsVisibleAsAWarning() {
        assertTrue(registerPage.ssnRequiredText.isDisplayed());
    }

    @Then("user verifies Required text for SSN is not visible")
    public void userVerifiesRequiredTextForSSNIsNotVisible() {
        assertFalse(registerPage.ssnRequiredText.isDisplayed());
    }

    // @US01_TC09 Missing username
    @And("user passes username field")
    public void userPassesUsernameField() {
        clickElementByJS(registerPage.username);
        clickElementByJS(registerPage.password);
    }

    @Then("user verifies Required text for username is visible as a warning")
    public void userVerifiesRequiredTextForUsernameIsVisibleAsAWarning() {
        assertTrue(registerPage.usernameRequiredText.isDisplayed());
    }


    @Then("user verifies Required text for username is not visible")
    public void userVerifiesRequiredTextForUsernameIsNotVisible() {
        assertFalse(registerPage.usernameRequiredText.isDisplayed());
    }

    // Scenario : TC_10 Missing password
    @When("user passes password field")
    public void userPassesPasswordField() {
        clickElementByJS(registerPage.password);
    }

    @Then("user verifies Required text for password  is visible as a warning")
    public void userVerifiesRequiredTextForPasswordIsVisibleAsAWarning() {
        assertTrue(registerPage.passwordRequiredText.isDisplayed());
    }

    @Then("user verifies Required text for password  is not visible")
    public void userVerifiesRequiredTextForPasswordIsNotVisible() {
        assertFalse(registerPage.passwordRequiredText.isDisplayed());
    }

    //   Scenario: TC_11 Invalid passwords with 7 digit pasword with at least 1 uppercase, 1 lowercase, 1 digit
    @When("user enters seven character  {string} with at least one uppercase, one lowercase, one digit")
    public void userEntersSevenCharacterWithAtLeastOneUppercaseOneLowercaseOneDigit(String arg0) {
        registerPage.password.sendKeys(arg0);
        ReusableMethods.waitFor(3);
    }

    @Then("user verifies Minimum eight character text is visible as a warning")
    public void userVerifiesMinimumEightCharacterTextIsVisibleAsAWarning() {
        assertTrue(registerPage.minimum8CharacterText.isDisplayed());
    }


    @When("user enters eight character {string} with at least one uppercase, one lowercase, one digit")
    public void userEntersEightCharacterWithAtLeastOneUppercaseOneLowercaseOneDigit(String arg0) {
        registerPage.password.clear();
        registerPage.password.sendKeys(arg0);
        ReusableMethods.waitFor(3);
    }

    @Then("user verifies Minimum eight character text for username is not visible")
    public void userVerifiesMinimumEightCharacterTextForUsernameIsNotVisible() {
        assertFalse(registerPage.minimum8CharacterText.isDisplayed());
    }

    //   Scenario: TC_12 Invalid passwords with 7 digit pasword with uppercase and lowercase but not with digit
    //  Invalid password is accepted
    @When("user enters eight character  {string}with  uppercase and lowercase but not with digit")
    public void userEntersEightCharacterWithUppercaseAndLowercaseButNotWithDigit(String arg0) {
        registerPage.password.clear();
        registerPage.password.sendKeys(arg0);
    }

    //   Scenario: TC_13 Invalid passwords with 9 digit password with uppercase and lowercase but not with digit
    @When("user enters nine character  {string} with at least one uppercase, one lowercase, one digit")
    public void userEntersNineCharacterWithAtLeastOneUppercaseOneLowercaseOneDigit(String arg0) {
        registerPage.password.clear();
        registerPage.password.sendKeys(arg0);
    }
}



