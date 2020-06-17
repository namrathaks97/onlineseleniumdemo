package com.testyantra.parallelExecution;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	@Test
	@Parameters({"username","password"})
	public void tc_01(String un, String pw) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement user_name = driver.findElement(By.xpath("//input[@name='username']"));
		user_name.sendKeys(un);
		
		WebElement Password = driver.findElement(By.xpath("//input[@name='pwd']"));
		Password.sendKeys(pw);
		Thread.sleep(2000);
		driver.close();
	}
}
