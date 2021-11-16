package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmpage {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement button;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement presson;
	

	public Confirmpage(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2, this);
	}



	public WebElement getButton() {
		return button;
	}
	public WebElement getPresson() {
		return presson;
	}

}
