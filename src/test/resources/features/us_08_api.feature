@US_008_TC04_API
Feature: US_08 Vice Deans should be able to create a lesson.  (Lessons - Add Lesson)


  Scenario: Vice Deans should be able to create a lesson.   (Lessons - Add Lesson)
    And User sets the expected data for create lesson
    And User sends the post request for create lesson and gets the response
    Then user verifies that status code is 200
    And user sends get request and get the response with lessonId
    Then user verifies that status code is 200 for getting response with lessonId
    And user does assertion according to Get request

#9. satirda hata aliyorum!!!!!!!!!!!