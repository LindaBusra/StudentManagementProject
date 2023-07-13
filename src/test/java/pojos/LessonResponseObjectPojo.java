package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonResponseObjectPojo {


    private int creditScore;
    private String lessonName;
    private boolean compulsory;



    //constructor

    public LessonResponseObjectPojo() {
    }

    public LessonResponseObjectPojo(int creditScore, String lessonName, boolean compulsory) {
        this.creditScore = creditScore;
        this.lessonName = lessonName;
        this.compulsory = compulsory;
    }


//getter-setter

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

    public boolean isCompulsory() {
        return compulsory;
    }

    public void setCompulsory(boolean compulsory) {
        this.compulsory = compulsory;
    }


    //toString


    @Override
    public String toString() {
        return "LessonResponseObjectPojo{" +
                "creditScore=" + creditScore +
                ", lessonName='" + lessonName + '\'' +
                ", compulsory=" + compulsory +
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