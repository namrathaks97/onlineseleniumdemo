package com.testyantra.parallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CompatibilityTesting 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	}
	@Test
	@Parameters({"browser"})
	public void tc_01(String browser) throws InterruptedException
	{
		WebDriver driver;
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement user_name = driver.findElement(By.xpath("//input[@name='username']"));
		user_name.sendKeys("admin");
		
		WebElement Password = driver.findElement(By.xpath("//input[@name='pwd']"));
		Password.sendKeys("manager");
	
	}
}
