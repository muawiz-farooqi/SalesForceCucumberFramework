Feature: Login test cases scenarios
Background: User launch the application
Given User launch the application
When User is on "LoginPage"
Then User enter into textbox "Username" "muawiz@developer.com"
And User enter into textbox "Password" "Farooqi$123"
And User click on Button "Login"

#Scenario: 5 - Select user menu dropdown
#Given User is on "HomePage"
#When User click on Button "UserNavMenu"
#Then Does Element Text Match "UserNavDropDownList" "My Profile"


#Scenario: 6 - Edit Profile
#Given User is on "HomePage"
#When User click on Button "UserNavMenu"
#And User click on Button "My Profile"
#Then User is on "ProfilePage"
#
#When User click on Button "EditProfile"
#And Change frame to "AboutFrame"
#And User click on Button "About"
#And User clears textbox "LastName"
#And User enter into textbox "LastName" "Farooqixyz"
#And User click on Button "SaveAll"
#And Return to Default Frame
#Then Does Element Text Contain "ProfileName" "Farooqixyz"
#
#When User click on Button "PostLink"
#And Change frame to "PostFrame"
#And User enter into textbox "PostText" "Hello from Cucumber!"
#And Return to Default Frame
#And User click on Button "Share"
#And Page updates after 1 second
#Then Does Element Text Match "LatestPost" "Hello from Cucumber!"
#
#When User click on Button "FileLink"
#And User click on Button "ComputerUpload"
#And User send path "ChooseFile" "C:\\UTA\\Docs\\Resume_8_7_.pdf"
#And User click on Button "Share"
#And User waits for "FileOverlay" to disappear 
#And Page updates after 1 second
#Then Does Element Text Match "LatestFile" "Resume_8_7_"
#
#When User hovers mouse over "ProfilePhoto"
#And User click on Button "AddPhoto"
#And Change frame to "AddPhotoFrame"
#And User send path "ChoosePhoto" "C:\\Users\\muawi\\OneDrive\\Pictures\\portrait\\SEIR (square).JPG"
#And User click on Button "UploadButton"
#And User crops photo to size "Full"
#And User click on Button "SaveProfilePic"
#And Return to Default Frame
#Then User hovers mouse over "ProfilePhoto"
#And User is on "DeletePhoto"


Scenario: 7 - Edit Settings
Given User is on "HomePage"
When User click on Button "UserNavMenu"
And User click on Button "My Settings"
Then User is on "SettingsPage"

When User click on Button "Personal"
And User click on Button "LoginHistory"
And User click on Button "DownloadLoginHistory"
Then Check If File Downloaded "LoginHistory"

When User click on Button "DisplayLayout"
And User click on Button "CustomizeTabs"
And User selects "Salesforce Chatter" option from "CustomApp" dropdown
And User click on Button "ReportsOption"
And User click on Button "Add"
And User click on Button "Save"
Then Is Tab Added "Reports"

When User is on "HomePage"
And User click on Button "UserNavMenu"
And User click on Button "My Settings"
Then User is on "SettingsPage"
When User click on Button "Email"
And User click on Button "EmailSettings"
And User clears textbox "EmailName"
And User enter into textbox "EmailName" "Muhammad Muawiz Farooqi"
And User clears textbox "EmailAddress"
And User enter into textbox "EmailAddress" "muaiz31@gmail.com"
And User click on Radio Button "AutoBCC"
And User click on Button "Save"
Then Does Element Text Match "MessageText" "Your settings have been successfully saved."

When User click on Button "Calendar&Reminders"
And User click on Button "ActivityReminders"
And User click on Button "Open Test Reminder"
Then Does Window Header Match "  Sample Event."




