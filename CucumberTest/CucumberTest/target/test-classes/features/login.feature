Feature: Login

Scenario: Login as client

Given the user is in the index page
When the user click in login button
And the user enter his email and password
Then the user clicks the Login button
Then the index page appears with the user logged