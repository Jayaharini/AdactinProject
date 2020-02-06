$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/Adactin/feature/Adactin.feature");
formatter.feature({
  "line": 2,
  "name": "Adactin Hotel Booking Application",
  "description": "",
  "id": "adactin-hotel-booking-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Adactin"
    }
  ]
});
formatter.before({
  "duration": 839900,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Verify Login page module with valid credentials",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User opens the Adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters the username in the login page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters the password in the  login page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User clicks on the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User selects the location in search hotel page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User selects the hotel",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User selects the room type",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User selects the number of rooms",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDefn.user_opens_the_Adactin_application()"
});
formatter.result({
  "duration": 9830626200,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_enters_the_username_in_the_login_page()"
});
formatter.result({
  "duration": 2287049101,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_enters_the_password_in_the_login_page()"
});
formatter.result({
  "duration": 264631800,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 2576431800,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_selects_the_location_in_search_hotel_page()"
});
formatter.result({
  "duration": 1487741501,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_selects_the_hotel()"
});
formatter.result({
  "duration": 194334300,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_selects_the_room_type()"
});
formatter.result({
  "duration": 554524700,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_selects_the_number_of_rooms()"
});
formatter.result({
  "duration": 153164700,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Verify whether the check-out date field accepts a later date than checkin date.",
  "description": "",
  "id": "adactin-hotel-booking-application;verify-whether-the-check-out-date-field-accepts-a-later-date-than-checkin-date.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@TC102"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User selects the check-in date",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User selects the check-out date less then check-in date",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User selects the number of adults",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User clicks on the search button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Verify whether date field accepts the early check-out date than check-in date",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefn.user_selects_the_check_in_date()"
});
formatter.result({
  "duration": 430063100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_selects_the_check_out_date_less_then_check_in_date()"
});
formatter.result({
  "duration": 146308399,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_selects_the_number_of_adults()"
});
formatter.result({
  "duration": 137829601,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_clicks_on_the_search_button()"
});
formatter.result({
  "duration": 1507628501,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.verify_whether_date_field_accepts_the_early_check_out_date_than_check_in_date()"
});
formatter.result({
  "duration": 354581599,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.fail(Assert.java:95)\r\n\tat com.Adactin.steps.AdactinStepDefn.verify_whether_date_field_accepts_the_early_check_out_date_than_check_in_date(AdactinStepDefn.java:103)\r\n\tat ✽.Then Verify whether date field accepts the early check-out date than check-in date(src/test/java/com/Adactin/feature/Adactin.feature:24)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1018946000,
  "status": "passed"
});
formatter.before({
  "duration": 96499,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Verify Login page module with valid credentials",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User opens the Adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters the username in the login page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters the password in the  login page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User clicks on the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User selects the location in search hotel page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User selects the hotel",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User selects the room type",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User selects the number of rooms",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDefn.user_opens_the_Adactin_application()"
});
formatter.result({
  "duration": 2153573700,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_enters_the_username_in_the_login_page()"
});
formatter.result({
  "duration": 297026000,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_enters_the_password_in_the_login_page()"
});
formatter.result({
  "duration": 116275601,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 1155034600,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_selects_the_location_in_search_hotel_page()"
});
formatter.result({
  "duration": 214598400,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_selects_the_hotel()"
});
formatter.result({
  "duration": 93464399,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_selects_the_room_type()"
});
formatter.result({
  "duration": 220496399,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_selects_the_number_of_rooms()"
});
formatter.result({
  "duration": 125065500,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "To check if error is reported if check-out date field is in the past",
  "description": "",
  "id": "adactin-hotel-booking-application;to-check-if-error-is-reported-if-check-out-date-field-is-in-the-past",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@TC103"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "User enters the check-in date of the past",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User enters the check-out date of the past",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefn.user_enters_the_check_in_date_of_the_past()"
});
formatter.result({
  "duration": 610023600,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefn.user_enters_the_check_out_date_of_the_past()"
});
formatter.result({
  "duration": 2268145600,
  "status": "passed"
});
formatter.after({
  "duration": 61800,
  "status": "passed"
});
});