package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ViceDeanResponsePojo {

    private String httpStatus;
    private String message;
    private ObjectResponsePojo object;


    //constructor

    public ViceDeanResponsePojo() {
    }

    public ViceDeanResponsePojo(String httpStatus, String message, ObjectResponsePojo object) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.object = object;
    }

    //getter-setter

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ObjectResponsePojo getObject() {
        return object;
    }

    public void setObject(ObjectResponsePojo object) {
        this.object = object;
    }


    //toString


    @Override
    public String toString() {
        return "ViceDeanResponsePojo{" +
                "httpStatus='" + httpStatus + '\'' +
                ", message='" + message + '\'' +
                ", object=" + object +
                '}';
    }
}


/*
Dean Request

{
  "birthDay": "yyyy-MM-dd",
  "birthPlace": "string",
  "gender": "MALE",
  "name": "string",
  "password": "string",
  "phoneNumber": "string",
  "ssn": "string",
  "surname": "string",
  "username": "string"
}


Response from API/Postman

{
  "httpStatus": "100 CONTINUE",
  "message": "string",
  "object": {
    "birthDay": "string",
    "birthPlace": "string",
    "gender": "MALE",
    "name": "string",
    "phoneNumber": "string",
    "ssn": "string",
    "surname": "string",
    "userId": 0,
    "username": "string"
  }
}
 */