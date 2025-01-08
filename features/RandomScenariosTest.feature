Feature: Login test cases scenarios
Background: User launch the application and clicks Opportunities Tab
Given User launch the application
When User is on "LoginPage"
And User enter into textbox "Username" "muawiz@developer.com"
And User enter into textbox "Password" "Farooqi$123"
And User click on Button "Login"
Then Does Window Title Match "Home Page ~ Salesforce - Developer Edition"
And User is on "HomePage"

@testcase33
Scenario: 33 - Verify first and last name
Given User click on Button "HomeTab"
Then Is User on "onHomePage"

When User click on Button "Name"
Then User is on "ProfilePage"
And Is User on "ProfileName"

@testcase34
Scenario: 34 - Verify edited last name
Given User click on Button "HomeTab"
Then Is User on "onHomePage"

When User click on Button "Name"
Then User is on "ProfilePage"
And Is User on "ProfileName"

When User click on Button "EditProfile"
Then Is User on "AboutFrame"

When Change frame to "AboutFrame"
And User click on Button "About"
Then Is User on "AboutTabSelected"

When User clears textbox "LastName"
And User enter into textbox "LastName" "Abcd"
And User click on Button "SaveAll"
And Return to Default Frame
Then Does Element Text Contain "ProfileName" "Abcd"
And Is User Menu Name Updated "Abcd"

@testcase35
Scenario: 35 - Verify Tab Customization
Given User click on Button "AllTabs"
Then Is User on "AllTabsPage"

When User click on Button "CustomizeTabs"
Then Is User on "CustomizeTabsPage"

When User click on Button "Forecasts"
And User click on Button "Remove"
Then Is Tab Removed "Forecasts"

When User click on Button "Save"
Then Is User on "AllTabsPage"
And Is "Forecasts" Removed From Bar

When User click on Button "UserNavMenu"
And User click on Button "Logout"
Then User is on "LoginPage"
And Is User on "Password"

When User enter into textbox "Username" "muawiz@developer.com"
And User enter into textbox "Password" "Farooqi$123"
And User click on Button "Login"
Then Does Window Title Match "Home Page ~ Salesforce - Developer Edition"
And User is on "HomePage"
And Is "Forecasts" Removed From Bar

@testcase36
Scenario: 36 - Block Calendar Event
Given User click on Button "HomeTab"
Then Is User on "onHomePage"

When User click on Button "CurrentDate"
Then User is on "CalendarPage"
And Is User on "NewEvent"

When User click on Time "8:00 PM"
Then Does Element Text Match "PageHeading" "New Event"

When User click on Button "ComboBox"
Then 2 Windows will be Open

When User clicks Button "Other" in New Window
Then "Subject" contains "Other" option

When User click on Button "EndTime"
Then Is User on "TimePicker"

When User picks end time "9:00 PM"
Then Does "EndTime" match "9:00 PM"

When User click on Button "Save"
Then "Other" event displayed with "EventStartTime" : "8:00 PM" and "EventEndTime" : "9:00 PM"

@testcase37
Scenario: 37 - Block Recurring Calendar Event
Given User click on Button "HomeTab"
Then Is User on "onHomePage"

When User click on Button "CurrentDate"
Then User is on "CalendarPage"
And Is User on "NewEvent"

When User click on Time "4:00 PM"
Then Does Element Text Match "PageHeading" "New Event"

When User click on Button "ComboBox"
Then 2 Windows will be Open

When User clicks Button "Other" in New Window
Then "Subject" contains "Other" option

When User click on Button "EndTime"
Then Is User on "TimePicker"

When User picks end time "7:00 PM"
Then Does "EndTime" match "7:00 PM"

When User sets checkbox "Recurring" "Checked"
Then "Recurring" box is "Checked"

When User click on Button "WeeklyRecurrence"
Then "WeeklyRecurrence" box is "Checked"

When User click on Button "RecurrenceEndDate"
And User select on date with 2 week interval
Then "RecurrenceEndDate" is selected

When User click on Button "Save"
Then "Other" event displayed with "EventStartTime" : "4:00 PM" and "EventEndTime" : "7:00 PM"

When User click on Button "MonthView"
Then 2 Week "Other" event displayed with "EventStartTime" : "4:00 PM" and "EventEndTime" : "7:00 PM"