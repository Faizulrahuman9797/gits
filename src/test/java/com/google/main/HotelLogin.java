package com.google.main;

import org.openqa.selenium.WebDriver;

import com.google.utils.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelLogin extends BaseClass{
	static WebDriver driver;
	FirstLogin fl;
	FirstPage fp;
	SearchOption so;
	
	@Given("Launch the browser")
	public void launch_the_browser() {
	   driver= launchBrowser("chrome");
	 
	   fp=new FirstPage(driver);
	   so=new SearchOption(driver); 
	   fl=new FirstLogin(driver);
	}

	@Given("Open application")
	public void open_application() {
	   openApp("https://adactinhotelapp.com/");
	}

	@When("Enter the  {string} and valid {string}")
	public void enter_the_and_valid(String username, String password) {
		
		sendValue(fl.getUsername(),username);
		sendValue(fl.getPassword(),password);
		tap(fl.getLogin());
	
	}

	@When("Enter the {string} and hotel {string} and room {string}")
	public void enter_the_and_hotel_and_room(String location, String hotel, String room) {
		sendValue(so.getLocation(), location);
		sendValue(so.getHotels(), hotel);
		sendValue(so.getRoomtype(), room);
	    tap(so.getSearch());
	    tap(so.getSelectHotel());
	    tap(so.getContinueButton());
	   
	}
	
	@When("Enter the first {string} and lastname {string} and {string}")
	public void enter_the_first_and_lastname_and(String first, String last, String address) {
	  sendValue(fp.getFirstName(), first);
	  sendValue(fp.getLastName(), last);
	  sendValue(fp.getAddress(), address);
	}

	@When("Enter the cardno {string} and cardtype {string} and month {string} and year {string} and cvv {string}")
	public void enter_the_cardno_and_cardtype_and_month_and_year_and_cvv(String cardno, String cardtype, String month, String year, String cvv) {
	 sendValue(fp.getCardNo(),cardno);
	 select(fp.getCardType(), cardtype);
	 select(fp.getExpiryDate(), month);
	 select(fp.getExpiryMonth(), year);
	 sendValue(fp.getCvv(), cvv);
	 tap(fp.getBookButton());
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		javascript(fp.getJavasc());
		screenshot("orderId");
	  System.out.println("Validate the Output");
	}
	
	@Then("close the browser")
	public void close_the_browser() {
	  driver.close();
	}

	

}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	