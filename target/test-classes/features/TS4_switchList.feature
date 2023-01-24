Feature: Board Menu #2

  Scenario: Test Case 11 - User successfully switch Current List to Target List
    Given user is on Home page
    When user click Choose Company Name
    Then user is on Current Company Page
    And user click Choose Team Name
    Then user is on Current Team Page
    When user click Board Menu button
    Then user is on Current Board Page
    When user click Add New List
    And user input List Name Tgt
    And user click Submit button
    Then user see List in Board has been created
    When user get order Current List
    And user change order Current List
    Then user see List has switched to Target List notification