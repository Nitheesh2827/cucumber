package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentpage {
public static WebDriver driver;

@FindBy(xpath="//input[@name='first_name']")
private WebElement send;

@FindBy(xpath="//input[@name='last_name']")
private WebElement send1;

@FindBy(xpath="//textarea[@name='address']")
private WebElement send2;

@FindBy(xpath="//input[@name='cc_num']")
private WebElement send3;

@FindBy(xpath="//select[@name='cc_type']")
private WebElement click;

@FindBy(xpath="//select[@name='cc_exp_month']")
private WebElement click1;

@FindBy(xpath="//select[@name='cc_exp_year']")
private WebElement click2;

@FindBy(xpath="//input[@name='cc_cvv']")
private WebElement send4;

@FindBy(xpath="//input[@name='book_now']")
private WebElement presson;


public Paymentpage(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
}

public WebElement getSend() {
	return send;
}

public WebElement getSend1() {
	return send1;
}

public WebElement getSend2() {
	return send2;
}

public WebElement getSend3() {
	return send3;
}
public WebElement getClick() {
	return click;
}

public WebElement getClick1() {
	return click1;
}

public WebElement getClick2() {
	return click2;
}

public WebElement getSend4() {
	return send4;
}
public WebElement getpresson() {
	return presson;
}
}
