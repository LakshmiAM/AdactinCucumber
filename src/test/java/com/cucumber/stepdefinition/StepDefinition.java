package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.pom.BookAHotel;
import com.adactin.pom.BookItenary;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;
import com.cucumber.runner.TestRunner;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass {
	public static WebDriver driver = TestRunner.driver;

	@Given("^User launches the application$")
	public void user_launches_the_application() throws Throwable {
		// driver = getBrowser("chrome");
		// geturl("http://adactinhotelapp.com/");
		String url = FileReaderManager.getInstance().getCrInstance().getUrl();
		geturl(url);
	}

	@When("^User enters the valid \"([^\"]*)\" in the username field$")
	public void user_enters_the_valid_in_the_username_field(String username) throws Throwable {
		HomePage hp = new HomePage(driver);
		inputValuetoElement(hp.getUserName(), username);
	}

	@When("^User enters the valid \"([^\"]*)\" in the password field$")
	public void user_enters_the_valid_in_the_password_field(String password) throws Throwable {
		HomePage hp = new HomePage(driver);
		inputValuetoElement(hp.getPassword(), password);
	}

	@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		HomePage hp = new HomePage(driver);
		clickOnElement(hp.getLogin());
	}

	@Then("^user verified HomePage navigates to Search Hotel Page$")
	public void user_verified_HomePage_navigates_to_Search_Hotel_Page() throws Throwable {

	}

	@When("^user selects the Location \"([^\"]*)\" as \"([^\"]*)\"in Select Location drop down field$")
	public void user_selects_the_Location_as_in_Select_Location_drop_down_field(String arg1, String arg2)
			throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		selectDropDown(sh.getLocation(), "Sydney", "value");
	}

	@When("^User selects the Hotel \"([^\"]*)\" as \"([^\"]*)\" in Select Hotel drop downfield$")
	public void user_selects_the_Hotel_as_in_Select_Hotel_drop_downfield(String arg1, String arg2) throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		selectDropDown(sh.getHotels(), "Hotel Sunshine", "text");
	}

	@When("^User selects the Room Type \"([^\"]*)\" as \"([^\"]*)\" in Room Type drop down$")
	public void user_selects_the_Room_Type_as_in_Room_Type_drop_down(String arg1, String arg2) throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		selectDropDown(sh.getRoomType(), "Double", "value");
	}

	@When("^User selects the Number of Rooms as \"([^\"]*)\" in Number of Rooms drop down$")
	public void user_selects_the_Number_of_Rooms_as_in_Number_of_Rooms_drop_down(String arg1) throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		selectDropDown(sh.getRoomNos(), "2 - Two", "value");
	}

	@When("^USer selects Check In Date as \"([^\"]*)\" from Check In Date field$")
	public void user_selects_Check_In_Date_as_from_Check_In_Date_field(String arg1) throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		selectDropDown(sh.getCheckInDate(), "17/12/2020", "text");
	}

	@When("^User selects Check Out Date from \"([^\"]*)\" Check Out Date field$")
	public void user_selects_Check_Out_Date_from_Check_Out_Date_field(String arg1) throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		selectDropDown(sh.getCheckOutDate(), "19/12/2020", "text");
	}

	@When("^User selects Adults per Room as \"([^\"]*)\" from Adults per Room field$")
	public void user_selects_Adults_per_Room_as_from_Adults_per_Room_field(String arg1) throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		selectDropDown(sh.getAdultRoomNos(), "1 - One", "index");
	}

	@When("^User selects Children per Room as \"([^\"]*)\" from Children per Room 	 drop down$")
	public void user_selects_Children_per_Room_as_from_Children_per_Room_drop_down(String arg1) throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		selectDropDown(sh.getChildRoom(), "0", "text");
	}

	@When("^User clicks on Search button$")
	public void user_clicks_on_Search_button() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		clickOnElement(sh.getSubmit());
	}

	@Then("^User verify the Search Hotel page navigate to select Hotel Page\\.$")
	public void user_verify_the_Search_Hotel_page_navigate_to_select_Hotel_Page() throws Throwable {
	}

	@When("^User clicks on Select Hotel radio button$")
	public void user_clicks_on_Select_Hotel_radio_button() throws Throwable {
		SelectHotel s1 = new SelectHotel(driver);
		clickOnElement(s1.getSelectHotelRadiobtn());
	}

	@When("^User clicks on Continue button$")
	public void user_clicks_on_Continue_button() throws Throwable {
		SelectHotel s1 = new SelectHotel(driver);
		clickOnElement(s1.getContinuebtn());
	}

	@Then("^user verify the select hotel page navigates to Book a Hotel page\\.$")
	public void user_verify_the_select_hotel_page_navigates_to_Book_a_Hotel_page() throws Throwable {

	}

	@When("^User enter First Name as \"([^\"]*)\" field value$")
	public void user_enter_First_Name_as_field_value(String firstName) throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputValuetoElement(bh.getFirstName(), firstName);
	}

	@When("^User enter Last Nameas \"([^\"]*)\" Field Value$")
	public void user_enter_Last_Nameas_Field_Value(String lastname) throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputValuetoElement(bh.getLastName(), lastname);
	}

	@When("^User enter Billing Address as \"([^\"]*)\" field value$")
	public void user_enter_Billing_Address_as_field_value(String address) throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputValuetoElement(bh.getAddress(), address);
	}

	@When("^User enter Credit Card No field as \"([^\"]*)\"$")
	public void user_enter_Credit_Card_No_field_as(String cardNo) throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputValuetoElement(bh.getCreditCardNo(), cardNo);
	}

	@When("^User enter Credit Card Type field as \"([^\"]*)\"$")
	public void user_enter_Credit_Card_Type_field_as(String cardType) throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputValuetoElement(bh.getCreditCardType(), cardType);
	}

	@When("^USer enter Expiry Date field as \"([^\"]*)\"$")
	public void user_enter_Expiry_Date_field_as(String cardExpiryDate) throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputValuetoElement(bh.getCardExpirtDate(), cardExpiryDate);
	}

	@When("^User enter CVV Number as \"([^\"]*)\"$")
	public void user_enter_CVV_Number_as(String cvv) throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputValuetoElement(bh.getCc_cvv(), cvv);
	}

	@When("^User clicks on Book Now button$")
	public void user_clicks_on_Book_Now_button() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		clickOnElement(bh.getBookNowbtn());
	}

	@Then("^User verify Booking confirmation page is displayed\\.$")
	public void user_verify_Booking_confirmation_page_is_displayed() throws Throwable {
	}

	@When("^User checks on order ID checkbox$")
	public void user_checks_on_order_ID_checkbox() throws Throwable {
		BookItenary bi = new BookItenary(driver);
		clickOnElement(bi.getCheckbox());
	}

	@When("^User click on LogOut Selected button$")
	public void user_click_on_LogOut_Selected_button() throws Throwable {
	    BookItenary bi = new BookItenary(driver);
		bi.getLogOut();
	}

	@Then("^User verify Logout from the session\\.$")
	public void user_verify_Logout_from_the_session() throws Throwable {
	}
}
