Feature: Creating account in facebook
    Scenario: Sign up to facebook
    Given User in on sign up page
    When The user enters the information with firstname surname emailaddress newpassword
    |Arul|Felicia|abc@gmail.com|123456|
    Then Login successfully
    

  