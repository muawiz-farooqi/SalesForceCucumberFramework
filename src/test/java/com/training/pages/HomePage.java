package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;

public class HomePage extends BasePage
{
	public HomePage(WebDriver driver) {
		super(driver);

		addObject("HomePage", By.xpath("//h2[normalize-space()='Getting Started']"));
		addObject("AllTabsPage", By.xpath("//h1[normalize-space()='All Tabs']"));
		addObject("CustomizeTabsPage", By.xpath("//h1[normalize-space()='Customize My Tabs']"));
		
		addObject("HomeTab", By.xpath("//a[@title='Home Tab']"));
		addObject("AccountsTab", By.xpath("//a[@title='Accounts Tab']"));
		addObject("OpportunitiesTab", By.xpath("//a[@title='Opportunities Tab']"));
		addObject("LeadsTab", By.xpath("//a[@title='Leads Tab']"));
		addObject("ContactsTab", By.xpath("//a[@title='Contacts Tab']"));
		addObject("AllTabs", By.xpath("//img[@title='All Tabs']"));
		
		addObject("UserNavMenu", By.id("userNavLabel"));
		addObject("UserNavDropDownList", By.xpath("(//div[@id='userNav-menuItems']/a)[1]"));
		addObject("My Profile", By.xpath("//a[normalize-space()='My Profile']"));
		addObject("My Settings", By.xpath("//a[normalize-space()='My Settings']"));
		addObject("Developer Console", By.xpath("//a[normalize-space()='Developer Console']"));
		addObject("Logout", By.xpath("//a[normalize-space()='Logout']"));
		
		addObject("onHomePage", By.xpath("//li[contains(@class,'zen-active') and @id='home_Tab']"));
		addObject("Name", By.xpath("//h1[@class='currentStatusUserName']/a"));
		
		addObject("CustomizeTabs", By.xpath("//input[@title='Customize My Tabs']"));
		addObject("Forecasts", By.xpath("//option[text()='Forecasts']"));
		addObject("Remove", By.id("duel_select_0_left"));
		addObject("Save", By.name("save"));
		
		addObject("CurrentDate", By.xpath("//span[@class='pageDescription']/a"));
	}
}
