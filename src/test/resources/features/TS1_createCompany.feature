Feature: Home Menu #1

  Scenario: Test Case 1 - User successfully create new Company
    Given user is on Home page
    When user verify new Notifications
    And user click Create New Company button
    And user input Company Name
    And user input Company Description
    And user click Create Company button
    Then user see success create Company notification


  Scenario: Test Case 2 - User failed create new Company with all information fields empty
    Given user is on Home page
    When user verify new Notifications
    And user click Create New Company button
    And user click Create Company button
    Then user see fields must be filled notification


  Scenario: Test Case 3 - User failed create new Company with null Company Name
    Given user is on Home page
    When user verify new Notifications
    And user click Create New Company button
    And user input Company Description
    And user click Create Company button
    Then user see fields must be filled notification


  Scenario: Test Case 4 - User failed create new Company with null Company Description
    Given user is on Home page
    When user verify new Notifications
    And user click Create New Company button
    And user input Company Name - Negative
    And user click Create Company button
    Then user see fields must be filled notification