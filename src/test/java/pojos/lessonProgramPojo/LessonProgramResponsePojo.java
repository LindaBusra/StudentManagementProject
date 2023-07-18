package pojos.lessonProgramPojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonProgramResponsePojo {


    private Object object;
    private String message;
    private String httpStatus;



    //constructor
    public LessonProgramResponsePojo() {
    }

    public LessonProgramResponsePojo(Object object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

//getter-setter

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

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


    //toString


    @Override
    public String toString() {
        return "LessonProgramResponsePojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}

/*

send body:
/*
{
  "day": "MONDAY",
  "educationTermId": 2,
  "lessonIdList": [
    2
  ],
  "startTime": "15:00",
  "stopTime": "18:00"
}




response body:
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
