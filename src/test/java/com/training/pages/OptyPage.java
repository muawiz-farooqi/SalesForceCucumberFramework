package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;

public class OptyPage extends BasePage {
	WebDriver driver;

	public OptyPage(WebDriver driver) {
		super(driver);
		
		addObject("PageHeading", By.xpath("//h1[@class='pageType']"));
		
		addObject("OptyDropdown", By.id("fcf"));
		addObject("AllOpty", By.xpath("//select[@id='fcf']/option[text()='All Opportunities']"));
		addObject("New", By.name("new"));
		addObject("OptyName", By.id("opp3"));
		addObject("AccountName", By.id("opp4"));
		addObject("CloseDate", By.id("opp9"));
		addObject("Today", By.xpath("//a[text()='Today']"));
		addObject("Stage", By.id("opp11"));
		addObject("Probability", By.id("opp12"));
		addObject("LeadSource", By.id("opp6"));
		addObject("PrimaryCampaign", By.id("opp17"));
		addObject("Save", By.name("save"));
		
		addObject("OptyPipeline", By.xpath("//a[text()='Opportunity Pipeline']"));
		addObject("OptyPipelinePage", By.xpath("//h1[normalize-space()='Opportunity Pipeline']"));
		
		addObject("StuckOpty", By.xpath("//a[text()='Stuck Opportunities']"));
		addObject("StuckOptyPage", By.xpath("//h1[text()='Stuck Opportunities']"));
		
		addObject("QuarterlySummaryInterval", By.id("quarter_q"));
		addObject("QuarterlySummaryInclude", By.id("open"));
		addObject("RunReport", By.xpath("//input[@value='Run Report']"));
		addObject("OptyReportPage", By.xpath("//h1[text()='Opportunity Report']"));
		
		
	}

}
