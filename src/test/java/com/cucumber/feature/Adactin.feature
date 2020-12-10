Feature: Booking Functionality of Adactin Application

			
Scenario: Verify the user is able to login the application
			Given User launches the application
			When User enters the valid "LakshmiAM" in the username field
			And User enters the valid "training" in the password field
			And user clicks on the login button
			Then user verified HomePage navigates to Search Hotel Page
			

Scenario: Verify user is able to Search Hotel through Search Hotel page
			When user selects the Location "Sydney" as "value"in Select Location drop down field
			And User selects the Hotel "Hotel Sunshine" as "visible text" in Select Hotel drop downfield
			And User selects the Room Type "Double" as "value" in Room Type drop down
			And User selects the Number of Rooms as "1" in Number of Rooms drop down
			And USer selects Check In Date as "17/12/2020" from Check In Date field
			And User selects Check Out Date from "19/12/2020" Check Out Date field
			And User selects Adults per Room as "1" from Adults per Room field
			And User selects Children per Room as "0" from Children per Room 	 drop down
			And User clicks on Search button
			Then User verify the Search Hotel page navigate to select Hotel Page.

Scenario: Verify user is in Select Hotel Page
			When User clicks on Select Hotel radio button
			And User clicks on Continue button
			Then user verify the select hotel page navigates to Book a Hotel page.

Scenario: Verify user is in Book A Hotel page
			When User enter First Name as "Lakshmi" field value
			And User enter Last Nameas "AM" Field Value
			And User enter Billing Address as "No 7, Chennai" field value
			And User enter Credit Card No field as "1478523697458963" 	
			And User enter Credit Card Type field as "VISA" 
			And USer enter Expiry Date field as "November 2021" 
			And User enter CVV Number as "125"
			And User clicks on Book Now button
			Then User verify Booking confirmation page is displayed.

Scenario: Verify user is in Booked Itenary page by clicking on Booked Itenary link
			When User checks on order ID checkbox
			And User click on LogOut Selected button
			Then User verify Logout from the session.
