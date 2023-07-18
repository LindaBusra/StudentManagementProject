package stepdefinitions.ui;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class US_13_UI {


    AdminManagementPage adminManagementPage = new AdminManagementPage();
    LessonPage lessonPage = new LessonPage();
    TeacherPage teacherPage = new TeacherPage();
    Faker faker = new Faker();
    String name, surname, username, password, birthday, birthPlace, phoneNumber, ssn, email;
    List<WebElement> list;
    int sizeOfList;



    @And("user clicks on Teacher Management Button")
    public void userClicksOnTeacherManagementButton() {
//        lessonPage.teacherManagement.click();
        ReusableMethods.clickWithJS(lessonPage.teacherManagement);
    }

    @When("user selects the lesson that the teacher will enter")
    public void userSelectsTheLessonThatTheTeacherWillEnter() {
//        WebElement dropDown = Driver.getDriver().findElement(By.xpath("//div[@class=' css-19bb58m']"));
//        dropDown.click();
//
//        Select select = new Select(dropDown);
//        String lesson = "Phyton";
//        select.selectByVisibleText(lesson);

//        assertTrue(Driver.getDriver().findElement(By.xpath("(//*[.='Phyton'])[5]")).getText().equals(lesson));
//        assertTrue(Driver.getDriver().findElement(By.xpath("//div[@class=' css-13cymwt-control']")).getText().contains(lesson));
        Driver.getDriver().findElement(By.xpath("//div[@id='react-select-2-placeholder']")).sendKeys("Selenium");

    }

    @And("user verifies Reguired text is visible before enter the name")
    public void userVerifiesReguiredTextIsVisibleBeforeEnterTheName() {
        teacherPage.submitButton.click();
        assertTrue(teacherPage.requiredText.isDisplayed());
        list = Driver.getDriver().findElements(By.xpath("//*[.='Required']"));
        sizeOfList = list.size();
        System.out.println("sizeOfList: " + sizeOfList);
    }

    @Then("user enters the name")
    public void userEntersTheName() {
        name = faker.name().firstName();
        teacherPage.nameField.sendKeys(name);
    }


    @And("user verifies Reguired text is visible before enter the surname")
    public void userVerifiesReguiredTextIsVisibleBeforeEnterTheSurname() {
        ReusableMethods.waitFor(1);
        assertTrue(teacherPage.requiredText.isDisplayed());
    }

    @Then("user enters the surname")
    public void userEntersTheSurname() {
        surname = faker.name().lastName();
        teacherPage.surnameField.sendKeys(surname);
    }


    @And("user verifies Reguired text is visible before enter the Birth Place")
    public void userVerifiesReguiredTextIsVisibleBeforeEnterTheBirthPlace() {
        ReusableMethods.waitFor(1);
        assertTrue(teacherPage.requiredText.isDisplayed());
    }

    @Then("user enters the Birth Place")
    public void userEntersTheBirthPlace() {
        teacherPage.birthPlaceField.sendKeys("Norway");
    }



    @And("user verifies Reguired text is visible before enter the Email")
    public void userVerifiesReguiredTextIsVisibleBeforeEnterTheEmail() {
        ReusableMethods.waitFor(1);
        assertTrue(teacherPage.requiredText.isDisplayed());
    }

    @Then("user enters the Email")
    public void userEntersTheEmail() {
        email = name + "." + surname + "@gmail.com";
        teacherPage.emailField.sendKeys(email);
    }



    @And("user verifies Reguired text is visible before enter the Phone Number")
    public void userVerifiesReguiredTextIsVisibleBeforeEnterThePhoneNumber() {
        assertTrue(teacherPage.requiredText.isDisplayed());
    }

    @Then("user enters the Phone Number")
    public void userEntersThePhoneNumber() {

        Random random = new Random();

        int n1=random.nextInt(1000);
        int n2=random.nextInt(1000);
        int n3=random.nextInt(1000);
        int n4=random.nextInt(1000);
        int n5=random.nextInt(1000);
        String str=""+n1+n2+n3+n4+n5;
        phoneNumber = str.substring(0,3)+"-"+str.substring(3,6)+"-"+str.substring(5,9);

        //or
//        String phoneNumber = faker.phoneNumber().cellPhone();
        
        teacherPage.phoneNumberField.sendKeys(phoneNumber);
    }

    
    @Then("user clicks on Is Advisor Teacher option")
    public void userClicksOnIsAdvisorTeacherOption() {
        teacherPage.isAdvisorTeacherField.click();
    }

    @And("user verifies Is Advisor Teacher option is selected")
    public void userVerifiesIsAdvisorTeacherOptionIsSelected() {
        assertTrue(teacherPage.isAdvisorTeacherField.isSelected());
    }

    @Then("user clicks on male or female radio button")
    public void userClicksOnMaleOrFemaleRadioButton() {

        teacherPage.femaleRadioButton.click();
        assertTrue(teacherPage.femaleRadioButton.isSelected() || teacherPage.maleRadioButton.isSelected());
    }

    @And("user verifies Reguired text is visible before enter the Date Of Birth")
    public void userVerifiesReguiredTextIsVisibleBeforeEnterTheDateOfBirth() {
        assertTrue(teacherPage.requiredText.isDisplayed());
    }

    @Then("user enters the Date Of Birth")
    public void userEntersTheDateOfBirth() {
        teacherPage.birthDayField.sendKeys("01.01.2000");
    }


    @When("user enters the SSN number which is less than {int} characters")
    public void userEntersTheSSNNumberWhichIsLessThanCharacters(int arg0) {
        teacherPage.ssnField.sendKeys("562-55-4");
    }

    @Then("user verifies Minimum {int} character text is visible")
    public void userVerifiesMinimumCharacterTextIsVisible(int arg0) {
        assertTrue(teacherPage.minimum11CharacterText.isDisplayed());
    }

    @And("user enters a valid SSN Number")
    public void userEntersAValidSSNNumber() {
        teacherPage.ssnField.clear();
        ssn = faker.idNumber().ssnValid();
        teacherPage.ssnField.sendKeys(ssn);
    }


    @And("user verifies Reguired text is visible before enter the SSN Number")
    public void userVerifiesReguiredTextIsVisibleBeforeEnterTheSSNNumber() {
        assertTrue(teacherPage.requiredText.isDisplayed());
    }

    @When("user enters an invalid SSN number")
    public void userEntersAnInvalidSSNNumber() {
        teacherPage.ssnField.clear();
        teacherPage.ssnField.sendKeys("9912345678899");
    }

    @And("user clicks on submit button for create a new teacher")
    public void userClicksOnSubmitButtonForCreateANewTeacher() {
        teacherPage.submitButton.click();
    }

    @Then("user verifies Please enter valid SSN number text is visible")
    public void userVerifiesPleaseEnterValidSSNNumberTextIsVisible() {
        assertTrue(teacherPage.enterValidSSNText.isDisplayed());
    }


    @And("user verifies Reguired text is visible before enter the Username")
    public void userVerifiesReguiredTextIsVisibleBeforeEnterTheUsername() {
        assertTrue(teacherPage.requiredText.isDisplayed());
    }

    @Then("user enters the Username")
    public void userEntersTheUsername() {
        username = name+"."+surname;
        teacherPage.usernameField.sendKeys(username);
    }

    @And("user verifies Reguired text is visible before enter the Password")
    public void userVerifiesReguiredTextIsVisibleBeforeEnterThePassword() {
        assertTrue(teacherPage.requiredText.isDisplayed());
    }

    @Then("user enters the Password")
    public void userEntersThePassword() {
        password = name.toUpperCase().substring(0,2)+surname.toLowerCase().substring(0,3)+"1234.";
        teacherPage.passwordField.sendKeys(password);
    }
}


