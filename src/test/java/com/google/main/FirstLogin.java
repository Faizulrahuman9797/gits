package com.google.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.utils.BaseClass;

public class FirstLogin extends BaseClass {
	WebDriver driver ;
	
	 public FirstLogin(WebDriver driver) {
		
		 PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "(//input[@class='login_input'])[1]")
	private WebElement username ;
	@FindBy(xpath = "(//input[@class='login_input'])[2]")
	private WebElement password;
	@FindBy(xpath = "//input[@id='login']")
	private WebElement login;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;  
	}
	public WebElement getLogin() {
		return login; 
	}

}

