Feature: Student Registration Form

  Background:
    Given the user navigates to the website
    And the user clicks on the demo site button
    And the user clicks on the form
    And the user clicks on the practice form button


  @regression @valid
  Scenario Outline: Valid Registration

    When the user enters firstname "<firstName>"
    And the user enters lastname "<lastName>"
    And the user enters email "<email>"
    And the user enters gender "<gender>"
    And the user enters mobile number "<phoneNumber>"
    And the user enters date of birth
    And the user selects hobbies
    And the user uploads a picture
    And the user enters address "<homeAddress>"
    And the user selects a state
    And the user selects a city


    When the user clicks on the submit button
   Then the form is submitted successfully
 #Then the form is submitted successfully with this message "Thanks for submitting the form"
    And the user clicks the close button

    Examples:
      |firstName  | lastName | email                        | phoneNumber | homeAddress | gender |
      | Jay       |    Fon   | jayfon@aol.com               | 07889815555 |  Glasgow, UK| Male   |
      | Test       | Tester  | fitzgeraldh2k@yahoo.com      | 07889814444 |  London, UK| other   |
      | Lina      |  Testers | fitzgeraldh2k@gmail.com   | 07889813333 |  Leeds, UK| Female    |
  @regression @invalid
  Scenario: Invalid Registration

    When the user enters firstname "Jay"
    And the user enters lastname "Fon"
    And the user enters email "jayfon@aol.com"
    And the user enters gender
    And the user does not enter mobile number
    And the user enters date of birth
    And the user selects hobbies
    And the user uploads a picture
    And the user enters address "Glasgow, UK"
    And the user selects a state
    And the user selects a city

    When the user clicks on the submit button
    Then the form is not submitted

