Feature: Update Contact Details

  Scenario Outline: Update the Number with Valid Number
    Given person is on Firstcry website homepage
    And person click on login
    And person enter registered number
    And person click on continue
    And click on submit for login
    And person click On myAccount
    And person click on myProfile
    And person click on contact details
    And person click on edit icon on contact details
    And update the new <mobileNumber>
    When click on verify button
    And give regerterred email otp
    And give otp from new number
    And click on submit
    Then contact number updated successfully

    Examples: 
      | mobileNumber |
      |   9547077812 |
