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
		
		commonMethods.sendText(Locators.EnterSubject, "Muibornafriha");
		Thread.sleep(2000);
		
		commonMethods.sendText(Locators.EnterMessage, "zahid the name of play boy muib also");
		Thread.sleep(2000);
		
		commonMethods.clickBtn(Locators.SendMessageBtn);
		Thread.sleep(2000);
		
		base.tearDown();
	}
	
}









