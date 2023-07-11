@11
Feature: US03

  Background:
    Given user is on the home page :  "login_url"

  Scenario: US03
    When User clicks Contact
    And User enters name into name field
    And User enters email into email field
    And User enters subject into subject field
    And User enters message into message field
    And User clicks the Send Message button
    Then User verify success message is displayed
    Then user close the browser