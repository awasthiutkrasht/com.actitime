package com.actitime.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElement {
	
	@FindBy(xpath="//div[@id='container_tasks']") private WebElement tasktb;
	@FindBy(xpath="//div[@id='container_reports']") private WebElement reportb;
	@FindBy(xpath="//div[@id='container_users']") private WebElement usertb;
	
	public HomePageElement(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	public WebElement getTaskTb() {
		return tasktb;
	}
	public WebElement getReporTb() {
		return reportb;
	}
	public WebElement getUserTb() {
		return usertb;
	}
	public void clickUserTb() {
		usertb.click();
	}
	
	
	

}
