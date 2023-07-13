@US_08_smoke_test
Feature: US_08 Vice Deans should be able to create a lesson.  (Lessons - Add Lesson)



  @US_008_TC04_API
  Scenario: Vice Deans should be able to create a lesson.   (Lessons - Add Lesson)
#    And User sets the expected data for create lesson
    And User sends the post request for create lesson and gets the response
#    Then user verifies that status code is 200
#    And user does assertion according to post request
#    And User sends the Get request and gets the response for created lesson
#    Then user verifies that status code is 200 for get request
    And user does assertion according to Get request

