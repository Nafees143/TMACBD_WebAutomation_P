package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonMethods {

	WebDriver driver;
	
	public CommonMethods(WebDriver driver) {
		this.driver = driver;
	}
	public void clickBtn(By btn) {
		driver.findElement(btn).click();
	}
	public void sendText(By element, String value) {
		driver.findElement(element).sendKeys(value);
	}
}
