@SmokeTest
Feature: This is a test game for trying out Cucumber

  Scenario Outline: Test the game by calling the test method
    Given TestGame is instantiated
    When I play with <number>
    Then The <result> was number 6
    Examples:
    |number|result|
    |3    | 6     |
    |4    | 8     |