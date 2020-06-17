package com.testyantra.parallelExecution;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecutionDemo3 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	
	@Test
	public void tc_05() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.close();
	}
	
	@Test
	public void tc_06() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ixigo.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.close();
	}
}
