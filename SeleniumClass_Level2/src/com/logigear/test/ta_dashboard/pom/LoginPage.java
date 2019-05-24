package com.logigear.test.ta_dashboard.pom;

import com.logigear.testfw.common.BasePOM;
import com.logigear.testfw.common.Common;
import com.logigear.testfw.element.Element;

public class LoginPage extends BasePOM{

	// Elements
	protected Element cbbRepo;
	protected Element txtUsername;
	protected Element txtPassword;
	protected Element btnLogin;
	
	public LoginPage()
	{
		// read configuration of this class via parent class's instructor
		super(LoginPage.class);
	}
	
	@Override
	public void initPageElements()
	{
		this.cbbRepo = new Element(getLocator("cbbRepo").getBy());
		this.txtUsername = new Element(getLocator("txtUsername").getBy());
		this.txtPassword = new Element(getLocator("txtPassword").getBy());
		this.btnLogin = new Element(getLocator("btnLogin").getBy());
	}
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @param repo
	 * @return
	 */
	public HomePage login(String username, String password, String repo) {
		cbbRepo.selectByValue(repo);
		txtUsername.enter(username);
		txtPassword.enter(password);
		btnLogin.click();
		
		return new HomePage().waitForPageDisplay();
	}

	/**
	 * 
	 * @param timeOutInSeconds
	 * @return
	 */
	public LoginPage waitForLoading(int timeOutInSeconds) {
		btnLogin.waitForClickable(timeOutInSeconds);
		return this;
	}

	/**
	 * 
	 * @return
	 */
	public LoginPage waitForLoading() 
	{
		waitForLoading(Common.ELEMENT_TIMEOUT);
		return this;
	}
}
