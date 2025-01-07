Feature: Login test cases scenarios
Background: User launch the application
Given User launch the application
When User is on "LoginPage"
Then User enter into textbox "Username" "muawiz@developer.com"
And User enter into textbox "Password" "Farooqi$123"
And User click on Button "Login"
And User is on "HomePage"
And User click on Button "AccountsTab"
Then User is on "AccountsPage"
And Does Element Text Match "PageHeading" "Accounts" 

@testcase10
Scenario: 10 - Create an Account
Given User click on Button "New"
And User enter into textbox "AccountName" "TestAccountXYZ"
And User selects "Technology Partner" option from "Type" dropdown
And User selects "High" option from "Priority" dropdown
And User click on Button "Save"
Then Does Element Text Match "AccountNameHeading" "TestAccountXYZ"

@testcase11
Scenario: 11 - Create New View
Given User click on Button "CreateNewView"
And User enter into textbox "ViewName" "TestViewXYZ"
And User clears textbox "UniqueViewName"
And User enter into textbox "UniqueViewName" "TestViewXYZ"
And User click on Button "Save"
Then Does Element Text Match "CurrentSelectedView" "TestViewXYZ"

@testcase12
Scenario: 12 - Edit View
Given User selects "NewView0" option from "ViewSelect" dropdown
And User click on Button "Edit"
Then Is User on "ViewName"

When User clears textbox "ViewName"
And User enter into textbox "ViewName" "NewView1"
And User selects "Account Name" option from "Field" dropdown
And User selects "contains" option from "Operator" dropdown
And User enter into textbox "Value" "a"
And User selects "Last Activity" option from "FieldToDisplay" dropdown
And User click on Button "Add"
And User click on Button "Save"
Then Is User on "CurrentSelectedView"
And Is User on "LastActivity"

@testcase13
Scenario: 13 - Merge Accounts
When User click on Button "MergeAccounts"
And User enter into textbox "SearchBar" "Test"
And User click on Button "Search"
And User sets checkbox "Checkbox1" "Checked"
And User sets checkbox "Checkbox2" "Checked"
And User click on Button "Next"
Then Is User on "ValidMergePage"

When User click on Button "Merge"
And User clicks OK on Alert
Then Is User on "AccountHomePage"

@testcase14
Scenario: 14 - Create Account Report
When User click on Button "MoreThan30Days"
Then Is User on "ReportPage"

When User click on Button "DateField"
And User click on Button "CreatedDate"
And User click on Button "FromDate"
And User click on Button "FromDateToday"
And User click on Button "ToDate"
And User click on Button "ToDateToday"
Then Is User on "ReportPage"

When User click on Button "SaveReport"
And User enter into textbox "ReportName" "TestReportXYS"
And Page updates after 1 second
And User enter into textbox "UniqueReportName" ""
And Page updates after 1 second
And User clears textbox "UniqueReportName"
And Page updates after 1 second
And User enter into textbox "UniqueReportName" "TestReportXY"
And Page updates after 1 second
And User click on Button "Save And Run Report"
Then Does Element Text Match "ReportPageHeader" "TestReportXY"

