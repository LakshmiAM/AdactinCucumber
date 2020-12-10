package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookItenary {

	public WebDriver driver;
	
	@FindBy(name = "ids[]")
	private WebElement checkbox;
	
	@FindBy(id = "logout")
	private WebElement logOut;
	
	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getLogOut() {
		return logOut;
	}

	public BookItenary(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
}
