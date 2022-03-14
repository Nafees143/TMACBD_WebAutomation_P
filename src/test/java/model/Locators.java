package model;

import org.openqa.selenium.By;

public class Locators {

	public static String homePageUrl = "https://tmacbd.com/";
	
	
	//logo click
	public static By LogoClick = By.xpath("//img[@src='assets/images/logo.png']");
	
	//navigation menus
	public static By HomeClick = By.xpath("//a[contains(text(),'Home')]");
	public static By AboutClick = By.xpath("//a[contains(text(),'About')]");
	public static By ServicesClick = By.xpath("//a[contains(text(),'Services')]");
	public static By TeamClick = By.xpath("//a[contains(text(),'Team')]");
	public static By ProjectsClick = By.xpath("//a[contains(text(),'Projects')]");
	public static By ContactUsClick = By.xpath("//a[contains(text(),'Contact Us')]");
	
	
	//contact US form field
	public static By EnterName = By.xpath("//input[@id='username']");
	public static By EnterEmil = By.xpath("//input[@id='email']");
	public static By EnterSubject = By.xpath("//input[@id='subject']");
	public static By EnterMessage = By.xpath("//textarea[@id='message']");
	public static By SendMessageBtn = By.xpath("//button[@id='submit']");
	
	//for scroll
	//public static By freeQuote = By.xpath("//h4[contains(text(),'Grow With Us Now')]");
	
}
