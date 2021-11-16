package com.stepdefenition.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.baseclass.com.Baseclass;
import com.helper.com.FileReaderManager;
import com.runner.com.AdactinRunner;

import PageObjectManager.POM;
import io.cucumber.java.en.*;





public class AdactinStepDefenition extends Baseclass{
	public static WebDriver driver = AdactinRunner.driver;
	POM pom =new POM(driver);
	
	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
		String url = FileReaderManager.getInstanceCR().getUrl();
	    Url(url);
	}

	@When("^User enter the valid username in the username field$")
	public void user_enter_the_valid_username_in_the_username_field() throws Throwable {
		String username = FileReaderManager.getInstanceCR().getUsername();
	    passvalues(pom.login().getSend(), username);
	}

	@When("^User enter the valid password in the password field$")
	public void user_enter_the_valid_password_in_the_password_field() throws Throwable {
		String password = FileReaderManager.getInstanceCR().getPassword();
	   passvalues(pom.login().getSend1(), password);
	}

	@Then("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
	    press(pom.login().getClick());
	}
	@Given("user have to select the location")
	public void user_have_to_select_the_location() {
	    Dropdown(pom.select().getClick(), "London");
	}

	@When("user have to select the hotel")
	public void user_have_to_select_the_hotel() {
		Dropdown(pom.select().getClick2(), "Hotel Creek");
	}

	@When("user have to select the room type")
	public void user_have_to_select_the_room_type() {
		Dropdown(pom.select().getClick3(), "Deluxe");
	}

	@When("user have to select the number of rooms")
	public void user_have_to_select_the_number_of_rooms() {
		Dropdown(pom.select().getClick4(), "2");
	}
	@When("user have to clear the check-in date field")
	public void user_have_to_clear_the_check_in_date_field() {
		empty(pom.select().geterase());
	}
	
	@When("user have to enter the check-in date")
	public void user_have_to_enter_the_check_in_date() {
		passvalues(pom.select().geterase(), "05/11/2021");
	}
	@When("user have to clear the check-out date field")
	public void user_have_to_clear_the_check_out_date_field() {
		empty(pom.select().geterase1());
	}

	@When("user have to enter the check-out date")
	public void user_have_to_enter_the_check_out_date() {
		passvalues(pom.select().geterase1(), "07/11/2021");
	}

	@When("user have to pick adult per room")
	public void user_have_to_pick_adult_per_room() {
		Dropdown(pom.select().getClick5(), "2");
	}

	@When("user have to pick child per room")
	public void user_have_to_pick_child_per_room() {
		Dropdown(pom.select().getClick6(), "1");
	}

	@Then("user clicks on the search option")
	public void user_clicks_on_the_search_option() {
		press(pom.select().getPresson());
	}
	@Given("user have to click on the radio button")
	public void user_have_to_click_on_the_radio_button() {
		press(pom.confirm().getButton());
	}

	@Then("user clicks on the continue option")
	public void user_clicks_on_the_continue_option() {
		press(pom.confirm().getPresson());
	}
	@Given("user have to enter the first name")
	public void user_have_to_enter_the_first_name() throws IOException {
		String getfirstname = FileReaderManager.getInstanceCR().getfirstname();
		passvalues(pom.payment().getSend(), getfirstname);
	}

	@When("user have to enter the last name")
	public void user_have_to_enter_the_last_name() throws IOException {
		String getlastname = FileReaderManager.getInstanceCR().getlastname();
		passvalues(pom.payment().getSend1(), getlastname);
	}

	@When("user have to enter the address")
	public void user_have_to_enter_the_address() throws IOException {
		String getaddress = FileReaderManager.getInstanceCR().getaddress();
		passvalues(pom.payment().getSend2(), getaddress);
	}

	@When("user have to enter the {int}-digit credit card number")
	public void user_have_to_enter_the_digit_credit_card_number(Integer int1) throws IOException {
		String getcardnumber = FileReaderManager.getInstanceCR().getcardnumber();
		passvalues(pom.payment().getSend3(), getcardnumber);
	}

	@When("user have to select the credit card type")
	public void user_have_to_select_the_credit_card_type() throws IOException {
		String cardtype = FileReaderManager.getInstanceCR().getCardtype();
		Dropdown(pom.payment().getClick(), cardtype);
	}

	@When("user have to select the expiry month of the card")
	public void user_have_to_select_the_expiry_month_of_the_card() throws IOException {
		String getexpirymonth = FileReaderManager.getInstanceCR().getexpirymonth();
		Dropdown(pom.payment().getClick1(), getexpirymonth);
	}

	@When("user have to select the expiry year of the card")
	public void user_have_to_select_the_expiry_year_of_the_card() throws IOException {
		String getexpiryyear = FileReaderManager.getInstanceCR().getexpiryyear();
		Dropdown(pom.payment().getClick2(), getexpiryyear);
	}

	@When("user have to enter the CVV number")
	public void user_have_to_enter_the_CVV_number() throws IOException {
		String getcvv = FileReaderManager.getInstanceCR().getcvv();
		passvalues(pom.payment().getSend4(), getcvv);
	}

	@Then("User clicks on the BOOK NOW option")
	public void user_clicks_on_the_BOOK_NOW_option() {
		press(pom.payment().getpresson());
	}
	@Given("user have to click on the logout")
	public void user_have_to_click_on_the_logout() {
		press(pom.logout().getClick());
	}


}
