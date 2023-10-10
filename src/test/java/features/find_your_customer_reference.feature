Feature: Find you customer reference

  Scenario: User is able to navigate to the help page from home page
    Given the home page is displayed
    When user navigates to the help page
    Then help screen is displayed

  Scenario: User is shown an error message when no data in entered
    Given user navigates to the your customer reference number page
    When no details are filled out
    Then error message "Please provide your email/phone number and postcode" is shown
