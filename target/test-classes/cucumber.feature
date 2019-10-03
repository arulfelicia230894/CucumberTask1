#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: cucumber.feature
  I want to use this template for my feature file

  @tag1
  Scenario: Login functionality exists
    Given user is in loginpage
    When user enter all the fields And clicks submit
    Then user sees the generated customer Id
     
    
  @tag2
  Scenario Outline: Login functionality exists
    Given user is in loginpage
    When the user enter all the fields "<Fname>" , "<Lname>" , "<Email>" , "<Address>" , "<Mobile>"
    And user clicks email
    Then the customer id is generated
    

    Examples: 
      | Fname  | Lname       | Email                 | Address | Mobile |
      | Arul   | Felicia     | arulfelicia@gmail.com | porur   | 1234565|
     
