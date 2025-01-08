package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;

public class CalendarPage extends BasePage {
	WebDriver driver;

	public CalendarPage(WebDriver driver) {
		super(driver);
		
		addObject("ComboBox", By.xpath("//a[@title='Combo (New Window)']"));
		addObject("NewEvent", By.xpath("//input[@title='New Event']"));
		addObject("PageHeading", By.xpath("//h2[@class='pageDescription']"));
		addObject("Subject", By.id("evt5"));
		addObject("EndTime", By.id("EndDateTime_time"));
		addObject("TimePicker", By.id("simpleTimePicker"));
		addObject("Save", By.name("save"));
		addObject("EventStartTime", By.xpath("(//td[@class='dataCol'])[5]"));
		addObject("EventEndTime", By.xpath("//td[@class='dataCol last']"));
		
		addObject("Recurring", By.id("IsRecurrence"));
		addObject("WeeklyRecurrence", By.id("rectypeftw"));
		addObject("RecurrenceEndDate", By.id("RecurrenceEndDateOnly"));
		addObject("TodayDate", By.xpath("//td[contains(@class,'todayDate')]"));
		addObject("NextMonth", By.xpath("//img[@title='Next Month']"));
		addObject("MonthView", By.xpath("//img[@title='Month View']"));
	}

}
