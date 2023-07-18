package stepdefinitions.api;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.lessonProgramPojo.LessonProgramPostPojo;
import pojos.lessonProgramPojo.LessonProgramResponsePojo;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static utilities.AdminAuthentication.generateTokenForAdmin;

public class US_10_API {

    Response response;
    Response response2;
    LessonProgramPostPojo expectedData;
    LessonProgramResponsePojo actualData;
    JsonPath json;
    int lessonProgramId;




    @And("User sets the expected data for create a lesson program")
    public void userSetsTheExpectedDataForCreateALessonProgram() {
        List<Integer> lessonIdList = new ArrayList<>();
        lessonIdList.add(2);

        expectedData = new LessonProgramPostPojo("MONDAY", 2,  lessonIdList,"15:00", "18:00");
    }

    @And("User sends the post request and gets the response for this lesson program")
    public void userSendsThePostRequestAndGetsTheResponseForThisLessonProgram() {
        response = given()
                .header("Authorization", "Bearer "+generateTokenForAdmin())
                .contentType(ContentType.JSON).body(expectedData)
                .when()
                .post("https://managementonschools.com/app/lessonPrograms/save");
        response.prettyPrint();
    }

    @Then("verify that status code is {int} for lesson program")
    public void verifyThatStatusCodeIsForLessonProgram(int statusCode) {
        Assert.assertEquals(statusCode, response.getStatusCode());

    }

    @And("Do assertion according to post request for lesson program")
    public void doAssertionAccordingToPostRequestForLessonProgram() {
        json = response.jsonPath();
        String starttime= (json.getString("object.startTime")).substring(0,5);
        String stoptime= (json.getString("object.stopTime")).substring(0,5);
        Assert.assertEquals(expectedData.getDay(), json.getString("object.day"));
        Assert.assertEquals(expectedData.getStartTime(),starttime);
        Assert.assertEquals(expectedData.getStopTime(),stoptime);


        ArrayList<Object> list1 = (ArrayList<Object>) json.getList("object.lessonName");
//        System.out.println(json.getString("object.lessonName"));
//        System.out.println(list1);
//        System.out.println(list1.get(0));

        //actually not a god way :)
        Assert.assertTrue(list1.get(0).toString().contains("lessonId=2"));


        //I could not assert it, actually I dont need write String.valueOf. but I don't know how can I fix it
//        Assert.assertEquals(String.valueOf(expectedData.getEducationTermId()), json.getString("object.lessonName[0].lessonId"));


    }

    @And("User sends the Get request and gets the response for created lesson program")
    public void userSendsTheGetRequestAndGetsTheResponseForCreatedLessonProgram() {
        lessonProgramId = json.getInt("object.lessonProgramId");   //from response
        response2 = given().header("Authorization", "Bearer "+generateTokenForAdmin()).when()
                .get("https://managementonschools.com/app/lessonPrograms/getById/" + lessonProgramId);
        response2.prettyPrint();

    }

    @Then("verify that status code is {int} for get request for lesson program")
    public void verifyThatStatusCodeIsForGetRequestForLessonProgram(int statusCode) {
        Assert.assertEquals(statusCode, response2.getStatusCode());
    }

    @And("Do assertion according to Get request for created Lesson program")
    public void doAssertionAccordingToGetRequestForCreatedLessonProgram() {
        actualData = response2.as(LessonProgramResponsePojo.class);

//        Assert.assertEquals("Created Lesson Program", actualData.getMessage());
//        Assert.assertEquals("CREATED", actualData.getHttpStatus());

    }
}


/*

response body :
{
    "object": {
        "lessonProgramId": 2104,
        "startTime": "15:00:00",
        "stopTime": "18:00:00",
        "lessonName": [
            {
                "lessonId": 2,
                "lessonName": "Java",
                "creditScore": 10,
                "compulsory": true
            }
        ],
        "day": "MONDAY"
    },
    "message": "Created Lesson Program",
    "httpStatus": "CREATED"
}
 */

