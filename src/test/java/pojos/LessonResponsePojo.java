package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonResponsePojo {


    private String message;
    private String httpStatus;
    private LessonResponseObjectPojo object;



    //constructor

    public LessonResponsePojo() {
    }

    public LessonResponsePojo(String message, String httpStatus, LessonResponseObjectPojo object) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.object = object;
    }


    //getter-setter

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    public LessonResponseObjectPojo getObject() {
        return object;
    }

    public void setObject(LessonResponseObjectPojo object) {
        this.object = object;
    }


    //toString


    @Override
    public String toString() {
        return "LessonResponsePojo{" +
                "message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                ", object=" + object +
                '}';
    }
}

/*

send body:
{
  "compulsory": true,
  "creditScore": 200,
  "lessonName": "Norwegian3"
}



response body:
{
    "object": {
        "lessonId": 1575,
        "lessonName": "Norwegian3",
        "creditScore": 200,
        "compulsory": true
    },
    "message": "Lesson Created",
    "httpStatus": "OK"
}

 */