package com.testyantra.Actitime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Actitimedemo 
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
		
		String actual  = "actiTIME - Login";
		String  expected = driver.getTitle();
		Assert.assertEquals(actual, expected);
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
		password.sendKeys("manager");
		
		WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
		login.click();
	}
}
