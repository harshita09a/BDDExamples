Feature: Log in and out
As an Administrator
I want to restrict access to certain portions of my site
In order to prevent users from changing the content

Scenario: Logging in
Given I am not logged in as an administrator
When I go to the administrator
And I fill in the fields

    | Username | "admin" |
     |Password | "secret" |
And I press "Log in"
Then I should be on the administrative page
And I should see "Log out

Scenario: Logging out....       
     