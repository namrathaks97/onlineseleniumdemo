package com.testyantra.Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Actitime_invalidlogin 
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
		SoftAssert s = new SoftAssert();
		String e1  = "Username or Password is invalid. Please try again.";
		String  a1 = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']")).getText();
		s.assertEquals(a1, e1);
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("admi");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
		password.sendKeys("manager");
		
		WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
		login.click();
	}

}
