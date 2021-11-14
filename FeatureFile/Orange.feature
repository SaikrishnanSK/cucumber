Feature: Test login Functionality of OrangeHRm
Scenario: Test login Functionality with valid username with password
Given as a user we launch the url"https://opensource-demo.orangehrmlive.com/"
When as a user we send username "Admin" and password "admin123"
And as a user click the login button
Then as a user close the browser

