@US_008_TC04_API
Feature: US_08 Vice Deans should be able to create a lesson.  (Lessons - Add Lesson)


#  USER STORY-08 Vice Deans should be able to create a lesson. (Lessons - Add Lesson)
#  Acceptance Criteria
#  Vice Dean should be able to enter the name of lesson.
#  Vice Dean should be able to mark whether the course is compulsory or not.
#  Vice Dean should be able to enter the Credit Score.


  Scenario: Vice Deans should be able to create a lesson.   (Lessons - Add Lesson)
    And User sets the expected data for create lesson
    And User sends the post request for create lesson and gets the response
    Then user verifies that status code is 200
    And user sends get request and get the response with lesson name
    Then user verifies that status code is 200 for getting response with lesson name
    And user does assertion according to Get request

