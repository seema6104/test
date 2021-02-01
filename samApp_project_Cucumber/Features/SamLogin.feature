Feature: Sam App Student login
Scenario: Login with Student user credentials
Given User Launch Chrome browser
When User Launch SAM URL "https://sam.cengage.com/App/login?ReturnUrl=%2f"
And User enters Email as "sample_student@swlearning.com" and Password as "Password1"
Then Student user can see Dashboard