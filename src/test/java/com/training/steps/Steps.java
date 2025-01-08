package com.training.steps;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseTest {
	WebDriver driver;
	BasePage page = new BasePage(driver);

	@Given("User launch the application")
	public void user_launch_the_application() {
		driver = launchApplication();
	}

	@Given("User is on {string}")
	public void user_is_on(String pageName) {
		/*
		 * Create the instance of the page takes driver as parameter pass the driver to
		 * the BasePage through the page constructor -while creating the object of the
		 * page -which loads the ObjectRepo-String/By- to ObjectRepo in BasePage
		 */
//		Class<?> ClassName;
//		Constructor<?> constructor;

		String packageName = "com.training.pages";
		String fullPath = packageName + "." + pageName;

		try {
//			ClassName = Class.forName(fullPath);
//			constructor = ClassName.getDeclaredConstructor(WebDriver.class);
//			constructor.newInstance(driver);
			page = (BasePage) Class.forName(fullPath).getDeclaredConstructor(WebDriver.class).newInstance(driver);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("User enter into textbox {string} {string}")
	public void user_enter_into_textbox(String elementName, String value) {
//		 page contains - driver, objectRepo, element and By, all the methods
		page.enterIntoTextbox(elementName, value);
	}

	@Then("User click on Button {string}")
	public void user_click_on_button(String elementName) {
		page.clickOnButton(elementName);
	}

	@Then("User click on Radio Button {string}")
	public void user_click_on_radio_button(String elementName) {
		page.clickOnRadioButton(elementName);
	}

	@Then("User clears textbox {string}")
	public void user_clears_textbox(String elementName) {
		page.clearTextbox(elementName);
	}

	@Then("Does Element Text Match {string} {string}")
	public void does_element_text_match(String elementName, String text) {
		page.doesElementTextMatch(elementName, text);
	}
	
	@Then("Does Element Text Contain {string} {string}")
	public void does_element_text_contain(String elementName, String text) {
	    page.doesElementTextContain(elementName, text);
	}

	@When("User sets checkbox {string} {string}")
	public void user_sets_checkbox(String elementName, String checkboxStatus) {
		page.setCheckboxState(elementName, checkboxStatus);
	}

	@Then("Is User on {string}")
	public void is_user_on(String pageName) {
		page.waitForPage(pageName);
	}

	@When("Change frame to {string}")
	public void change_frame_to(String frameName) {
		page.changeFrame(frameName, driver);
	}

	@When("Return to Default Frame")
	public void return_to_default_frame() {
		page.defaultFrame(driver);
	}

	@When("Page updates after {int} second")
	public void page_updates_after_second(Integer time) {
		page.waitForSeconds(time);
	}

	@When("User send path {string} {string}")
	public void user_send_path(String elementName, String filePath) {
		page.enterIntoTextbox(elementName, filePath);
	}

	@When("User waits for {string} to disappear")
	public void user_waits_for_to_disappear(String elementName) {
		page.waitForInvisibility(elementName, driver);
	}

	@When("User hovers mouse over {string}")
	public void user_hovers_mouse_over(String elementName) {
		page.mouseHoverOver(elementName, driver);
	}

	@When("User crops photo to size {string}")
	public void user_crops_photo_to_size(String option) {
		page.cropPhoto(option);
	}
	
	@Then("Check If File Downloaded {string}")
	public void check_if_file_downloaded(String fileName) {
	    Assert.assertTrue(page.isFileDownloaded(fileName));
	}
	@When("User selects {string} option from {string} dropdown")
	public void user_selects_option_from_dropdown(String option, String elementName) {
	    page.selectFromDropdown(option, elementName);
	}
	@Then("Is Tab Added {string}")
	public void is_tab_added(String tabName) {
		Assert.assertTrue(page.isTabAdded(tabName, driver));
	}
	
	@Then("Does Window Header Match {string}")
	public void does_window_header_match(String headerText) {
		Assert.assertEquals(page.matchWindowHeader(driver), headerText);
	}
	
	@Then("Does Window Title Match {string}")
	public void does_window_title_match(String windowTitle) {
	    Assert.assertEquals(page.getWindowTitle(driver), windowTitle);
	}
	@When("User closes Window {string}")
	public void user_closes_window(String windowName) {
	    page.closeWindow(windowName, driver);
	}
	@Then("{string} Window is Closed")
	public void window_is_closed(String windowName) {
	    Assert.assertTrue(page.isWindowClosed(windowName, driver));
	}
	
	@When("User clicks OK on Alert")
	public void user_clicks_ok_on_alert() {
	    page.acceptAlert(driver);
	}
	
	@Given("User clicks on Contact named {string}")
	public void user_clicks_on_contact_named(String contactName) {
	    page.clickContact(driver, contactName);
	}
	
	@Then("Is User Menu Name Updated {string}")
	public void is_user_menu_name_updated(String name) {
	    Assert.assertTrue(page.checkMenuName(name));
	}
	
	@Then("Is Tab Removed {string}")
	public void is_tab_removed(String tabName) {
	    Assert.assertTrue(page.isTabRemoved(tabName));
	}
	
	@Then("Is {string} Removed From Bar")
	public void is_removed_from_bar(String tabName) {
		Assert.assertTrue(page.isTabRemovedFromBar(tabName, driver));
	}
	
	@When("User click on Time {string}")
	public void user_click_on_time(String time) {
	    page.clickCalendarTime(time, driver);
	}
	@Then("{int} Windows will be Open")
	public void windows_will_be_open(Integer numWindows) {
	    page.waitForWindows(numWindows);
	}
	@When("User clicks Button {string} in New Window")
	public void user_clicks_button_in_new_window(String buttonName) {
	    page.clickButtonInNewWindow(buttonName);
	}
	@Then("{string} contains {string} option")
	public void contains_option(String elementName, String option) {
		Assert.assertTrue(page.elementContainsOption(elementName, option));
	}
	@When("User picks end time {string}")
	public void user_picks_end_time(String time) {
	    page.pickEndTime(driver, time);
	}
	@Then("Does {string} match {string}")
	public void does_end_time_match(String elementName, String time) {
	    Assert.assertTrue(page.endtimeMatch(elementName, time));
	}
	@Then("{string} event displayed with {string} : {string} and {string} : {string}")
	public void event_displayed_with_and(String option, String startElementName, String startTime, String endElementName, String endTime) {
	    Assert.assertTrue(page.eventDisplayed(option, startElementName, startTime, endElementName, endTime));
	}
	
	@Then("{string} box is {string}")
	public void box_is(String elementName, String status) {
		Assert.assertTrue(page.isBoxSelected(elementName, status));
	}
	@When("User select on date with {int} week interval")
	public void user_select_on_date_with_week_interval(Integer interval) {
	    page.selectDateWeekInterval(interval, driver);
	}
	@Then("{string} is selected")
	public void is_selected(String elementName) {
		Assert.assertTrue(page.isElementSet(elementName));
	}
	@Then("{int} Week {string} event displayed with {string} : {string} and {string} : {string}")
	public void week_event_displayed_with_and(Integer interval, String option, String startElementName, String startTime, String endElementName, String endTime) {
	    Assert.assertTrue(page.recurringEventDisplayed(driver, interval, option, startElementName, startTime, endElementName, endTime));
	}

	@After
	public void teardown(Scenario scenario) {
		byte[] screenshot = null;
		screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());

		closeBrowser();
	}
}
