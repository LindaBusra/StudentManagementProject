package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonPostPojo {

    private boolean compulsory;
    private int creditScore;
    private String lessonName;



    //constructor

    public LessonPostPojo() {
    }

    public LessonPostPojo(boolean compulsory, int creditScore, String lessonName) {
        this.compulsory = compulsory;
        this.creditScore = creditScore;
        this.lessonName = lessonName;
    }

    //getter-setter

    public boolean isCompulsory() {
        return compulsory;
    }

    public void setCompulsory(boolean compulsory) {
        this.compulsory = compulsory;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }


    //toString


    @Override
    public String toString() {
        return "LessonPostPojo{" +
                "compulsory=" + compulsory +
                ", creditScore=" + creditScore +
                ", lessonName='" + lessonName + '\'' +
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