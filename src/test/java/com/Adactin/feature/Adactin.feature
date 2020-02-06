@Adactin
Feature: Adactin Hotel Booking Application


Background: Verify Login page module with valid credentials

Given User opens the Adactin application
When User enters the username in the login page
And User enters the password in the  login page
Then User clicks on the login button
When User selects the location in search hotel page
When User selects the hotel
When User selects the room type
When User selects the number of rooms


@TC102
Scenario: Verify whether the check-out date field accepts a later date than checkin date.

When User selects the check-in date
And User selects the check-out date less then check-in date
And User selects the number of adults
And User clicks on the search button
Then Verify whether date field accepts the early check-out date than check-in date
	
@TC103
Scenario: To check if error is reported if check-out date field is in the past

When User enters the check-in date of the past
And User enters the check-out date of the past

#@TC104
#Scenario: To verify whether locations in Select Hotel page are displayed according to the location selected in Search Hotel
#
#When User enters the correct check-in date
#When User enters the correct check-out date
#Then User verifies whether the location in select hotel page is same as in search hotel page
#Then User verifies whether the dates in select hotel page is same as in search hotel page



 

