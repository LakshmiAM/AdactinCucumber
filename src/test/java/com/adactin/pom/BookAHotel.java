package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel {
	public WebDriver driver;

	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getAddress() {
		return address;
	}


	public WebElement getCreditCardNo() {
		return creditCardNo;
	}


	public WebElement getCreditCardType() {
		return creditCardType;
	}


	public WebElement getCardExpirtDate() {
		return cardExpirtDate;
	}


	public WebElement getCc_cvv() {
		return cc_cvv;
	}


	public WebElement getBookNowbtn() {
		return bookNowbtn;
	}


	@FindBy(id = "first_name")
	private WebElement firstName;
	
	@FindBy(id ="last_name")
	private WebElement lastName;
	
	@FindBy(id ="address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement creditCardNo;
	
	@FindBy(id = "cc_type")
	private WebElement creditCardType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement cardExpirtDate;
	
	@FindBy(id = "cc_cvv")
	private WebElement cc_cvv;
	
	@FindBy(id = "book_now")
	private WebElement bookNowbtn;
	
	public BookAHotel(WebDriver ldriver) {
	this.driver = ldriver;
	PageFactory.initElements(driver, this);
	}
	
}
