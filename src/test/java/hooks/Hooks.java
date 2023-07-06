package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import static base_url.StudentManagementBaseUrlWithoutAnnotation.setUp;

public class Hooks {

    //Hooks is used to run before and after each Scenario and Scenario Outline
    @Before//import io.cucumber.java.Before;
    public void setUpScenario() {
        System.out.println("Before Scenario Method");
    }

    @After//import io.cucumber.java.After;
    public void tearDownScenario(Scenario scenario) {
        System.out.println("After Scenario Method");
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) (Driver.getDriver())).getScreenshotAs(OutputType.BYTES);
            scenario.attach(failedScreenshot, "image/png", "failed_scenario" + scenario.getName());
            Driver.closeDriver();
        }
    }

    //This Before hooks only runs for @smoke_tests tagged scenarios
    @Before("@smoke_tests")
    public void setUpSmokeScenarios() {
        System.out.println("Run Before Only Smoke Test Scenario");
    }

    //This After hooks only runs for @smoke_tests tagged scenarios
    @After("@smoke_tests")
    public void tearDownSmokeScenarios() {
        System.out.println("Run After Only Smoke Test Scenario");
    }




    @Before("@US_06_TC_01_Api")       //example
    public void beforeApi(){
        setUp();
    }

    @Before("@US_06_TC_01_Api")        //example
    public void beforeApiForUS06(){
        setUp();
    }
}