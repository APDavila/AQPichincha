Feature: Compra


Scenario: Compra as client

Given the user is in the index page_1
When the user click in login button_1
And the user enter his email and password_1
Then the user clicks the Login button_1
Then the index page appears with the user logged_1
Then the user clicks in products button_1
Then the user clicks in add to cart button_1
Then the user clicks in add to cart button_2
When the user clicks in cart button_1
Then the user clicks in Proceed To Checkout button_2
Then the user clicks in Place Order button_2
Then the user enter his Name on card, cardnumberm cvcm amd expiration_1
When the user clicks the Pay and Confirm Order button_1
Then the user is in the Confirmation Page_1
