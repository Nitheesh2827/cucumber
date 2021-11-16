package com.bookingproject.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.com.Baseclass;
import com.pom.com.Confirmpage;
import com.pom.com.Loginpage;
import com.pom.com.Logoutpage;
import com.pom.com.Paymentpage;
import com.pom.com.Selectionpage;


public class Project extends Baseclass {
	public static void main(String[] args) throws InterruptedException {
		driver = Launchbrowser("chrome");

		Url("http://adactinhotelapp.com/");

		
		Loginpage lp = new Loginpage(driver);
		passvalues(lp.getSend(), "nitheesh2827");
		passvalues(lp.getSend1(), "java2021");
		press(lp.getClick());

		Selectionpage sp = new Selectionpage(driver);
		Dropdown(sp.getClick(), "London");
		Dropdown(sp.getClick2(), "Hotel Creek");
		Dropdown(sp.getClick3(), "Deluxe");
		Dropdown(sp.getClick4(), "2");
		empty(sp.geterase());
		passvalues(sp.geterase(), "05/11/2021");
		empty(sp.geterase1());
		passvalues(sp.geterase1(), "07/11/2021");
		Dropdown(sp.getClick5(), "2");
		Dropdown(sp.getClick6(), "1");
		press(sp.getPresson());

		Confirmpage cp = new Confirmpage(driver);
		press(cp.getButton());
		press(cp.getPresson());

		Paymentpage pp = new Paymentpage(driver);
		passvalues(pp.getSend(), "nitheesh");
		passvalues(pp.getSend1(), "kumar");
		passvalues(pp.getSend2(), "20 coimbatore");
		passvalues(pp.getSend3(), "6548974554661234");
		Dropdown(pp.getClick(), "VISA");
		Dropdown(pp.getClick1(), "6");
		Dropdown(pp.getClick2(), "2022");
		passvalues(pp.getSend4(), "143");
		press(pp.getpresson());

		hold(15);

		Logoutpage lop = new Logoutpage(driver);
		press(lop.getClick());

	}

}
