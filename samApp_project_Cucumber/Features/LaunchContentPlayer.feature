Feature: Reduce the number of retakes on launch of the content player and not on the launch of the start dialog box
Scenario: Reduce the number of retakes
Given User Launch Chrome browser
When User Launch SAM URL "https://sam.cengage.com/App/login?ReturnUrl=%2f"
And User enters Email as "sample_student@swlearning.com" and Password as "Password1"
Then Student user can see Dashboard
And Student user Navigates to Activity List
And Student user clicks on SAM assignment and dialog box opens
Then Retake of the assignment should not get reduced 