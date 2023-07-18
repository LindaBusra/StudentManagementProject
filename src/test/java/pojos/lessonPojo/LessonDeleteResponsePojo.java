package pojos.lessonPojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonDeleteResponsePojo {


    private String message;
    private String httpStatus;




    //constructor

    public LessonDeleteResponsePojo() {
    }

    public LessonDeleteResponsePojo(String message, String httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;

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




    //toString

    @Override
    public String toString() {
        return "LessonDeleteResponsePojo{" +
                "message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}

/*

{
    "message": "Lesson Deleted",
    "httpStatus": "OK"
}

 */