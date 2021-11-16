package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {
	public static WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	private WebElement click;
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement move;

	public Logoutpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getMove() {
		return move;
	}

	public WebElement getClick() {
		return click;
	}
	

}
