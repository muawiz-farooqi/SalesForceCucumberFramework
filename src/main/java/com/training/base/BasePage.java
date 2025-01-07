package com.training.base;

import java.io.File;
import java.util.HashMap;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	HashMap<String, By> ObjectRepo = new HashMap<String, By>();

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void addObject(String label, By by) {
		ObjectRepo.put(label, by);
	}

	public WebElement getElement(String elementName) {
		By by = ObjectRepo.get(elementName);
		waitForLocator(by);
		return driver.findElement(by);
	}

	public void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 7);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForLocator(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 7);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	
	public void waitForWindows(int windows) {
		WebDriverWait wait = new WebDriverWait(driver, 7);
        wait.until(ExpectedConditions.numberOfWindowsToBe(windows));
	}

	public void enterIntoTextbox(String elementName, String value) {
		WebElement element = getElement(elementName);
		element.sendKeys(value);
	}

	public void clickOnButton(String elementName) {
		WebElement element = getElement(elementName);
		element.click();
	}

	public void clickOnRadioButton(String elementName) {
		WebElement element = getElement(elementName);
		element.click();
	}

	public void clearTextbox(String elementName) {
		WebElement element = getElement(elementName);
		element.clear();
	}

	public void waitForPage(String elementName) {
		WebElement element = getElement(elementName);
		waitForElement(element);
	}

	public void doesElementTextMatch(String elementName, String text) {
		WebElement element = getElement(elementName);
		Assert.assertEquals(text, element.getText());
	}

	public void setCheckboxState(String elementName, String checkboxStatus) {
		WebElement element = getElement(elementName);
		if (checkboxStatus.equalsIgnoreCase("Checked")) {
			if (!element.isSelected()) {
				element.click();
			}
		} else {
			if (element.isSelected()) {
				element.click();
			}
		}
	}

	public void changeFrame(String frameName, WebDriver driver) {
		this.driver = driver;
		WebElement frame = getElement(frameName);
		driver.switchTo().frame(frame);
	}

	public void defaultFrame(WebDriver driver) {
		this.driver = driver;
		driver.switchTo().defaultContent();
	}

	public void waitForSeconds(Integer time) {
		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void waitForInvisibility(String elementName, WebDriver driver) {
		WebElement element = getElement(elementName);
		this.driver = driver;
		WebDriverWait wait = new WebDriverWait(driver, 7);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public void mouseHoverOver(String elementName, WebDriver driver) {
		WebElement element = getElement(elementName);
		this.driver = driver;
		new Actions(driver).moveToElement(element).build().perform();
	}

	public void cropPhoto(String option) {
		if (option.equals("Full")) {
			Actions actions = new Actions(driver);
			WebElement NEHandle = getElement("NEHandle");
			WebElement SEHandle = getElement("SEHandle");
			WebElement NWHandle = getElement("NWHandle");
			WebElement SWHandle = getElement("SWHandle");

			waitForElement(NEHandle);
			actions.dragAndDropBy(NEHandle, 20, 20).build().perform();
			waitForElement(SEHandle);
			actions.dragAndDropBy(SEHandle, 20, -20).build().perform();
			waitForElement(NWHandle);
			actions.dragAndDropBy(NWHandle, -20, 20).build().perform();
			waitForElement(SWHandle);
			actions.dragAndDropBy(SWHandle, -20, -20).build().perform();
		}
	}

	public void doesElementTextContain(String elementName, String text) {
		WebElement element = getElement(elementName);
		Assert.assertTrue(element.getText().contains(text));
	}

	public boolean isFileDownloaded(String expectedFileName) {
		File downloadFolder = new File("C:\\Users\\muawi\\Downloads");

		int timeoutSeconds = 30;
		int waited = 0;

		while (waited < timeoutSeconds) {
			File[] files = downloadFolder.listFiles((dir, name) -> name.contains(expectedFileName));
			if (files != null && files.length > 0) {
				return true;
			}
			try {
				Thread.sleep(1000);
				waited++;
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		return false;
	}

	public void selectFromDropdown(String option, String elementName) {
		WebElement element = getElement(elementName);
		new Select(element).selectByVisibleText(option);
	}

	public boolean isTabAdded(String tabName, WebDriver driver) {
		WebElement menuButton = getElement("Menu");
		String original_tab = menuButton.getText();
		if (!original_tab.equalsIgnoreCase("Salesforce Chatter")) {
			menuButton.click();
			getElement("Salesforce Chatter").click();
		}

		this.driver = driver;
		boolean output;

		try {
			waitForElement(getElement(tabName));
			output = true;
		} catch (TimeoutException e) {
			output = false;
		}

		menuButton.click();
		getElement("Sales").click();

		return output;
	}

	public String matchWindowHeader(WebDriver driver) {
		this.driver = driver;
		
		String parentHandle = driver.getWindowHandle();
		
		waitForWindows(2);
		
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle);
		}
		
		String headerText = getElement("WindowDivHeader").getText();
		
		driver.close();
		driver.switchTo().window(parentHandle);
		
		return headerText;
	}

	public Object getWindowTitle(WebDriver driver) {
		this.driver = driver;
		String parentHandle = driver.getWindowHandle();
			
		waitForSeconds(1);
		
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle);
		}
		
		String windowTitle = driver.getTitle();
		driver.switchTo().window(parentHandle);
		
		return windowTitle;
	}

	public void closeWindow(String windowName, WebDriver driver) {
		this.driver = driver;
		String parentHandle = driver.getWindowHandle();

		waitForSeconds(1);
		
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle);
			
			if (driver.getTitle().equalsIgnoreCase(windowName)) {
				break;
			}
		}
		
		driver.close();
		driver.switchTo().window(parentHandle);
	}

	public boolean isWindowClosed(String windowName, WebDriver driver) {
		waitForSeconds(1);
		this.driver = driver;
		String parentHandle = driver.getWindowHandle();

		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle);
			
			if (driver.getTitle().equalsIgnoreCase(windowName)) {
				return false;
			}
		}
		
		driver.switchTo().window(parentHandle);
		return true;
	}

	public void acceptAlert(WebDriver driver) {
		this.driver = driver;
		driver.switchTo().alert().accept();
	}

}
