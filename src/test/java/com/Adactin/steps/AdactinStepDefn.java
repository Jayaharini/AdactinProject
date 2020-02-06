package com.Adactin.steps;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.remote.html5.AddApplicationCache;

import com.Adactin.baseclass.FunctionlLib;
import com.Adactin.singleton.AdactinPOM;
import com.cucumber.listener.Reporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinStepDefn extends FunctionlLib{
	
	AdactinPOM ap = new AdactinPOM();
	boolean locationSearch;
	
	@Given("^User opens the Adactin application$")
	public void user_opens_the_Adactin_application() throws Throwable {
	   openApp("https://adactin.com/HotelApp/");
		
	}

	@When("^User enters the username in the login page$")
	public void user_enters_the_username_in_the_login_page() throws Throwable {
	   enterText(ap.getLm().getUserName(), "harini1308");
	    
	}

	@When("^User enters the password in the  login page$")
	public void user_enters_the_password_in_the_login_page() throws Throwable {
	   enterText(ap.getLm().getPassword(), "alliswell");
	    
	}

	@Then("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		clickBtn(ap.getLm().getLoginBtn());
		
	}

	@When("^User selects the location in search hotel page$")
	public void user_selects_the_location_in_search_hotel_page() throws Throwable {
	    dropDown(ap.getSm().getLocation(), "Sydney", "value");
	    waitForVisibilityOfWebElement(ap.getSm().getLocation());
	    locationSearch = elementIsDisplayed(ap.getSm().getLocation());
	    
	    
	}

	@When("^User selects the hotel$")
	public void user_selects_the_hotel() throws Throwable {
	    dropDown(ap.getSm().getHotel(), "Hotel Creek", "value");
	    
	}

	@When("^User selects the room type$")
	public void user_selects_the_room_type() throws Throwable {
	    dropDown(ap.getSm().getRoomType(), "Standard", "value");
	    
	}

	@When("^User selects the number of rooms$")
	public void user_selects_the_number_of_rooms() throws Throwable {
	    dropDown(ap.getSm().getNumOfRooms(), "1", "value");
	    
	}

	@When("^User selects the check-in date$")
	public void user_selects_the_check_in_date() throws Throwable {
	    ap.getSm().getCheckinDate().clear();
	    ap.getSm().getCheckinDate().sendKeys("10/02/2020");
	    
	    
	}

	@When("^User selects the check-out date less then check-in date$")
	public void user_selects_the_check_out_date_less_then_check_in_date() throws Throwable {
	    ap.getSm().getCheckoutDate().clear();
	    ap.getSm().getCheckoutDate().sendKeys("08/02/2020");
	    
	}

	@When("^User selects the number of adults$")
	public void user_selects_the_number_of_adults() throws Throwable {
	    dropDown(ap.getSm().getAdults(), "2", "value");
	}

	@When("^User clicks on the search button$")
	public void user_clicks_on_the_search_button() throws Throwable {
	    clickBtn(ap.getSm().getSearch());
		Reporter.addScreenCaptureFromPath(FunctionlLib.screenshot("user_clicks_on_the_search_button").getAbsolutePath());

	}

	@Then("^Verify whether date field accepts the early check-out date than check-in date$")
	public void verify_whether_date_field_accepts_the_early_check_out_date_than_check_in_date() throws Throwable {
	    boolean elementIsDisplayed = elementIsDisplayed(ap.getSm().getCheckoutError());
	    Assert.assertTrue(elementIsDisplayed);
	    Assert.fail();
	}
	
	@When("^User enters the check-in date of the past$")
	public void user_enters_the_check_in_date_of_the_past() throws Throwable {
		ap.getSm().getCheckinDate().clear();
	    ap.getSm().getCheckinDate().sendKeys("25/01/2020");
	   
	}

	@When("^User enters the check-out date of the past$")
	public void user_enters_the_check_out_date_of_the_past() throws Throwable {
		ap.getSm().getCheckoutDate().clear();
	    ap.getSm().getCheckoutDate().sendKeys("28/01/2020");
	    dropDown(ap.getSm().getAdults(), "2", "value");
	    clickBtn(ap.getSm().getSearch());
//	    ap.getSh().getSelectHotelHeader();
//	    System.out.println(header);
//	    screenshot("adactin");
	}

	@When("^User enters the correct check-in date$")
	public void user_enters_the_correct_check_in_date() throws Throwable {
		ap.getSm().getCheckinDate().clear();
	    ap.getSm().getCheckinDate().sendKeys("06/02/2020");
	    
	}

	@When("^User enters the correct check-out date$")
	public void user_enters_the_correct_check_out_date() throws Throwable {
	    ap.getSm().getCheckoutDate().clear();
	    ap.getSm().getCheckoutDate().sendKeys("08/02/2020");
	    dropDown(ap.getSm().getAdults(), "1", "value");
	    clickBtn(ap.getSm().getSearch());
	    
	}
	

//	@Then("^User verifies whether the location in select hotel page is same as in search hotel page$")
//	public void user_verifies_whether_the_lacation_in_select_hotel_page_is_same_as_in_search_hotel_page() throws Throwable {
//		waitForVisibilityOfWebElement(ap.getSh().getLocation());
//	    boolean locationSelect = elementIsDisplayed(ap.getSh().getLocation());
//	    Assert.assertEquals(locationSearch, locationSelect);
//	    System.out.println("Location Matched");
//	}

//	@Then("^User verifies whether the dates in select hotel page is same as in search hotel page$")
//	public void user_verifies_whether_the_dates_in_select_hotel_page_is_same_as_in_search_hotel_page() throws Throwable {
//	    
//	      
//	}


	
}
