package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement send;

	@FindBy(xpath="//input[@name='password']")
	private WebElement send1;
	
	@FindBy(xpath="//input[@name='login']")
	private WebElement click;
	
	

	public Loginpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	
	public WebElement getSend() {
		return send;
	}

	public WebElement getSend1() {
		return send1;
	}
	
	public WebElement getClick() {
		return click;
	}


}
