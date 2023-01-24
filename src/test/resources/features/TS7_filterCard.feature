Feature: List Menu #1

  Scenario: Test Case 18 - User successfully filter Card, Test Case 19 - User can reset filter Card
    Given user is on Home page
    When user click Choose Company Name
    Then user is on Current Company Page
    And user click Choose Team Name
    Then user is on Current Team Page
    When user click Board Menu button
    Then user is on Current Board Page
    When user click Filter Card button
    And user input Card Name on Filter form
    And user click Apply button
    Then user see filter Card result
    When user click Filter Card button
    And user click Reset function
    And user click Apply button
    Then user see display All Cards