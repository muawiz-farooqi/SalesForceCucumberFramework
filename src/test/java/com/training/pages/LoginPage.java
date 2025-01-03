package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;

public class LoginPage extends BasePage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		
		addObject("LoginPage", By.id("usernamegroup"));

		addObject("Username", By.id("username"));
		addObject("Password", By.id("password"));
		addObject("Login", By.id("Login"));
		addObject("Error", By.id("error"));
		addObject("RememberMe", By.id("rememberUn"));
		addObject("Saved Username", By.id("idcard-identity"));
		
		addObject("ForgotPasswordLink", By.id("forgot_password_link"));
		addObject("ForgotUsername", By.id("un"));
		addObject("Continue", By.id("continue"));
		addObject("Header", By.id("header"));
	}

}
