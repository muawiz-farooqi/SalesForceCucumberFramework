Feature: Login test cases scenarios
Background: User launch the application and clicks Opportunities Tab
Given User launch the application
When User is on "LoginPage"
Then User enter into textbox "Username" "muawiz@developer.com"
And User enter into textbox "Password" "Farooqi$123"
And User click on Button "Login"
And User is on "HomePage"
And User click on Button "LeadsTab"
Then User is on "LeadsPage"
And Does Element Text Match "PageHeading" "Leads" 

@testcase20
Scenario: 20 - Leads Tab
Then Does Element Text Match "PageHeading" "Leads"

@testcase21
Scenario: 21 - Leads Select View
Given User click on Button "LeadsDropdown"
Then Is User on "AllLeads"

@testcase22
Scenario: 22 - Default View
Given User selects "My Unread Leads" option from "LeadsDropdown" dropdown
When User is on "HomePage"
And User click on Button "UserNavMenu"
And User click on Button "Logout"
Then User is on "LoginPage"
And Is User on "Login"

When User enter into textbox "Username" "muawiz@developer.com"
And User enter into textbox "Password" "Farooqi$123"
And User click on Button "Login"
Then User is on "HomePage"

When User click on Button "LeadsTab"
Then User is on "LeadsPage"
And Does Element Text Match "PageHeading" "Leads" 

When User click on Button "Go"
Then Does Element Text Match "SelectedDropdownOption" "My Unread Leads"

@testcase23
Scenario: 23 - Today's Leads
Given User selects "Today's Leads" option from "LeadsDropdown" dropdown
Then Does Element Text Match "SelectedDropdownOption" "Today's Leads"

@testcase24
Scenario: 24 - New Lead
Given User click on Button "New"
Then Is User on "CreateNewLeadPage"

When User enter into textbox "LastName" "ABCD"
And User enter into textbox "CompanyName" "ABCD"
And User click on Button "Save"
Then Does Element Text Match "NewLeadPage" "ABCD"




