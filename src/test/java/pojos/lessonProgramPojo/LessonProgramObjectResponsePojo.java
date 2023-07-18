package pojos.lessonProgramPojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonProgramObjectResponsePojo {


 private int lessonProgramId;
    private String startTime;

    private String stopTime;

    private List<LessonProgramLessonNameResponsePojo> lessonName;

    private String day;





    //constructor
    public LessonProgramObjectResponsePojo() {
    }

    public LessonProgramObjectResponsePojo(String startTime, String stopTime, List<LessonProgramLessonNameResponsePojo> lessonName, String day) {
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.lessonName = lessonName;
        this.day = day;
    }

    //getter-setter

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public List<LessonProgramLessonNameResponsePojo> getLessonName() {
        return lessonName;
    }

    public void setLessonName(List<LessonProgramLessonNameResponsePojo> lessonName) {
        this.lessonName = lessonName;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getLessonProgramId() {
        return lessonProgramId;
    }

    public void setLessonProgramId(int lessonProgramId) {
        this.lessonProgramId = lessonProgramId;
    }
//toString


    @Override
    public String toString() {
        return "LessonProgramObjectResponsePojo{" +
                "lessonProgramId=" + lessonProgramId +
                ", startTime='" + startTime + '\'' +
                ", stopTime='" + stopTime + '\'' +
                ", lessonName=" + lessonName +
                ", day='" + day + '\'' +
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
