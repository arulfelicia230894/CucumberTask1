Feature: Confirming the page for Booking
Scenario: Verifying the page
    Given User is on the home page
    When the user enters the customer details with firstname lastname email address mobileno
    |Arul|felicia|abc@gmail.com|Chennai|12345678|
    Then user should get the confirmation
    
 