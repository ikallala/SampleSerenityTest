@singlebrowser
Feature: Sample tests with serenity

  Background: I search for serenity bdd
    Given I am on google page
    And I search for 'Serenity bdd'

  Scenario: search serenity website
    Then The serenity website is displayed in search result

  Scenario: open serenity website
    When I open the first search result
    Then Serenity website is opened

  Scenario: navigate in serenity website
    And  I open the first search result
    When I select to learn 'Serenity with Cucumber->Getting Started with Cucumber and Serenity'
    Then The selected course is displayed

  Scenario: open serenity website1
    When I open the first search result
    Then Serenity website is opened

  Scenario: open serenity website2
    When I open the first search result
    Then Serenity website is opened

  Scenario: open serenity website3
    When I open the first search result
    Then Serenity website is opened

  Scenario: open serenity website4
    When I open the first search result
    Then Serenity website is opened

  Scenario: open serenity website5
    When I open the first search result
    Then Serenity website is opened
