package com.actitime.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Userlist {
	
	@FindBy(xpath="//div[text()='New User']") private WebElement newuserBtn;
	@FindBy(xpath="//input[@id='createUserPanel_firstNameField']") private WebElement fn;
	@FindBy(xpath="//input[@id='createUserPanel_middleNameField']") private WebElement mn;
	@FindBy(xpath="//input[@id='createUserPanel_lastNameField']") private WebElement ln;
	@FindBy(xpath="//input[@id='createUserPanel_emailField']") private WebElement emailtb;
	@FindBy(xpath="//div[text()='Save & Send Invitation']") private WebElement saveBtn;
	public Userlist(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public WebElement getnewuserBtn() {
		return newuserBtn;	
	}
	public WebElement getfn() {
		return fn;
	}
	public WebElement getmn() {
		return mn;
	}
	public WebElement getln() {
		return ln;
	}
	public WebElement getemail() {
		return emailtb;
	}
	public void clickNewUser() {
		newuserBtn.click();
	}
	public WebElement getsaveBtn() {
		return saveBtn;
	}
     public void create(String fname , String mname , String lname , String email) {
    		fn.sendKeys(fname);
    		mn.sendKeys(mname);
    		ln.sendKeys(lname);
    		emailtb.sendKeys(email);
    		saveBtn.click();
    	 
    	 
		
	}
}
