package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;

public class SettingsPage extends BasePage
{
	public SettingsPage(WebDriver driver) {
		super(driver);
		
		addObject("Personal", By.xpath("//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('PersonalInfo');\"]"));
		addObject("LoginHistory", By.id("LoginHistory_font"));
		addObject("DownloadLoginHistory", By.xpath("//a[contains(text(),'Download login history')]"));
		
		addObject("DisplayLayout", By.xpath("//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('DisplayAndLayout');\"]"));
		addObject("CustomizeTabs", By.id("CustomizeTabs_font"));
		addObject("CustomApp", By.id("p4"));
		addObject("ReportsOption", By.xpath("//option[text()='Reports']"));
		addObject("Add", By.id("duel_select_0_right"));
		addObject("Save", By.id("save"));
		addObject("ReportsTab", By.xpath(""));
		
		addObject("Email", By.xpath("//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('EmailSetup');\"]"));
		addObject("EmailSettings", By.id("EmailSettings_font"));
		addObject("EmailName", By.id("sender_name"));
		addObject("EmailAddress", By.id("sender_email"));
		addObject("AutoBCC", By.id("auto_bcc1"));
		addObject("MessageText", By.xpath("//div[@class='messageText']"));
		
		addObject("Calendar&Reminders", By.xpath("//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('CalendarAndReminders');\"]"));
		addObject("ActivityReminders", By.id("Reminders_font"));
		addObject("Open Test Reminder", By.id("testbtn"));
		
		addObject("Menu", By.id("tsidLabel"));
		addObject("Salesforce Chatter", By.xpath("//a[text()='Salesforce Chatter']"));
		addObject("Sales", By.xpath("//a[text()='Sales']"));
		addObject("Reports", By.xpath("//a[normalize-space()='Reports']"));
		addObject("WindowDivHeader", By.xpath("//div[@id='summary0']/div"));
		addObject("Save", By.name("save"));
	}
}

