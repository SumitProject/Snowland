Feature: Test the Login Functionality of Swaglabs

  Scenario Outline: verify login functionality with valid credentials
    Given user on login page
    When user pass valid <un> and <pw>
    And user click on login button
    Then user will redirected to hompage

    Examples: 
      | un            | pw           |
      | standard_user | secret_sauce |
