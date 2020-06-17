package com.testyantra.Actitime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Actitime_forgetpwd 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	@Test
	public void tc_01()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String actual  = "Forgot your password?";
		String  expected = actual;
		Assert.assertEquals(actual, expected);
	
		WebElement forget = driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
		forget.click();	
	}
}
