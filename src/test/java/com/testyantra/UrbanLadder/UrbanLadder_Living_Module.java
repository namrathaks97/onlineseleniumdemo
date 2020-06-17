package com.testyantra.UrbanLadder;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UrbanLadder_Living_Module 
{
	@Test
	  public void Tc_02() throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();

		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.get("https://www.urbanladder.com/");

		  driver.findElement(By.xpath("//div[@id='authentication_popup']/div/div/div[@class='popup-text text-center vert large-6 columns']/a[@class='close-reveal-modal hide-mobile']")).click();
		
		  Actions action = new Actions(driver);
		  WebElement close = driver.findElement(By.xpath("//li[@class='topnav_item livingunit']/span"));
		  action.moveToElement(close).build().perform();
		  
		  List<WebElement> sub_livingitems = driver.findElements(By.xpath("//li[@class='topnav_item livingunit']/span/parent::li//following-sibling::a"));
		  for(WebElement sub_living1item:sub_livingitems)
		  {
			  System.out.println(sub_living1item.getText());
		  }
		  Thread.sleep(4000);
		  driver.close();	  
  }
}