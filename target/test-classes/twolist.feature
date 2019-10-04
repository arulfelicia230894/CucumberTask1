Feature: Confirming the booking page
    Scenario: Verifying the page
    Given user is on the home page
    When user enters the customer details with firstname lastname email address mobileno
    |Arul|felicia|abc@gmail.com|Chennai|12345678|
    |Apple|Fruits|def@gmail.com|USA|234234556|
    Then user should get the confirmation page
     
    

  