package com.Adactin.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Adactin.baseclass.FunctionlLib;

public class SearchHotelModule extends FunctionlLib {

	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private	WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement numOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement checkinDate;
	
	@FindBy(id="datepick_out")
	private WebElement checkoutDate;
	
	@FindBy(id="adult_room")
	private WebElement adults;
	
	@FindBy(id="child_room")
	private WebElement children;

	@FindBy(id="Submit")
	private WebElement search;
	
	@FindBy(id="Reset")
	private WebElement resetBtn;

	@FindBy(id="checkout_span")
	private WebElement checkoutError;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumOfRooms() {
		return numOfRooms;
	}

	public WebElement getCheckinDate() {
		return checkinDate;
	}

	public WebElement getCheckoutDate() {
		return checkoutDate;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildren() {
		return children;
	}
	
	public WebElement getSearch() {
		return search;
	}
	
	public WebElement getResetBtn() {
		return resetBtn;
	}
	
	public WebElement getCheckoutError() {
		return checkoutError;
	}

	
	public SearchHotelModule() {
		PageFactory.initElements(driver, this);
		
	}
}
