Feature: Card Menu #1

  Scenario: Test Case 12 - User successfully create New Card, Test Case 13 - User successfully create New Private Card
    Given user is on Home page
    When user click Choose Company Name
    Then user is on Current Company Page
    And user click Choose Team Name
    Then user is on Current Team Page
    When user click Board Menu button
    Then user is on Current Board Page
    When user click Add New Card button
    And user input Card Name
    And user click Tick On Card Name
    Then user see success create Card notification
    When user click Add New Card button
    And user input Card Name
    And user change Private card toggle button
    And user click Tick On Card Name
    Then user see success create Card notification


  Scenario: Test Case 14 - User failed create New Card with null Card Name, Test Case 15 - User failed create New Private Card with null Card Name
    Given user is on Home page
    When user click Choose Company Name
    Then user is on Current Company Page
    And user click Choose Team Name
    Then user is on Current Team Page
    When user click Board Menu button
    Then user is on Current Board Page
    When user click Add New Card button
    And user click Tick On Card Name
    Then user stay on Current Board Page
    When user click Add New Card button
    And user change Private card toggle button
    And user click Tick On Card Name
    Then user stay on Current Board Page