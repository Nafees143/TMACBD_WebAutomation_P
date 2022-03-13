package testCases;

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
		driver.get(homePage.homePageUrl());
		driver.manage().window().maximize();
		
	}
	@Test
	public void landingPage() throws InterruptedException {
		commonMethods.clickBtn(Locators.LogoClick);
		Thread.sleep(3000);
		
		base.tearDown();
	}
	
}









