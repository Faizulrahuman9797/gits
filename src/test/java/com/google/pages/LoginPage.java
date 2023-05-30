package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(id="email")
private WebElement username;

@FindBy(id="pass")
private WebElement password;

@FindBy(id="login")
private WebElement login;

@FindBy(xpath="//a[text()='Forgotten Password?']")
private WebElement forgotPassword;

@FindBy(xpath="//a[text()='Create new account?']")
private WebElement createAccount;


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
