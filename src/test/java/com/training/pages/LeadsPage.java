package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;

public class LeadsPage extends BasePage {
	WebDriver driver;

	public LeadsPage(WebDriver driver) {
		super(driver);
		
		addObject("PageHeading", By.xpath("//h1[@class='pageType']"));
		
		addObject("LeadsDropdown", By.id("fcf"));
		addObject("AllLeads", By.xpath("//select[@id='fcf']/option[text()='All Open Leads']"));
		
		addObject("Go", By.xpath("//input[@title='Go!']"));
		addObject("SelectedDropdownOption", By.xpath("//option[@selected='selected']"));
		
		addObject("New", By.name("new"));
		addObject("CreateNewLeadPage", By.xpath("//h2[normalize-space()='New Lead']"));
		addObject("LastName", By.id("name_lastlea2"));
		addObject("CompanyName", By.id("lea3"));
		addObject("Save", By.name("save"));
		addObject("NewLeadPage", By.xpath("//h2[@class='topName']"));
	}

}
