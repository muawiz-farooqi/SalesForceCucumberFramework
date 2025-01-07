Feature: Login test cases scenarios
Background: User launch the application and clicks Opportunities Tab
Given User launch the application
When User is on "LoginPage"
Then User enter into textbox "Username" "muawiz@developer.com"
And User enter into textbox "Password" "Farooqi$123"
And User click on Button "Login"
And User is on "HomePage"
And User click on Button "OpportunitiesTab"
Then User is on "OptyPage"
And Does Element Text Match "PageHeading" "Opportunities" 

@testcase15
Scenario: 15 - Opportunities Dropdown
Given User click on Button "OptyDropdown"
Then Is User on "AllOpty"

@testcase16
Scenario: 16 - Create New Opty
Given User click on Button "New"
When User enter into textbox "OptyName" "TestOpty9"
And User enter into textbox "AccountName" "TestAccount"
And User click on Button "CloseDate"
And User click on Button "Today"
And User selects "Prospecting" option from "Stage" dropdown
And User clears textbox "Probability"
And User enter into textbox "Probability" "15"
And User selects "Web" option from "LeadSource" dropdown
And User enter into textbox "PrimaryCampaign" ""
And User click on Button "Save"
Then Does Element Text Match "PageHeading" "Opportunity"  

@testcase17
Scenario: 17 - Test Opportunity Pipeline Report
Given User click on Button "OptyPipeline"
Then Is User on "OptyPipelinePage"

@testcase18
Scenario: 18 - Test Stuck Opportunity Report
Given User click on Button "StuckOpty"
Then Is User on "StuckOptyPage"

@testcase19
Scenario: 19 - Test Quarterly Summary Report
Given User selects "Current FQ" option from "QuarterlySummaryInterval" dropdown
And User selects "All Opportunities" option from "QuarterlySummaryInclude" dropdown
And User click on Button "RunReport"
Then Is User on "OptyReportPage"






