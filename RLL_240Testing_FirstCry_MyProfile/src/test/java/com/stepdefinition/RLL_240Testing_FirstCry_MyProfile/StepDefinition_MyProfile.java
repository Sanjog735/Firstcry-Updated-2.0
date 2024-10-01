package com.stepdefinition.RLL_240Testing_FirstCry_MyProfile;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import com.pages.RLL_240Testing_FirstCry_MyProfile.LoginPage;
import com.pages.RLL_240Testing_FirstCry_MyProfile.MyProfilePage;


import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepDefinition_MyProfile {

	WebDriver driver;
	MyProfilePage profile;
	LoginPage login;
	Logger log;

	
	@Before
	public void init() {
		driver = new ChromeDriver();
		login = new LoginPage(driver);
		profile = new MyProfilePage(driver);
		log = Logger.getLogger(StepDefinition_MyProfile.class);
	}

	@Given("user open the FirstCry website")
	public void user_open_the_FirstCry_website() {
		driver.get("https://www.firstcry.com");
		driver.manage().window().maximize();
	}

	@When("The user clicks on loginBtn")
	public void the_user_clicks_on_loginBtn() throws InterruptedException {
		login.clickOnLoginButton();
	}

	@And("The user enters his mobile number")
	public void the_user_enters_his_mobile_number() throws InterruptedException {
		login.sendMobileNumber();

	}

	@And("click on continue btn")
	public void click_on_continue_btn() throws InterruptedException {
		login.clickOnContinueButton();
	}

	@And("click on submit btn")
	public void click_on_submit_btn() throws InterruptedException {
		login.clickOnSubmitButton();

	}

	@When("click On MyAccount link")
	public void click_On_MyAccount_link() throws InterruptedException {
		profile.clickOnMyAccount();
	}

	@Then("The user is able click on MyAccount")
	public void the_user_is_able_click_on_MyAccount() {
		Assert.assertTrue(driver.getCurrentUrl().contains("cashcoupons"));
		log.info("User is able to click on My Account");
		driver.quit();
	}
///////////////////////////////////////////////////////////////////////////////

	@Given("user Open the FirstCry website")
	public void user_open_the_firstcry_website() {
		driver.get("https://www.firstcry.com");
		driver.manage().window().maximize();
	}

	@When("user clicks on loginBtn")
	public void user_clicks_on_loginBtn() throws InterruptedException {
		login.clickOnLoginButton();
	}

	@When("user enters his mobile number")
	public void user_enters_his_mobile_number() throws InterruptedException {
		login.sendMobileNumber();

	}

	@When("user click on continue btn")
	public void user_click_on_continue_btn() throws InterruptedException {
		login.clickOnContinueButton();
	}

	@When("user click on submit btn")
	public void user_click_on_submit_btn() throws InterruptedException {
		login.clickOnSubmitButton();
	}

	@When("user click On MyAccount link")
	public void user_click_on_myaccount_link() throws InterruptedException {
		profile.clickOnMyAccount();

	}

	@When("user click on MyProfile")
	public void user_click_on_myprofile() throws InterruptedException {
		profile.clickOnMyProfile();
	}

	@Then("The user is able click on MyProfile")
	public void the_user_is_able_click_on_myprofile() {
		Assert.assertTrue(driver.getCurrentUrl().contains("accountdetails"));
		log.info("User is able to click on My Profile");
		driver.quit();
	}
	
	///////////////////////////////////////////////////////////////////////////////////
	@Given("user Open the FirstCry website link")
    public void user_open_the_firstcry_website_link() {
        driver.get("https://www.firstcry.com/");
        driver.manage().window().maximize();
    }

    @When("user clicks on loginbtn")
    public void user_clicks_on_loginbtn() throws InterruptedException {
    	login.clickOnLoginButton();
        
    }

    @When("user enters his mobile Number")
    public void user_enters_his_mobile_Number() throws InterruptedException {
    	login.sendMobileNumber();
    }

    @When("user click on continue Btn")
    public void user_click_on_continue_Btn() throws InterruptedException {
    	login.clickOnContinueButton();
    }

    @When("user click on submit Btn")
    public void user_click_on_submit_Btn() throws InterruptedException {
    	login.clickOnSubmitButton();
    }

    @When("user click On myAccount link")
    public void user_click_on_myAccount_link() throws InterruptedException {
    	profile.clickOnMyAccount();
    }

    @When("user click on myProfile")
    public void user_click_on_myProfile() throws InterruptedException {
    	profile.clickOnMyProfile();
    }

    @When("user click on edit icon of My Profile")
    public void user_click_on_edit_icon_of_my_profile() throws InterruptedException {
    	profile.clickOnProfileEditIcon();
    }

    @When("^user enters the name (.*)$")
    public void user_enters_the_name(String name) throws InterruptedException {
    	profile.enterName(name);
    }

    @When("user clicks on radio button")
    public void user_clicks_on_radio_button() throws InterruptedException {
    	profile.clickOnProfileIAm();
    }

    @When("user clicks on I am expecting another child checkbox")
    public void user_clicks_on_i_am_expecting_another_child_checkbox() throws InterruptedException {
    	profile.clickOnExpectingChildCheckBox();
    }

    @When("user selects a due date")
    public void user_selects_a_due_date() throws InterruptedException {
    	profile.setExpectedChildDate();
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() throws InterruptedException {
    	profile.clickOnProfileSave();

    }

    @Then("Users profile should be updated")
    public void users_profile_should_be_updated() {
    	String text = driver.findElement(By.xpath("//*[text()='Expecting Father']")).getText();
        Assert.assertEquals("Expecting Father",text);
        log.info("User profile is updated successfully");
        driver.quit();
    }
    
    
    
  ////////////////////////////////////////////////////////////////////////////////////

   
    
    @Given("i Open the FirstCry website link")
    public void i_open_the_first_cry_website_link() {
    	driver.get("https://www.firstcry.com"); 
        driver.manage().window().maximize();
    }
    @When("i clicks on loginbtn")
    public void i_clicks_on_loginbtn() throws InterruptedException {
    	login.clickOnLoginButton();
    }
    @When("i enters mobile Number")
    public void i_enters_mobile_number() throws InterruptedException {
    	login.sendMobileNumber();
    }
    @When("i click on continue Btn")
    public void i_click_on_continue_btn() throws InterruptedException {
    	login.clickOnContinueButton();
    }
    @When("i click on submit Btn")
    public void i_click_on_submit_btn() throws InterruptedException {
    	login.clickOnSubmitButton();
    }
    @When("i click On myAccount link")
    public void i_click_on_my_account_link() throws InterruptedException {
    	profile.clickOnMyAccount();
    }
    @When("i click on myProfile")
    public void i_click_on_my_profile() throws InterruptedException {
        profile.clickOnMyProfile();
    }
    @When("i click on edit icon of My Profile")
    public void i_click_on_edit_icon_of_my_profile() throws InterruptedException {
        profile.clickOnProfileEditIcon();
    }
    @When("i do not enters the name")
    public void i_do_not_enters_the_name() throws InterruptedException {
    	driver.findElement(By.cssSelector("input[id='userFnLName']")).clear();
        
    }
    @When("i do not clicks on radio button")
    public void i_do_not_clicks_on_radio_button() {
        
    }
    @When("i do not clicks on checkbox")
    public void i_do_not_clicks_on_checkbox() {
        
    }
    @When("i do not selects a due date")
    public void i_do_not_selects_a_due_date() {
        
    }
    @When("i clicks on save button")
    public void i_clicks_on_save_button() throws InterruptedException {
        profile.clickOnProfileSave();
    }
    @Then("the profile  should not be updated")
    public void the_profile_should_not_be_updated() {
    	String errorMessage = driver.findElement(By.id("nameErrMsg")).getText(); 
        Assert.assertTrue(errorMessage.contains("Please Enter Name")); 
        log.error("User profile is not updated ");
        driver.quit();
    }
    
    
    //////////////////////////////////////////////////////////////////////////////
}

