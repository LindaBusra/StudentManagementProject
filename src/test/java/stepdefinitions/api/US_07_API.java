package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.AdminManagementPage;
import pages.ContactGetAllPage;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;
import static utilities.AdminAuthentication.generateTokenForAdmin;

public class US_07_API {


    Response response;
    JsonPath json;

    @When("user sends get request for to get all the Contact Messages")
    public void userSendsGetRequestForToGetAllTheContactMessages() {

        String url = "https://managementonschools.com/app/contactMessages/getAll?page=0&size=10&sort=date&type=desc";

        response = given().header("Authorization", "Bearer "+generateTokenForAdmin()).when()
                .get(url);
//        response.prettyPrint();
    }

    static List<Object> contactList;

    @Then("user verifies that status code is {int} for get Contact Messages")
    public void userVerifiesThatStatusCodeIsForGetContactMessages(int statusCode) {
        Assert.assertEquals(statusCode, response.getStatusCode());





    }



    @Then("user verifies {string} is between the names and {string} email in Contact Messages")
    public void userVerifiesIsBetweenTheNamesAndEmailInContactMessages(String name, String email) {

        //do assertion with a name and email
        json = response.jsonPath();
        contactList = json.getList("content");


        //just print for check
//        for(int i=0; i<contactList.size(); i++) {
//            System.out.println(contactList.get(i));
//        }
//        System.out.println(json.getList("content.name"));
//        System.out.println(json.getList("content.email"));


        assertTrue(json.getList("content.name").contains(name));
        assertTrue(json.getList("content.email").contains(email));
    }
}


