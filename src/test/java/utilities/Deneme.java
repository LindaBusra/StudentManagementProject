package utilities;

import com.github.javafaker.Faker;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.contactPojos.Root;

import static base_url.StudentManagementBaseUrlWithoutAnnotation.spec;
import static io.restassured.RestAssured.given;


public class Deneme {
    String fakerEmail = new Faker().internet().emailAddress();
    @Test
    public void denme(){
//        spec.pathParams("pp1","app","pp2","contactMessages","pp3","searchByEmail").
//                queryParam("email",fakerEmail);
        String getUrl = "https://managementonschools.com/app/contactMessages/searchByEmail";

        Response response = given().
                header("Authorization",ReusableMethods.getToken()).
                when().get("https://managementonschools.com/app/contactMessages/searchByEmail?email="+"alala@al.com");

        response.prettyPrint();
        JsonPath json = response.jsonPath();
        Root actual = response.as(Root.class);



        System.out.println(actual.content.toString().contains("alala@al.com"));


    }
}
