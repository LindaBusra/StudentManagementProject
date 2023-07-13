package utilities;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AdminAuthentication {

    public static String generateTokenForAdmin() {

        Map<String, Object> admin = new HashMap<>();
        admin.put("password", "12345678");
        admin.put("username", "AdminBusra");

        Response response = given().contentType(ContentType.JSON).body(admin).when().post("https://managementonschools.com/app/auth/login");
        response.prettyPrint();

        JsonPath jsonPath = response.jsonPath();
        String unFixedToken = jsonPath.getString("token");
        String token =unFixedToken.substring(7);

        return token;
    }


    public static void main(String[] args) {

        System.out.println(generateTokenForAdmin());
    }
}


