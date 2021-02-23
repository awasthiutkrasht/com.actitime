package com.actitime.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="username") private WebElement untb;
	@FindBy(name="pwd") private WebElement pwtb;
	@FindBy(xpath="//div[text()='Login ']") private WebElement loginBtn;
	
	public LoginPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	public WebElement getusername() {
		return untb;
	}
	public WebElement getpassword() {
		return pwtb;
	}
	public WebElement getloginBtn() {
		return loginBtn;
	}
	public void setusername(String un) {
		untb.sendKeys(un);
	}
	public void setpassword(String pwd) {
		pwtb.sendKeys(pwd);
	}
	public void clickloginBtn() {
		loginBtn.click();
	}
	public void login(String un ,  String pwd ) {
		untb.sendKeys(un);
		pwtb.sendKeys(pwd);
		loginBtn.click();
	}
}
