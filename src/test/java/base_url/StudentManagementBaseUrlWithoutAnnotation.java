package base_url;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;


public class StudentManagementBaseUrlWithoutAnnotation {

    public static RequestSpecification spec;


    public static void setUp(){

        spec = new RequestSpecBuilder().setBaseUri("https://managementonschools.com/").build();

    }


}
