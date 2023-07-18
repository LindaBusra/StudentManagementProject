@US_10_smoke_test
Feature: US_10 Vice Deans should be able to create a lesson schedule. (Lesson Program - Add Lesson Program)



  @US_010_TC04_API
  Scenario: User validates the necessary request is done by Api

    And User sets the expected data for create a lesson program
    And User sends the post request and gets the response for this lesson program
    Then verify that status code is 200 for lesson program
    And Do assertion according to post request for lesson program
    And User sends the Get request and gets the response for created lesson program
    Then verify that status code is 200 for get request for lesson program
    And Do assertion according to Get request for created Lesson program

    #ozellikle 11.satirda takildim