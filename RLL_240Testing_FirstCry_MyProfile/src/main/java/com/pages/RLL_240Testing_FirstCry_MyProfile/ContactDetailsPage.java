package com.pages.RLL_240Testing_FirstCry_MyProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactDetailsPage {

	WebDriver driver;

	public ContactDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	// My Contact
	By contactDetails = By.xpath("//a[contains(@href, 'accountdetails') and contains(text(), 'Contact Details')]");
	By myContactEditIcon = By.id("editt");
	By contactMobile = By.id("txtAddMobilenew");
	By contactVerifyBtn = By.id("callmebtn");
	By contactMobileOtp = By.id("mobotp");
	By contactEmailOtp = By.id("emailotp");
	By contatSubmit = By.id("otpsubmit");
	By contactOverlay = By.xpath("//div[@class='otp-popup-overlay']");
	By verifyBtn = By.id("callmebtn");
	By submitOtp = By.id("otpsubmit");

	public void clickOnContactDetails() throws InterruptedException {
		driver.findElement(contactDetails).click();
		Thread.sleep(2000);
	}

	public void clickOnMyContactEditIcon() throws InterruptedException {
		driver.findElement(myContactEditIcon).click();
		Thread.sleep(1000);
	}

	public void setContactNumber(String mobileNumber) throws InterruptedException {
		WebElement updatedNumber = driver.findElement(contactMobile);
		updatedNumber.clear();
		Thread.sleep(1000);
		updatedNumber.sendKeys(mobileNumber);
		
	}

	public void setMobileOtp() {
		
	}

	public void setEmailOtp() {
		
	}

	public void clickOnContactVerifyBtn() throws InterruptedException {
		driver.findElement(verifyBtn).click();
		Thread.sleep(20000);
	}
	
	public void clickOnSubmitOtpBtn() {
		driver.findElement(submitOtp).click();
	}

}
