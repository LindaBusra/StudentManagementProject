package pojos.lessonProgramPojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonProgramLessonNameResponsePojo {


    private int lessonId;

    private String lessonName;

    private int creditScore;

    private boolean compulsory;


    //constructor
    public LessonProgramLessonNameResponsePojo() {
    }

    public LessonProgramLessonNameResponsePojo(int lessonId, String lessonName, int creditScore, boolean compulsory) {
        this.lessonId = lessonId;
        this.lessonName = lessonName;
        this.creditScore = creditScore;
        this.compulsory = compulsory;
    }


//getter-setter

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public boolean isCompulsory() {
        return compulsory;
    }

    public void setCompulsory(boolean compulsory) {
        this.compulsory = compulsory;
    }


    //toString


    @Override
    public String toString() {
        return "LessonProgramLessonNameResponsePojo{" +
                "lessonId=" + lessonId +
                ", lessonName='" + lessonName + '\'' +
                ", creditScore=" + creditScore +
                ", compulsory=" + compulsory +
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
