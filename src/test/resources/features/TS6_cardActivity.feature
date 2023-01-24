Feature: Card Menu #2

Scenario: Test Case 16 - User successfully add Attach File on Current Card
    Given user is on Home page
    When user click Choose Company Name
    Then user is on Current Company Page
    And user click Choose Team Name
    Then user is on Current Team Page
    When user click Board Menu button
    Then user is on Current Board Page
    When user click Current Card
    And user click Attach File button
    And user click Allow confirmation
    And user choose files to be attached
    Then user see attachment has been uploaded


  Scenario: Test Case 17 - User successfully add Comment on Current Card
    Given user is on Home page
    When user click Choose Company Name
    Then user is on Current Company Page
    And user click Choose Team Name
    Then user is on Current Team Page
    When user click Board Menu button
    Then user is on Current Board Page
    When user click Current Card
    And user input New Comment
    And user click Submit Comment button
    Then user see comment has been added