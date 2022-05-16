@singlebrowser
Feature: Sample tests with serenity

  Background: I search for serenity bdd
    Given I am on google page
    And I search for 'Serenity bdd'

  Scenario: search serenity website
    Then The serenity website is displayed in search result
  @pending
  Scenario: open serenity website
    When I open the first search result
    Then Serenity website is opened

  @pending
  Scenario: navigate in serenity website
    And  I open the first search result
    When I select to learn 'Serenity with Cucumber->Getting Started with Cucumber and Serenity'
    Then The selected course is displayed