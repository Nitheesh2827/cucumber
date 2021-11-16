package com.helper.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;

	public ConfigurationReader() throws IOException {

		File f = new File(
				"C:\\Users\\nithe\\eclipse-workspace\\Project\\src\\test\\java\\com\\properties\\com\\TestData.properties");

		FileInputStream fs = new FileInputStream(f);
		p = new Properties();
		p.load(fs);
	}

	public String getBrowser() {
		String browser = p.getProperty("Browser");
		return browser;
	}

	public String getUrl() {
		String url = p.getProperty("Url");
		return url;
	}

	public String getUsername() {
		String username = p.getProperty("Username");
		return username;
	}

	public String getPassword() {
		String password = p.getProperty("Password");
		return password;

	}

	public String getfirstname() {
		String firstname = p.getProperty("Firstname");
		return firstname;
	}

	public String getlastname() {
		String lastname = p.getProperty("Lastname");
		return lastname;

	}

	public String getaddress() {
		String address = p.getProperty("Address");
		return address;

	}

	public String getcardnumber() {
		String cardnumber = p.getProperty("Card_number");
		return cardnumber;

	}

	public String getCardtype() {
		String cardtype = p.getProperty("Card_type");
		return cardtype;
	}

	public String getexpirymonth() {
		String expirymonth = p.getProperty("Expiry_month");
		return expirymonth;
	}

	public String getexpiryyear() {
		String expiryyear = p.getProperty("Expiry_year");
		return expiryyear;
	}

	public String getcvv() {
		String cvv = p.getProperty("CVV");
		return cvv;

	}

}
