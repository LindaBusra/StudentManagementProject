@US_009_TC04_API
Feature: US_09 Vice Deans should be able to create a lesson.  (Lessons - Add Lesson)

#  USER STORY-09 Vice Deans should be able to view the lesson list and make updates #(Lessons - Lesson List)

#  Acceptance Criteria
#  Vice Dean should be able to view the Lesson Name, Compulsory and Credit Score created.
#  Vice Dean should be able to delete the lesson.
#  Vice Dean should be able to update the lesson information.


  Scenario: Vice Deans should be able to view the lesson list and make updates #(Lessons - Lesson List)
    And User sets the expected data for create lesson
    And User sends the post request for create lesson and gets the response
    Then user verifies that status code is 200
    When user send delete request with lessonId
    When user makes verification for delete operation

