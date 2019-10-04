Feature: Confirming the booking page
  Scenario: Verifying the page
    Given user is on home page
    When user enters details with firstname lastname email address mobileno 
    |firstname|Arul|
    |lastname|fel|
    |mail|xyz@gmail.com|
    |address|Porur|
    |mobileno|456789089|
    Then user confirm the booking
    

  