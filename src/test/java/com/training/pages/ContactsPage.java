package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;

public class ContactsPage extends BasePage {
	WebDriver driver;

	public ContactsPage(WebDriver driver) {
		super(driver);
		
		addObject("PageHeading", By.xpath("//h1[@class='pageType']"));
		
		addObject("New", By.name("new"));
		addObject("NewContactPage", By.xpath("//h2[normalize-space()='New Contact']"));
		addObject("LastName", By.id("name_lastcon2"));
		addObject("Save", By.name("save"));
		addObject("ContactDisplayPage", By.xpath("//h2[@class='topName']"));
		
		addObject("CreateNewView", By.xpath("//a[text()='Create New View']"));
		addObject("CreateNewViewPage", By.xpath("//h2[normalize-space()='Create New View']"));
		addObject("ViewName", By.id("fname"));
		addObject("UniqueViewName", By.id("devname"));
		addObject("SelectedDropdownOption", By.xpath("//option[@selected='selected']"));
		
		addObject("RecentsDropdown", By.id("hotlist_mode"));
		addObject("ContactsList", By.xpath("//table[@class='list']/tbody/tr"));
		
		addObject("ContactsDropdown", By.id("fcf"));
		
		addObject("ViewErrorMessage", By.xpath("//div[@class='requiredInput']//div[@class='errorMsg']"));
		addObject("Cancel", By.name("cancel"));
		addObject("AccountName", By.id("con4"));
		addObject("SaveAndNew", By.name("save_new"));
		
	}

}
