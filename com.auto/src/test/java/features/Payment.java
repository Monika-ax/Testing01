@tag
Feature: Validate the login page
 

  @tag1
  Scenario: Validate the login with valid details
    Given Launch the URL
    And Enter the username and pass
    When Click on the login button
    Then Sucessful login