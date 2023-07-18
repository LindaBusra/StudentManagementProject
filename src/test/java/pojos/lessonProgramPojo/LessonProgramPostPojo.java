package pojos.lessonProgramPojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonProgramPostPojo {


    private String day;

    private Integer educationTermId;

    private List<Integer> lessonIdList;

    private String startTime;

    private String stopTime;



    //constructor
    public LessonProgramPostPojo() {
    }

    public LessonProgramPostPojo(String day, Integer educationTermId, List<Integer> lessonIdList, String startTime, String stopTime) {
        this.day = day;
        this.educationTermId = educationTermId;
        this.lessonIdList = lessonIdList;
        this.startTime = startTime;
        this.stopTime = stopTime;
    }



    //getter-setter


    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Integer getEducationTermId() {
        return educationTermId;
    }

    public void setEducationTermId(Integer educationTermId) {
        this.educationTermId = educationTermId;
    }

    public List<Integer> getLessonIdList() {
        return lessonIdList;
    }

    public void setLessonIdList(List<Integer> lessonIdList) {
        this.lessonIdList = lessonIdList;
    }

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





    //toString


    @Override
    public String toString() {
        return "LessonProgramPostPojo{" +
                "day='" + day + '\'' +
                ", educationTermId=" + educationTermId +
                ", lessonIdList=" + lessonIdList +
                ", startTime='" + startTime + '\'' +
                ", stopTime='" + stopTime + '\'' +
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