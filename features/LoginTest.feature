Feature: Login test cases scenarios
Background: User launch the application
Given User launch the application

@testcase1
Scenario: 1 - Login Error Message
Given User is on "LoginPage"
When User enter into textbox "Username" "muawiz@developer.com"
And User clears textbox "Password"
And User click on Button "Login"
Then Does Element Text Match "Error" "Please enter your password."

@testcase2
Scenario: 2 - Login to SalesForce
Given User is on "LoginPage"
When User enter into textbox "Username" "muawiz@developer.com"
And User enter into textbox "Password" "Farooqi$123"
And User click on Button "Login"

@testcase3
Scenario: 3 - Check Remember Me
Given User is on "LoginPage"
When User enter into textbox "Username" "muawiz@developer.com"
And User enter into textbox "Password" "Farooqi$123"
And User sets checkbox "RememberMe" "Checked"
And User click on Button "Login"

Given User is on "HomePage"
When User click on Button "UserNavMenu"
And User click on Button "Logout"

Given User is on "LoginPage"
Then Does Element Text Match "Saved Username" "muawiz@developer.com"

@testcase4A
Scenario: 4A - Forgot Password
Given User is on "LoginPage"
When User click on Button "ForgotPasswordLink"
And User enter into textbox "ForgotUsername" "muawiz@developer.com"
And User click on Button "Continue"
Then Does Element Text Match "Header" "Check Your Email"

@testcase4B
Scenario: 4B - Validate Login Error Message
Given User is on "LoginPage"
When User enter into textbox "Username" "123"
And User enter into textbox "Password" "22131"
And User click on Button "Login"
Then Does Element Text Match "Error" "Please check your username and password. If you still can't log in, contact your Salesforce administrator."

