package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElements {
	@FindBy(name = "user_name")
	private WebElement username;
	@FindBy(name = "user_password")
	private WebElement password;
	@FindBy(id = "submitButton")
	private WebElement loginBtn;
	@FindBy(xpath = "//div[contains(text(),'You must specify a')]")
	private WebElement errorMsg;
	
	public WebElement getUsername()
	{
		return username;
	}
	public WebElement getPassword()
	{
		return password;
	}
	public WebElement getLoginBtn()
	{
		return loginBtn;
	}
    public WebElement geterrorMsg()
    {
    	return errorMsg;
    }
    public void LoginToApp(String un,String pwd)
    {
    	username.sendKeys(un);
    	password.sendKeys(pwd);
    	loginBtn.click();
    }
}
