package com.Adactin.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotelModule {
	
	@FindBy(xpath="//td[@class='login_title']")
	private WebElement selectHotelHeader;

	@FindBy(id="location_0")
	private WebElement location;

	@FindBy(id="hotel_name_0")
	private WebElement hotelName;
	
	@FindBy(id="arr_date_0")
	private WebElement arrivalDate;
	
	@FindBy(id="dep_date_0")
	private WebElement departureDate;
	
	public WebElement getSelectHotelHeader() {
		return selectHotelHeader;
	}
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotelName() {
		return hotelName;
	}

	public WebElement getArrivalDate() {
		return arrivalDate;
	}

	public WebElement getDepartureDate() {
		return departureDate;
	}
	
	

}
