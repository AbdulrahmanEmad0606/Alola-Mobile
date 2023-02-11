
Feature: Login

  Scenario Outline: Check Login Functionality
    Given Inspector Open the Application
    And Enter Valid userName<User Name>
    And Enter Valid Password<Password>
    And Click Login
    Then User Should Login Successfully
    Examples:
      | User Name            | Password |
      | "inspector"          |"123456" |