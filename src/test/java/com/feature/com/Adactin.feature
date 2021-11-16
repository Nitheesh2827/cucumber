Feature: Checking the functionality of the adactin hotel application

Scenario: User checking the login page using valid username and password
Given user launch the application
When User enter the valid username in the username field
And User enter the valid password in the password field
Then user clicks on the login button


Scenario: User have to book a room
Given user have to select the location
When user have to select the hotel
And user have to select the room type
And user have to select the number of rooms
And user have to clear the check-in date field
And user have to enter the check-in date
And user have to clear the check-out date field
And user have to enter the check-out date
And user have to pick adult per room
And user have to pick child per room
Then user clicks on the search option


Scenario: User have to confirm the hotel booking
Given user have to click on the radio button
Then user clicks on the continue option


Scenario: User have to enter the payment details
Given user have to enter the first name
When user have to enter the last name
And user have to enter the address
And user have to enter the 16-digit credit card number
And user have to select the credit card type
And user have to select the expiry month of the card
And user have to select the expiry year of the card
And user have to enter the CVV number
Then User clicks on the BOOK NOW option

Scenario: User have to check the details that have been entered and logout
Given user have to click on the logout

