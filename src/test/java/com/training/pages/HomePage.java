package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;

public class HomePage extends BasePage
{
	public HomePage(WebDriver driver) {
		super(driver);

		addObject("HomePage", By.xpath("//h2[normalize-space()='Getting Started']"));
		
		addObject("HomeTab", By.xpath("//a[@title='Home Tab']"));
		addObject("LeadsTab", By.xpath("//a[@title='Leads Tab']"));
		addObject("AccountsTab", By.xpath("//a[@title='Accounts Tab']"));
		addObject("ContactsTab", By.xpath("//a[@title='Contacts Tab']"));
		addObject("OpportunitiesTab", By.xpath("//a[@title='Opportunities Tab']"));
		addObject("AllTabs", By.xpath("//img[@title='All Tabs']"));
		
		addObject("UserNavMenu", By.id("userNavLabel"));
		addObject("UserNavDropDownList", By.xpath("(//div[@id='userNav-menuItems']/a)[1]"));
		addObject("My Profile", By.xpath("//a[normalize-space()='My Profile']"));
		addObject("My Settings", By.xpath("//a[normalize-space()='My Settings']"));
		addObject("Logout", By.xpath("//a[normalize-space()='Logout']"));
	}
}
