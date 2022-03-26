Feature: This feature file contains scenarios testing Trello Api

  Scenario: Change board name and then create a new List
    Given The test board exists and contains correct information
    When I change the board name to "Test Boards"
    And I check that the board name was successfully updated to "Test Board"
    Then I add a list with title "Test Title" to the board
