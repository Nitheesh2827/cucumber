package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectionpage {
	public static WebDriver driver;
	@FindBy(xpath="//select[@name='location']")
	private WebElement click;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement click2;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement click3;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement click4;
	
	@FindBy(xpath="(//input[@class='date_pick'])[1]")
	private WebElement erase;
	
	@FindBy(xpath="(//input[@class='date_pick'])[2]")
	private WebElement erase1;
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement click5;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement click6;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement presson;

	public Selectionpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}



	public WebElement getClick() {
		return click;
	}
	public WebElement getClick2() {
		return click2;
	}
	public WebElement getClick3() {
		return click3;
	}
	public WebElement getClick4() {
		return click4;
	}
	public WebElement geterase() {
		return erase;
	}
	public WebElement geterase1() {
		return erase1;
	}
	public WebElement getClick5() {
		return click5;
	}
	public WebElement getClick6() {
		return click6;
	}
	public WebElement getPresson() {
		return presson;
	}

}
