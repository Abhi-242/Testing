package TestCase;

import java.io.InputStream;
import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import PO.PO_NopCommerce;
import Utility.BrowserManager;
import Utility.ExtentReportManager;

public class NopCommerce_TestCase {

	WebDriver driver;
	JSONObject nopCommerce;
	ExtentReports extReport;
	ExtentTest extTest;
	
	@BeforeClass
	public void beforeClass() throws Exception{
		InputStream dataIs = null;
		
			
				try {
					String FileName = "data/nopCommerce.json";
					dataIs = getClass().getClassLoader().getResourceAsStream(FileName);
					JSONTokener tokener = new JSONTokener(dataIs);
					
					nopCommerce = new JSONObject(tokener);
					System.out.println("Data:"+nopCommerce.toString());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println(e);
				}
				ExtentReportManager.createReport("NopCommerceTestReport");
	}
	
	@BeforeMethod
	@Parameters({"browser","url"})
	public void setup(String browser, String url) throws InterruptedException{
		driver = BrowserManager.getDriver(browser);
		Thread.sleep(3000);
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
	}
	
	@Test(priority=1)
	public void ValidData() {
		ExtentReportManager.extTest = ExtentReportManager.extReport.startTest("ValidRegistrationTestCase");

		String fnme = nopCommerce.getJSONObject("Valid").getString("fname");
		String lnme = nopCommerce.getJSONObject("Valid").getString("lname");
		String em = nopCommerce.getJSONObject("Valid").getString("email");
		String cem = nopCommerce.getJSONObject("Valid").getString("cnfrmemail");
		String pswd = nopCommerce.getJSONObject("Valid").getString("passwrd");
		String cpswd = nopCommerce.getJSONObject("Valid").getString("cnfrmpasswrd");
		String usnme = nopCommerce.getJSONObject("Valid").getString("username");
		String coun = nopCommerce.getJSONObject("Valid").getString("country");
		String tmzn = nopCommerce.getJSONObject("Valid").getString("timeZone");
		String cmpny = nopCommerce.getJSONObject("Valid").getString("cmpny");
		String expectedResult = nopCommerce.getJSONObject("Valid").getString("ExpectedResult");
		
		System.out.println(fnme+lnme);
		
		PO_NopCommerce obj = PageFactory.initElements(driver, PO_NopCommerce.class);
		obj.valid_data(fnme, lnme, em, cem, pswd, cpswd, usnme, coun, tmzn, cmpny,expectedResult );

	}
	
	@Test(priority=2)
	public void InvalidSymbolplusLetter() {
		
		ExtentReportManager.extTest = ExtentReportManager.extReport.startTest("InvalidRegistrationTestCase");

		String fnme = nopCommerce.getJSONObject("InvalidSymbolplusLetter").getString("fname");
		String lnme = nopCommerce.getJSONObject("InvalidSymbolplusLetter").getString("lname");
		String em = nopCommerce.getJSONObject("InvalidSymbolplusLetter").getString("email");
		String cem = nopCommerce.getJSONObject("InvalidSymbolplusLetter").getString("cnfrmemail");
		String pswd = nopCommerce.getJSONObject("InvalidSymbolplusLetter").getString("passwrd");
		String cpswd = nopCommerce.getJSONObject("InvalidSymbolplusLetter").getString("cnfrmpasswrd");
		String usnme = nopCommerce.getJSONObject("InvalidSymbolplusLetter").getString("username");
		String coun = nopCommerce.getJSONObject("InvalidSymbolplusLetter").getString("country");
		String tmzn = nopCommerce.getJSONObject("InvalidSymbolplusLetter").getString("timeZone");
		String cmpny = nopCommerce.getJSONObject("InvalidSymbolplusLetter").getString("cmpny");
		
		PO_NopCommerce obj = PageFactory.initElements(driver, PO_NopCommerce.class);
		obj.invalid_data(fnme, lnme, em, cem, pswd, cpswd, usnme, coun, tmzn, cmpny);
	}
	/*
	@Test(priority=3)
	public void InvalidNumbersplusLetters() {
		String fnme = nopCommerce.getJSONObject("InvalidNumbersplusLetters").getString("fname");
		String lnme = nopCommerce.getJSONObject("InvalidNumbersplusLetters").getString("lname");
		String em = nopCommerce.getJSONObject("InvalidNumbersplusLetters").getString("email");
		String cem = nopCommerce.getJSONObject("InvalidNumbersplusLetters").getString("cnfrmemail");
		String pswd = nopCommerce.getJSONObject("InvalidNumbersplusLetters").getString("passwrd");
		String cpswd = nopCommerce.getJSONObject("InvalidNumbersplusLetters").getString("cnfrmpasswrd");
		String usnme = nopCommerce.getJSONObject("InvalidNumbersplusLetters").getString("username");
		String coun = nopCommerce.getJSONObject("InvalidNumbersplusLetters").getString("country");
		String tmzn = nopCommerce.getJSONObject("InvalidNumbersplusLetters").getString("timeZone");
		String cmpny = nopCommerce.getJSONObject("InvalidNumbersplusLetters").getString("cmpny");
		
		PO_NopCommerce obj = PageFactory.initElements(driver, PO_NopCommerce.class);
		extTest=obj.invalid_data(fnme, lnme, em, cem, pswd, cpswd, usnme, coun, tmzn, cmpny,extTest);
	}
	@Test(priority=4)
	public void blank() {
		String fnme = nopCommerce.getJSONObject("blank").getString("fname");
		String lnme = nopCommerce.getJSONObject("blank").getString("lname");
		String em = nopCommerce.getJSONObject("blank").getString("email");
		String cem = nopCommerce.getJSONObject("blank").getString("cnfrmemail");
		String pswd = nopCommerce.getJSONObject("blank").getString("passwrd");
		String cpswd = nopCommerce.getJSONObject("blank").getString("cnfrmpasswrd");
		String usnme = nopCommerce.getJSONObject("blank").getString("username");
		String coun = nopCommerce.getJSONObject("blank").getString("country");
		String tmzn = nopCommerce.getJSONObject("blank").getString("timeZone");
		String cmpny = nopCommerce.getJSONObject("blank").getString("cmpny");
		
		PO_NopCommerce obj = PageFactory.initElements(driver, PO_NopCommerce.class);
		extTest=obj.invalid_data(fnme, lnme, em, cem, pswd, cpswd, usnme, coun, tmzn, cmpny,extTest);
	}
	@Test(priority=5)
	public void tripleSpace() {
		String fnme = nopCommerce.getJSONObject("tripleSpace").getString("fname");
		String lnme = nopCommerce.getJSONObject("tripleSpace").getString("lname");
		String em = nopCommerce.getJSONObject("tripleSpace").getString("email");
		String cem = nopCommerce.getJSONObject("tripleSpace").getString("cnfrmemail");
		String pswd = nopCommerce.getJSONObject("tripleSpace").getString("passwrd");
		String cpswd = nopCommerce.getJSONObject("tripleSpace").getString("cnfrmpasswrd");
		String usnme = nopCommerce.getJSONObject("tripleSpace").getString("username");
		String coun = nopCommerce.getJSONObject("tripleSpace").getString("country");
		String tmzn = nopCommerce.getJSONObject("tripleSpace").getString("timeZone");
		String cmpny = nopCommerce.getJSONObject("tripleSpace").getString("cmpny");
		
		PO_NopCommerce obj = PageFactory.initElements(driver, PO_NopCommerce.class);
		extTest=obj.invalid_data(fnme, lnme, em, cem, pswd, cpswd, usnme, coun, tmzn, cmpny,extTest);
	}
	@Test(priority=6)
	public void lessThanMin() {
		String fnme = nopCommerce.getJSONObject("lessThanMin").getString("fname");
		String lnme = nopCommerce.getJSONObject("lessThanMin").getString("lname");
		String em = nopCommerce.getJSONObject("lessThanMin").getString("email");
		String cem = nopCommerce.getJSONObject("lessThanMin").getString("cnfrmemail");
		String pswd = nopCommerce.getJSONObject("lessThanMin").getString("passwrd");
		String cpswd = nopCommerce.getJSONObject("lessThanMin").getString("cnfrmpasswrd");
		String usnme = nopCommerce.getJSONObject("lessThanMin").getString("username");
		String coun = nopCommerce.getJSONObject("lessThanMin").getString("country");
		String tmzn = nopCommerce.getJSONObject("lessThanMin").getString("timeZone");
		String cmpny = nopCommerce.getJSONObject("lessThanMin").getString("cmpny");
		
		PO_NopCommerce obj = PageFactory.initElements(driver, PO_NopCommerce.class);
		extTest=obj.invalid_data(fnme, lnme, em, cem, pswd, cpswd, usnme, coun, tmzn, cmpny,extTest);
	}
	@Test(priority=7)
	public void moreThanMax() {
		String fnme = nopCommerce.getJSONObject("moreThanMax").getString("fname");
		String lnme = nopCommerce.getJSONObject("moreThanMax").getString("lname");
		String em = nopCommerce.getJSONObject("moreThanMax").getString("email");
		String cem = nopCommerce.getJSONObject("moreThanMax").getString("cnfrmemail");
		String pswd = nopCommerce.getJSONObject("moreThanMax").getString("passwrd");
		String cpswd = nopCommerce.getJSONObject("moreThanMax").getString("cnfrmpasswrd");
		String usnme = nopCommerce.getJSONObject("moreThanMAx").getString("username");
		String coun = nopCommerce.getJSONObject("moreThanMax").getString("country");
		String tmzn = nopCommerce.getJSONObject("moreThanMax").getString("timeZone");
		String cmpny = nopCommerce.getJSONObject("moreThanMax").getString("cmpny");
		
		PO_NopCommerce obj = PageFactory.initElements(driver, PO_NopCommerce.class);
		extTest=obj.invalid_data(fnme, lnme, em, cem, pswd, cpswd, usnme, coun, tmzn, cmpny,extTest);
	}
	
	/*
	 * @Test(testName = "Valid Data",
	 * description="testing NopCommerce With valid data") public void
	 * test_registration_with_valid_data() { PO_NopCommerce nopObj = new
	 * PO_NopCommerce(driver); PageFactory.initElements(driver, nopObj);//collects
	 * web elements from the object provided nopObj.valid_data("Sourabh", "Garde",
	 * "saur.abh.garde2@gmail.com","saur.abh.garde2@gmail.com", "myPass@321",
	 * "myPass@321", "sourabhgarde0098700", "India",
	 * "(UTC+05:30) Chennai, Kolkata, Mumbai, New Delhi", "I am A Student"); }
	 */
	
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
		ExtentReportManager.extReport.endTest(ExtentReportManager.extTest);

	}
	@AfterClass
	public void endReport() {
		ExtentReportManager.extReport.flush();
	}
	
}
