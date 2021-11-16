package PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.pom.com.Confirmpage;
import com.pom.com.Loginpage;
import com.pom.com.Logoutpage;
import com.pom.com.Paymentpage;
import com.pom.com.Selectionpage;

public class POM {
	public static WebDriver driver;

	private Loginpage lp;

	private Selectionpage sp;

	private Confirmpage cp;

	private Paymentpage pp;

	private Logoutpage LP;

	public POM(WebDriver driver2) {
		this.driver= driver2;
	}

	public Loginpage login() {
		lp = new Loginpage(driver);
		return lp;
	}

	public Selectionpage select() {
		sp = new Selectionpage(driver);
		return sp;
	}

	public Confirmpage confirm() {
		cp = new Confirmpage(driver);
		return cp;
	}

	public Paymentpage payment() {
		pp = new Paymentpage(driver);
		return pp;
	}

	public Logoutpage logout() {
		LP = new Logoutpage(driver);
		return LP;

	}

}
