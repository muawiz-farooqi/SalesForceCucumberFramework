package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;

public class AccountsPage extends BasePage {
	WebDriver driver;

	public AccountsPage(WebDriver driver) {
		super(driver);
		
		addObject("PageHeading", By.xpath("//h1[@class='pageType']"));
		addObject("New", By.name("new"));
		addObject("AccountName", By.id("acc2"));
		addObject("Type", By.id("acc6"));
		addObject("Priority", By.id("00Nak000006gZ9C"));
		addObject("Save", By.xpath("(//input[@value=' Save '])[1]"));
		addObject("AccountNameHeading", By.xpath("//h2[@class='topName']"));
		
		addObject("CreateNewView", By.xpath("//a[normalize-space()='Create New View']"));
		addObject("ViewName", By.id("fname"));
		addObject("UniqueViewName", By.id("devname"));
		addObject("CurrentSelectedView", By.xpath("//option[@selected='selected']"));
		
		addObject("ViewSelect", By.id("fcf"));
		addObject("Edit", By.xpath("(//a[contains(text(),'Edit')])[1]"));
		addObject("Field", By.id("fcol1"));
		addObject("Operator", By.id("fop1"));
		addObject("Value", By.id("fval1"));
		addObject("FieldToDisplay", By.id("colselector_select_0"));
		addObject("LastActivity", By.xpath("//div[@title='Last Activity']"));
		addObject("Add", By.xpath("(//img[@title='Add'])[1]"));
		
		addObject("MergeAccounts", By.xpath("//a[text()='Merge Accounts']"));
		addObject("SearchBar", By.id("srch"));
		addObject("Search", By.xpath("//input[@name='srchbutton']"));
		addObject("Checkbox1", By.id("cid0"));
		addObject("Checkbox2", By.id("cid1"));
		addObject("Next", By.xpath("(//input[@title='Next'])[1]"));
		addObject("ValidMergePage", By.xpath("//h2[normalize-space()='Step 2. Select the values to retain']"));
		addObject("Merge", By.name("save"));
		addObject("AccountHomePage", By.xpath("//h2[normalize-space()='Home']"));
		
		addObject("MoreThan30Days", By.xpath("//a[text()='Accounts with last activity > 30 days']"));
		addObject("ReportPage", By.xpath("//h2[normalize-space()='Unsaved Report']"));
		addObject("DateField", By.id("ext-gen20"));
		addObject("CreatedDate", By.xpath("//div[text()='Created Date']"));
		addObject("FromDate", By.id("ext-gen152"));
		addObject("FromDateToday", By.id("ext-gen281"));
		addObject("ToDate", By.id("ext-gen154"));
		addObject("ToDateToday", By.id("ext-gen296"));
		addObject("SaveReport", By.id("ext-gen49"));
		addObject("ReportName", By.id("saveReportDlg_reportNameField"));
		addObject("UniqueReportName", By.id("saveReportDlg_DeveloperName"));
		addObject("Save And Run Report", By.xpath("//button[text()='Save and Run Report']"));
		addObject("ReportPageHeader", By.xpath("(//h1)[2]"));
		
	}

}
