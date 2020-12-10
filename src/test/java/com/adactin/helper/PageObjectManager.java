package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookAHotel;
import com.adactin.pom.BookItenary;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
	public WebDriver driver;
	
	private HomePage hp;
	private SearchHotel sh;
	private SelectHotel s1;
	private BookAHotel bh;
	private BookItenary bi;
	
	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	public HomePage getHp() {
		return hp;
	}
	
	public SearchHotel getSh() {
		return sh;
	}
	public SelectHotel getS1() {
		return s1;
	}
	public BookAHotel getBh() {
		return bh;
	}
	
	public BookItenary getBi() {
		return bi;
	}
	
	
	
}
