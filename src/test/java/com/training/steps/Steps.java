package com.training.steps;

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

	@After
	public void teardown(Scenario scenario) {
		byte[] screenshot = null;
		screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());

		closeBrowser();
	}
}
