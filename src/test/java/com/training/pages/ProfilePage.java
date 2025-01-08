package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;

public class ProfilePage extends BasePage
{
	public ProfilePage(WebDriver driver) {
		super(driver);
		
		addObject("EditProfile", By.xpath("(//img[@alt='Edit Profile'])[1]"));
		
		addObject("AboutFrame", By.id("contactInfoContentId"));
		addObject("About", By.xpath("//a[contains(text(),'About')]"));
		addObject("LastName", By.id("lastName"));
		addObject("SaveAll", By.xpath("//input[@value='Save All']"));
		addObject("ProfileName", By.id("tailBreadcrumbNode"));
		
		addObject("PostLink", By.xpath("//span[text()='Post']"));
		addObject("PostFrame", By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		addObject("PostText", By.xpath("//body[text()='Share an update, @mention someone...']"));
		addObject("Share", By.id("publishersharebutton"));
		addObject("LatestPost", By.xpath("(//span[@class='feeditemtext cxfeeditemtext'])[1]"));
		
		addObject("FileLink", By.xpath("//span[text()='File']"));
		addObject("ComputerUpload", By.id("chatterUploadFileAction"));
		addObject("ChooseFile", By.id("chatterFile"));
		addObject("FileOverlay", By.id("uploadProgressDialog"));
		addObject("LatestFile", By.xpath("//span[@class='contentTitleLink']"));
		
		addObject("ProfilePhoto", By.xpath("(//img[@alt='Muhammad Muawiz Farooqixyz'])[1]"));
		addObject("AddPhoto", By.id("uploadLink"));
		addObject("AddPhotoFrame", By.id("uploadPhotoContentId"));
		addObject("ChoosePhoto", By.id("j_id0:uploadFileForm:uploadInputFile"));
		addObject("UploadButton", By.id("j_id0:uploadFileForm:uploadBtn"));
		
		addObject("NEHandle", By.xpath("//div[@class='imgCrop_handle imgCrop_handleNE']"));
		addObject("SEHandle", By.xpath("//div[@class='imgCrop_handle imgCrop_handleSE']"));
		addObject("NWHandle", By.xpath("//div[@class='imgCrop_handle imgCrop_handleNW']"));
		addObject("SWHandle", By.xpath("//div[@class='imgCrop_handle imgCrop_handleSW']"));
		
		addObject("SaveProfilePic", By.id("j_id0:j_id7:save"));
		addObject("DeletePhoto", By.id("deletePhoto"));
		
		addObject("AboutTabSelected", By.xpath("//ul[@class='zen-tabControl']/li[@class='zen-current']/a"));
	}
}

