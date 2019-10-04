Feature: Confirming the booking page
  Scenario: Verifying the page
    Given user is on the login page
    When customer enters the details with firstname lastname email address mobileno
    |firstname|lastname|email|address|mobileno|
    |arul|fel|abc@gmail.com|China|12345678|
    |mercy|jayasingh|ert@gmail.com|Chennai|4567890|
    Then customer gets confirmation
    