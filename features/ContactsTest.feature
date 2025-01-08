Feature: Login test cases scenarios
Background: User launch the application and clicks Opportunities Tab
Given User launch the application
When User is on "LoginPage"
Then User enter into textbox "Username" "muawiz@developer.com"
And User enter into textbox "Password" "Farooqi$123"
And User click on Button "Login"
And User is on "HomePage"
And User click on Button "ContactsTab"
Then User is on "ContactsPage"
And Does Element Text Match "PageHeading" "Contacts" 

@testcase25
Scenario: 25 - Create New Contact
Given User click on Button "New"
Then Is User on "NewContactPage"

When User enter into textbox "LastName" "Farooqi"
And User click on Button "Save"
Then Does Element Text Match "ContactDisplayPage" "Farooqi"

@testcase26
Scenario: 26 - Create New View
Given User click on Button "CreateNewView"
Then Is User on "CreateNewViewPage"

When User enter into textbox "ViewName" "TestView00"
And User click on Button "UniqueViewName"
And User clears textbox "UniqueViewName" 
When User enter into textbox "UniqueViewName" "TestView00"
And User click on Button "Save"
Then Does Element Text Match "SelectedDropdownOption" "TestView00"

@testcase27
Scenario: 27 - Recently Created Contact
Given User selects "Recently Created" option from "RecentsDropdown" dropdown
Then Is User on "ContactsList"

@testcase28
Scenario: 28 - My Contacts View
Given User selects "My Contacts" option from "ContactsDropdown" dropdown
Then Does Element Text Match "SelectedDropdownOption" "My Contacts"

@testcase29
Scenario: 29 - Click Contact
Given User clicks on Contact named "Farooqi"
Then Does Element Text Match "ContactDisplayPage" "Farooqi"

@testcase30
Scenario: 30 - Create New View Error
Given User click on Button "CreateNewView"
Then Is User on "CreateNewViewPage"

When User enter into textbox "UniqueViewName" "EFGH"
And User click on Button "Save"
Then Does Element Text Match "ViewErrorMessage" "Error: You must enter a value"

@testcase31
Scenario: 31 - Create New View Cancel
Given User click on Button "CreateNewView"
Then Is User on "CreateNewViewPage"

When User enter into textbox "ViewName" "ABCD"
And User click on Button "UniqueViewName"
And User clears textbox "UniqueViewName" 
When User enter into textbox "UniqueViewName" "EFGH"
And User click on Button "Cancel"
Then Does Element Text Match "PageHeading" "Contacts" 

@testcase32
Scenario: 32 - Create New Contact - Save and New
Given User click on Button "New"
Then Is User on "NewContactPage"

When User enter into textbox "LastName" "Indian"
And User click on Button "SaveAndNew"
Then Is User on "NewContactPage"
