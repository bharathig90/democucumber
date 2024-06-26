Feature: I want to login facebook

Background:
Given user launch the url and maximizing

Scenario Outline:
          Valid login Credentials
  
  When I enter the valid "<username>"
  And I enter the "<password>"
  Then I click the login button
  
  Examples:
  |username|password|
  |user1   |1234    |
  |user2   |5678    |
  |user3   |7891    |