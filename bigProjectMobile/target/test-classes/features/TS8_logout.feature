Feature: Home Menu #2

  Scenario: Test Case 20 - User successfully Logout from application
    Given user is on Home page
    When user click Menu button
    Then user click Logout button
    And user click OK on confirmation page
    Then user navigated to Choose Login Type page