package com.actitime.genericlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class WebDriverCommonLib extends BaseTest {
	
	public void pageTitle() {
		d.getTitle();
	}

	public void verify(String expected , String actual , String value) {
		Assert.assertEquals(expected, actual);
		Reporter.log(value+"is  displayed", true);
	}
	
	public void mouseover(WebElement target) {
		Actions act = new Actions(d); 
		act.moveToElement(target).perform();
	}
	
	public void switchToFrame(int index) {
		d.switchTo().frame(index);
	}
	
	public void switchToFrame(String attribute) {
		d.switchTo().frame(attribute);
	}
	
	public void switchToFrame(WebElement element) {
		d.switchTo().frame(element);
	}
	public void selectOption(WebElement element ,int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectOption(WebElement element , String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void selectOption(String Value,WebElement element) {
		Select sel = new Select(element);
		sel.selectByValue(Value);
	}
	public void waitForPage(String title) {
		WebDriverWait wait = new WebDriverWait(d, 15);
		wait.until(ExpectedConditions.titleContains(title));
	}
	

}
