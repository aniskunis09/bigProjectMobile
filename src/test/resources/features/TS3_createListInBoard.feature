Feature: Board Menu #1

  Scenario: Test Case 9 - User successfully create New List in Board
    Given user is on Home page
    When user click Choose Company Name
    Then user is on Current Company Page
    And user click Choose Team Name
    Then user is on Current Team Page
    When user click Board Menu button
    Then user is on Current Board Page
    When user click Add New List
    And user input List Name Src
    And user click Submit button
    Then user see List in Board has been created


  Scenario: Test Case 10 - User failed create New List in Board with null List Name
    Given user is on Home page
    When user click Choose Company Name
    Then user is on Current Company Page
    And user click Choose Team Name
    Then user is on Current Team Page
    When user click Board Menu button
    Then user is on Current Board Page
    When user click Add New List
    And user click Submit button
    Then user stay on Create New List form
