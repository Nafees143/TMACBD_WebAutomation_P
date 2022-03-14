package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import model.CommonMethods;
import model.Locators;
import pageObject.HomePage;

public class TestCases {

	Base base = new Base();
	WebDriver driver = base.setup();
	
	CommonMethods commonMethods = new CommonMethods(driver);
	
	HomePage homePage = new HomePage(driver);
	
	
	@BeforeClass
	public void start() {
		driver.get("https://tmacbd.com");
		driver.manage().window().maximize();
		
	}
	@Test
	public void landingPage() throws InterruptedException {
		
		//navigation bar
		
		commonMethods.clickBtn(Locators.LogoClick);
		Thread.sleep(3000);
		
		commonMethods.clickBtn(Locators.HomeClick);
		Thread.sleep(2000);
		
		commonMethods.clickBtn(Locators.AboutClick);
		Thread.sleep(2000);
		
		commonMethods.clickBtn(Locators.ServicesClick);
		Thread.sleep(2000);
		
		commonMethods.clickBtn(Locators.TeamClick);
		Thread.sleep(2000);
		
		commonMethods.clickBtn(Locators.ProjectsClick);
		Thread.sleep(2000);
		
		commonMethods.clickBtn(Locators.ContactUsClick);
		Thread.sleep(2000);
		
		
		//contact form field
		commonMethods.sendText(Locators.EnterName, "Tester");
		Thread.sleep(2000);
		
		commonMethods.sendText(Locators.EnterEmil, "Tester@gmail.com");
		Thread.sleep(2000);
		
		commonMethods.sendText(Locators.EnterSubject, "wow!");
		Thread.sleep(2000);
		
		commonMethods.sendText(Locators.EnterMessage, "wow! wow!! wow!!!");
		Thread.sleep(2000);
		
//		commonMethods.clickBtn(Locators.SendMessageBtn);
//		Thread.sleep(2000);
		
		//scroll element

		Thread.sleep(2000);
		scorllToElement();
		Thread.sleep(1000);
		scorllToElement();
		Thread.sleep(1000);
		scorllToElement();
		Thread.sleep(1000);
		scorllToElement();
		
		//close window
		base.tearDown();
	}
	
	public void scorllToElement() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200);");
		
	}
	
}









