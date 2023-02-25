@regression
Feature: Submit Saved Form

  Scenario Outline: Check Submitting the saved Scanning Form
    Given Inspector Open the Application
    And Enter Valid userName<UserName>
    And Enter Valid Password<Password>
    And Click Login
    And  Inspector Navigated To the Home Page
    And Expand Activity Section
    And Click on desired Activity<ActivityNumber>
    And Select schedule
    And Click on the Skip Button
    And Fill Form
    And Click on the save button
    And Navigate to saved Events
    Then Success
    Examples:
      | UserName    | Password | ActivityNumber |
      | "inspector" | "123456" | 4              |
      | "inspector" | "123456" | 4              |
