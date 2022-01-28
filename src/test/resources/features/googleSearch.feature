@GoogleTest
Feature: Google Search Functionality

  Background:
    Given user is on "https://www.google.com/"

    @Search
  Scenario Outline: Validate Google search
    When user searches for "<key>"
    Then user should see "<key>" in the url
    And user should see "<key>" in the title
    Examples:
      | key   |
      | Tesla |
      | Apple |


  Scenario: Validate Google search results
    When user searches for "Test Automation"
    Then user should see results are more than 0
