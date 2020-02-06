$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/Adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Hotel Booking Application",
  "description": "",
  "id": "adactin-hotel-booking-application",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "Verify Login page module with valid credentials",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User opens the Adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters the username in the login page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters the password in the  login page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User selects the location in search hotel page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User selects the hotel",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User selects the room type",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User selects the number of rooms",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDefn.user_opens_the_Adactin_application()"
});
formatter.result({
  "duration": 4139724999,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_enters_the_username_in_the_login_page()"
});
formatter.result({
  "duration": 760610100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_enters_the_password_in_the_login_page()"
});
formatter.result({
  "duration": 105104900,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 1910153601,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_selects_the_location_in_search_hotel_page()"
});
formatter.result({
  "duration": 833791099,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_selects_the_hotel()"
});
formatter.result({
  "duration": 115916400,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_selects_the_room_type()"
});
formatter.result({
  "duration": 259275099,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_selects_the_number_of_rooms()"
});
formatter.result({
  "duration": 73045400,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "To verify whether locations in Select Hotel page are displayed according to the location selected in Search Hotel",
  "description": "",
  "id": "adactin-hotel-booking-application;to-verify-whether-locations-in-select-hotel-page-are-displayed-according-to-the-location-selected-in-search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@TC104"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "User enters the correct check-in date",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "User enters the correct check-out date",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "User verifies whether the location in select hotel page is same as in search hotel page",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "User verifies whether the dates in select hotel page is same as in search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefn.user_enters_the_correct_check_in_date()"
});
formatter.result({
  "duration": 345335200,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_enters_the_correct_check_out_date()"
});
formatter.result({
  "duration": 2572733300,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_verifies_whether_the_lacation_in_select_hotel_page_is_same_as_in_search_hotel_page()"
});
formatter.result({
  "duration": 59021301,
  "error_message": "java.lang.NullPointerException\r\n\tat com.Adactin.steps.AdactinStepDefn.user_verifies_whether_the_lacation_in_select_hotel_page_is_same_as_in_search_hotel_page(AdactinStepDefn.java:135)\r\n\tat ✽.Then User verifies whether the location in select hotel page is same as in search hotel page(src/test/java/com/Adactin/feature/Adactin.feature:36)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AdactinStepDefn.user_verifies_whether_the_dates_in_select_hotel_page_is_same_as_in_search_hotel_page()"
});
formatter.result({
  "status": "skipped"
});
});