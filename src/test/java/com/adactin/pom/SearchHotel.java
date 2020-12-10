package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public WebDriver driver;

	@FindBy(id = "location")
	private WebElement Location;
	
	@FindBy(id = "hotels")
	private WebElement Hotels;
	
	@FindBy(id = "room_type")
	private WebElement RoomType;
	
	@FindBy(id="room_nos")
	private WebElement roomNos;
	
	@FindBy(id = "datepick_in")
	private WebElement checkInDate;
	
	@FindBy(id = "datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(id = "adult_room")
	private WebElement adultRoomNos;
	
	@FindBy(id = "child_room")
	private WebElement childRoom;
	
	@FindBy(id = "Submit")
	private WebElement submit;
	
	public SearchHotel(WebDriver ldriver) {
	this.driver	= ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultRoomNos() {
		return adultRoomNos;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
