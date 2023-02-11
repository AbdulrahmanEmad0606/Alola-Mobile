@regression
Feature: Homepage
  Scenario Outline: Check Login Functionality
    Given Inspector Open the Application
    And Enter Valid userName<User Name>
    And Enter Valid Password<Password>
    And Click Login
    And  Inspector Navigated To the Home Page
    And Allow App to Access his Location
    And Expand Activity Section
    And Click on desired Activity<ActivityNumber>
   Then Success
    Examples:
      | User Name            | Password | ActivityNumber|
      | "inspector"          |"123456"  |       4       |
