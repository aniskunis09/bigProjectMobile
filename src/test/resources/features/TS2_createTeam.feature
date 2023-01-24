Feature: Company Menu

  Scenario: Test Case 5 - User successfully create new Team
    Given user is on Home page
    When user click Choose Company Name
    Then user is on Current Company Page
    When user click Add Yellow button
    And user choose Add New Team button
    And user input Team Name
    And user input Team Description
    And user click Create Team button


  Scenario: Test Case 6 - User failed create new Team with all information fields empty
    Given user is on Home page
    When user click Choose Company Name
    Then user is on Current Company Page
    When user click Add Yellow button
    And user choose Add New Team button
    And user click Create Team button
    Then user see fields must be filled notification


  Scenario: Test Case 7 - User failed create new Team with null Team Name
    Given user is on Home page
    When user click Choose Company Name
    Then user is on Current Company Page
    When user click Add Yellow button
    And user choose Add New Team button
    And user input Team Description
    And user click Create Team button
    Then user see fields must be filled notification


  Scenario: Test Case 8 - User failed create new Team with null Team Description
    Given user is on Home page
    When user click Choose Company Name
    Then user is on Current Company Page
    When user click Add Yellow button
    And user choose Add New Team button
    And user input Team Name - Negative
    And user click Create Team button
    Then user see fields must be filled notification