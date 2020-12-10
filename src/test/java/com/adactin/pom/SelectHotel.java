package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
	public WebDriver driver;

	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement selectHotelRadiobtn;
	
	@FindBy(id = "continue")
	private WebElement continuebtn;
	
	@FindBy(id= "cancel")
	private WebElement cancel;
	
	public SelectHotel(WebDriver ldriver) {
	this.driver = ldriver;
	PageFactory.initElements(driver, this);
	}
	
	public WebElement getSelectHotelRadiobtn() {
		return selectHotelRadiobtn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public WebElement getCancel() {
		return cancel;
	}

}
