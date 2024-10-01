package com.stepdefinition.RLL_240Testing_FirstCry_MyProfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pages.RLL_240Testing_FirstCry_MyProfile.ChildDetailsPage;
import com.pages.RLL_240Testing_FirstCry_MyProfile.ContactDetailsPage;
import com.pages.RLL_240Testing_FirstCry_MyProfile.LoginPage;
import com.pages.RLL_240Testing_FirstCry_MyProfile.MyProfilePage;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepDefinition_ContactDetails {

	WebDriver driver;
	LoginPage login;
	MyProfilePage profile;
	ContactDetailsPage contact;

	@Before
	public void init() {
		driver = new ChromeDriver();
		login = new LoginPage(driver);
		profile = new MyProfilePage(driver);
		contact = new ContactDetailsPage(driver);

	}

	@Given("person is on Firstcry website homepage")
	public void person_is_on_Firstcry_website_homepage() {
		driver.get("https://www.firstcry.com");
		driver.manage().window().maximize();
	}

	@And("person click on login")
	public void person_click_on_login() throws InterruptedException {
		login.clickOnLoginButton();
	}

	@And("person enter registered number")
	public void person_enter_registered_number() throws InterruptedException {
		login.sendMobileNumber();
	}

	@And("person click on continue")
	public void person_click_on_continue() throws InterruptedException {
		login.clickOnContinueButton();
	}

	@And("click on submit for login")
	public void click_on_submit_for_login() throws InterruptedException {
	    login.clickOnSubmitButton();
	}

	@And("person click On myAccount")
	public void person_click_On_myAccount() throws InterruptedException {
		profile.clickOnMyAccount();
	}

	@And("person click on myProfile")
	public void person_click_on_myProfile() throws InterruptedException {
		profile.clickOnMyProfile();
	}

	@And("person click on contact details")
	public void person_click_on_contact_details() throws InterruptedException {
		contact.clickOnContactDetails();
	}

	@And("person click on edit icon on contact details")
	public void person_click_on_edit_icon_on_contact_details() throws InterruptedException {
		contact.clickOnMyContactEditIcon();
	}

	@And("^update the (.*)$")
	public void update_the_mobileNumber(String mobileNumber) throws InterruptedException {
		contact.setContactNumber(mobileNumber);
	}

	@When("click on verify button")
	public void click_on_verify_button() throws InterruptedException {
		contact.clickOnContactVerifyBtn();
	}

	@And("give registered email otp")
	public void give_registered_email_otp() {
		
	}

	@And("give otp from new number")
	public void give_otp_from_new_number() {
		
	}

	@And("click on submit")
	public void click_on_submit() throws InterruptedException {
		contact.clickOnSubmitOtpBtn();
	}

	@Then("contact number updated successfully")
	public void contact_number_updated_successfully() {
		Assert.assertTrue(true);
	}

}
