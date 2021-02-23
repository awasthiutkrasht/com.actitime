package com.actitime.testscript;

import org.testng.annotations.Test;

import com.actitime.genericlib.BaseTest;
import com.actitime.genericlib.Filelib;
import com.actitime.pages.LoginPage;

public class ValidLoginTest extends BaseTest {
	@Test
	public void login() throws Throwable {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Filelib flib = new Filelib();
		String un = flib.getProperty(PROP_PATH, "username");
		String pwd = flib.getProperty(PROP_PATH, "password");
		LoginPage lp = new LoginPage(d);
		lp.login(un, pwd);
	}

}
