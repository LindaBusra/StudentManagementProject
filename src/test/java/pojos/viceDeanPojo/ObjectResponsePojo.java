package pojos.viceDeanPojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ObjectResponsePojo {

    private String birthDay;
    private String birthPlace;
    private String gender;
    private String name;
    private String phoneNumber;
    private String ssn;
    private String surname;
    private int userId;
    private String username;



    //constructor

    public ObjectResponsePojo() {
    }

    public ObjectResponsePojo(String birthDay, String birthPlace, String gender, String name, String phoneNumber, String ssn, String surname, int userId, String username) {
        this.birthDay = birthDay;
        this.birthPlace = birthPlace;
        this.gender = gender;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.ssn = ssn;
        this.surname = surname;
        this.userId = userId;
        this.username = username;
    }

    //getter-setter

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    //toString


    @Override
    public String toString() {
        return "ObjectResponsePojo{" +
                "birthDay='" + birthDay + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", ssn='" + ssn + '\'' +
                ", surname='" + surname + '\'' +
                ", userId=" + userId +
                ", username='" + username + '\'' +
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