package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.ExtentReportManager;
import junit.framework.Assert;

public class PO_NopCommerce {

	WebDriver driver;
	
	public PO_NopCommerce(WebDriver driver) {
		this.driver=driver;
		
	}
	/*
	@FindBy(how=How.XPATH, using = "//span[@class='user-actions-ico']")
	WebElement userIcon;
	
	@FindBy(how=How.XPATH, using = "((//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]")
	WebElement registerLink;
	
	public void performAction() {
		Actions actions = new Actions(driver);
		try {
			Thread.sleep(10000);
			actions.moveToElement(userIcon);
		
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actions.click(registerLink).build().perform();
	}
	*/
	
	
	@FindBy(how=How.XPATH, using = "//input[@id='FirstName']")
	WebElement firstname;
	@FindBy(how=How.XPATH, using = "//span[@id='FirstName-error']")
	WebElement firstnameError;
	
	
	@FindBy(how=How.XPATH, using = "//input[@id='LastName']")
	WebElement lastname;
	@FindBy(how=How.XPATH, using = "//span[@id='LastName-error']")
	WebElement lastnameError;
	
	
	@FindBy(how=How.XPATH, using = "//input[@id='Email']")
	WebElement email;
	@FindBy(how=How.XPATH, using = "//span[@id='LastName-error']")
	WebElement email_Error;
	
	@FindBy(how=How.XPATH, using = "//input[@id='ConfirmEmail']")
	WebElement cnfrmemail;
	@FindBy(how=How.XPATH, using = "//span[@id='ConfirmEmail-error']")
	WebElement cnfrmemail_Error;
	
	@FindBy(how=How.XPATH, using = "//input[@id='Username']")
	WebElement usrnme;
	
	@FindBy(how=How.XPATH, using = "//input[@id='check-availability-button']")
	WebElement checkavailability;
	
	@FindBy(how=How.XPATH, using = "//select[@id='CountryId']")
	WebElement country;
	
	
	
	@FindBy(how=How.XPATH, using = "//select[@id='TimeZoneId']")
	WebElement timezone;
	
	
	
	@FindBy(how=How.XPATH, using = "//label[@for='Newsletter']")
	WebElement newscheckbox;
	
	@FindBy(how=How.XPATH, using = "//input[@id='Password']")
	WebElement passwrd;
	
	@FindBy(how=How.XPATH, using = "//input[@id='ConfirmPassword']")
	WebElement confirmpasswrd;
	
	@FindBy(how=How.XPATH, using = "//select[@id='Details_CompanyIndustryId']")
	WebElement MyCompanyPrimarily;
	
	/*@FindBy(how=How.XPATH, using = "//select[@id='Details_CompanyRoleId']")
	WebElement MyMainActivityInCompany;
	
	@FindBy(how=How.XPATH, using = "//select[@id='Details_WebsitesDevelopmentPeriodId']")
	WebElement CompanyWebsite;
	
	@FindBy(how=How.XPATH, using = "//select[@id='Details_CompanySizeId']")
	WebElement MyCompanyPeople;
	
	@FindBy(how=How.XPATH, using = "//label[@for='is-nop-commerce-srores-false']")
	WebElement companyNopCommerceradio;*/
	
	@FindBy(how=How.XPATH, using = "//input[@id='register-button']")
	WebElement register;
	
	/*Select activityselector = new Select(MyMainActivityInCompany);
	Select companyWebsiteselector = new Select(CompanyWebsite);
	Select peopleselector = new Select(MyCompanyPeople);*/

	@FindBy(how=How.XPATH, using = "//div[@class='sub-title']/h2")
	WebElement RegisterHeading;
	/*
	 * @FindBy(how=How.XPATH, using = "//input[@id='admin_email']") WebElement
	 * TxT_Login_Email;
	 * 
	 * @FindBy(how=How.XPATH, using = "//button[@id='admin_email']") WebElement
	 * Button_Login;
	 */
	
	public void sendfirstName(String fname) {
		firstname.sendKeys(fname);
		ExtentReportManager.extTest.log(LogStatus.INFO,"Entered first name: ", fname);

	}
	public void sendlastName(String lname) {
		lastname.sendKeys(lname);
		ExtentReportManager.extTest.log(LogStatus.INFO,"Entered last name", lname);

	}
	public void sendenterEmail(String Email) {
		email.sendKeys(Email);
		ExtentReportManager.extTest.log(LogStatus.INFO,"Entered email", Email);

	}
	public void sendconfrmEmail(String Email) {
		cnfrmemail.sendKeys(Email);
		ExtentReportManager.extTest.log(LogStatus.INFO,"Entered confirm mail", Email);

	}
	public void senduserName(String username) {
		usrnme.sendKeys(username);
		ExtentReportManager.extTest.log(LogStatus.INFO,"Entered username",username );

	}
	public void checkAvailability() {
		checkavailability.click();
		ExtentReportManager.extTest.log(LogStatus.INFO,"Clicked on Check username availability"," Clicked.." );

	}
	public void selectCountry(String countryName) {
		Select countryselector= new Select(country);
		countryselector.selectByVisibleText(countryName);
		ExtentReportManager.extTest.log(LogStatus.INFO,"Selected Country",countryName );

	}
	public void selectTimeZone(String timeZone) {
		Select timezoneSelector= new Select(timezone);
		timezoneSelector.selectByVisibleText(timeZone);
		ExtentReportManager.extTest.log(LogStatus.INFO,"Selected time Zone",timeZone );

	}
	public void uncheck() {
		 if(newscheckbox.isEnabled()) {
			 newscheckbox.click();
			 ExtentReportManager.extTest.log(LogStatus.INFO,"Unchecked the newsletter option", "Clicked on checkbox");

		 }
	}
	public void sendPass(String pswrd) {
		passwrd.sendKeys(pswrd);
		ExtentReportManager.extTest.log(LogStatus.INFO,"Entered password",pswrd );

	}
	public void sendconfrmPass(String cnfrmpswrd) {
		confirmpasswrd.sendKeys(cnfrmpswrd);
		ExtentReportManager.extTest.log(LogStatus.INFO,"Entered confirm password",cnfrmpswrd );

	}
	public void companyDetails(String cmpny) {
		Select companyselector = new Select(MyCompanyPrimarily);

		 companyselector.selectByVisibleText(cmpny);
		 ExtentReportManager.extTest.log(LogStatus.INFO,"Selected Company", cmpny);

		 //Thread.sleep(2000);
			/*
			 * activityselector.selectByVisibleText(activity); //Thread.sleep(2000);
			 * companyWebsiteselector.selectByVisibleText(cmpnywebsite);
			 * //Thread.sleep(2000); peopleselector.selectByVisibleText(pplselctr);
			 * //Thread.sleep(2000);
			 */	}
	/*public void radioButton() {
		companyNopCommerceradio.click();
	}*/
	
	public void Register() {
		register.click();
		ExtentReportManager.extTest.log(LogStatus.INFO,"Clicked on register","Registered.." );

	}
	
	public void valid_data(String fname,String lname,String email,String cnfrmemail,String passwrd,String crfrmpasswrd,String username, String country, String timeZone, String cmpny, String expectedResult) {
		
		try {
			//performAction();
			sendfirstName(fname);
			sendlastName(lname);
			sendenterEmail(email);
			sendconfrmEmail(cnfrmemail);
			senduserName(username);
			checkAvailability();
			selectCountry(country);
			selectTimeZone(timeZone);
			uncheck();
			sendPass(passwrd);
			sendconfrmPass(crfrmpasswrd);
			companyDetails(cmpny);
			//radioButton();
			Register();
			
			ExtentReportManager.extTest.log(LogStatus.INFO, "Expected Result:"+ expectedResult, "Actual Result:"+RegisterHeading.getText().toString().trim()); // second para from json
			//Assert.assertEquals(expectedResult, RegisterHeading.getText().toString().trim());
			if(expectedResult.equals(RegisterHeading.getText().toString().trim())) {
				ExtentReportManager.extTest.log(LogStatus.PASS, "Expected Result:"+ expectedResult, "Actual Result:"+RegisterHeading.getText().toString().trim()); // second para from json
			}
			else {
				ExtentReportManager.extTest.log(LogStatus.FAIL, "Expected Result:"+ expectedResult, "Actual Result:"+RegisterHeading.getText().toString().trim()); 	
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
			ExtentReportManager.extTest.log(LogStatus.FAIL, "Exception...", "failed");
		}
		
	}
	public void invalid_data(String fname,String lname,String email,String cnfrmemail,String passwrd,String crfrmpasswrd,String username, String country, String timeZone, String cmpny) {
		
		try {
			System.out.println(fname+lname);

			
			//performAction();
			sendfirstName(fname);
			sendlastName(lname);
			sendenterEmail(email);
			sendconfrmEmail(cnfrmemail);
			senduserName(username);
			checkAvailability();
			selectCountry(country);
			selectTimeZone(timeZone);
			uncheck();
			sendPass(passwrd);
			sendconfrmPass(crfrmpasswrd);
			companyDetails(cmpny);
			//radioButton();
			Register();
			
			Assert.assertEquals(false, RegisterHeading.isDisplayed());

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void invalid_data2(String fname,String lname,String email,String cnfrmemail,String passwrd,String crfrmpasswrd,String username, String country, String timeZone, String cmpny) {
	
	try {
		//performAction();
		sendfirstName(fname);
		sendlastName(lname);
		sendenterEmail(email);
		sendconfrmEmail(cnfrmemail);
		senduserName(username);
		checkAvailability();
		selectCountry(country);
		selectTimeZone(timeZone);
		uncheck();
		sendPass(passwrd);
		sendconfrmPass(crfrmpasswrd);
		companyDetails(cmpny);
		//radioButton();
		Register();
		Assert.assertEquals(false, RegisterHeading.isDisplayed());

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	public void invalid_data3(String fname,String lname,String email,String cnfrmemail,String passwrd,String crfrmpasswrd,String username, String country, String timeZone, String cmpny) {
		
		try {
			//performAction();
			sendfirstName(fname);
			sendlastName(lname);
			sendenterEmail(email);
			sendconfrmEmail(cnfrmemail);
			senduserName(username);
			checkAvailability();
			selectCountry(country);
			selectTimeZone(timeZone);
			uncheck();
			sendPass(passwrd);
			sendconfrmPass(crfrmpasswrd);
			companyDetails(cmpny);
			//radioButton();
			Register();
			
			Assert.assertEquals(false, RegisterHeading.isDisplayed());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
public void invalid_data4(String fname,String lname,String email,String cnfrmemail,String passwrd,String crfrmpasswrd,String username, String country, String timeZone, String cmpny) {
		
		try {
			//performAction();
			sendfirstName(fname);
			sendlastName(lname);
			sendenterEmail(email);
			sendconfrmEmail(cnfrmemail);
			senduserName(username);
			checkAvailability();
			selectCountry(country);
			selectTimeZone(timeZone);
			uncheck();
			sendPass(passwrd);
			sendconfrmPass(crfrmpasswrd);
			companyDetails(cmpny);
			//radioButton();
			Register();
			
			Assert.assertEquals(false, RegisterHeading.isDisplayed());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
public void invalid_data5(String fname,String lname,String email,String cnfrmemail,String passwrd,String crfrmpasswrd,String username, String country, String timeZone, String cmpny) {
	
	try {
		//performAction();
		sendfirstName(fname);
		sendlastName(lname);
		sendenterEmail(email);
		sendconfrmEmail(cnfrmemail);
		senduserName(username);
		checkAvailability();
		selectCountry(country);
		selectTimeZone(timeZone);
		uncheck();
		sendPass(passwrd);
		sendconfrmPass(crfrmpasswrd);
		companyDetails(cmpny);
		//radioButton();
		Register();
		
		Assert.assertEquals(false, RegisterHeading.isDisplayed());

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	
	
	
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}
