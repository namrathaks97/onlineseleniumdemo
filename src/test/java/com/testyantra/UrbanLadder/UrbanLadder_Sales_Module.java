package com.testyantra.UrbanLadder;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
import org.testng.annotations.Test;

public class UrbanLadder_Sales_Module 
{
	@Test
	  public void Tc_01() throws InterruptedException, IOException 
	  {
		  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();

		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.get("https://www.urbanladder.com/");
		  
		  driver.findElement(By.xpath("//div[@id='authentication_popup']/div/div/div[@class='popup-text text-center vert large-6 columns']/a[@class='close-reveal-modal hide-mobile']")).click();
		  	  
		  Actions action = new Actions(driver);
		  WebElement move = driver.findElement(By.xpath("//li[@class='topnav_item saleunit']/span"));
		  action.moveToElement(move).build().perform();
		  		  
		  TakesScreenshot sc=(TakesScreenshot)driver;
			File srcfile=sc.getScreenshotAs(OutputType.FILE);
			File descfile=new File("./screenshot.google.png");
			FileUtils.copyFile(srcfile,descfile);
		  
			List<WebElement> sale1items = driver.findElements(By.xpath("//li[@class='topnav_item saleunit']/span/parent::li//following-sibling::a"));
			  for(WebElement saleitem:sale1items)
			  {
				  System.out.println(saleitem.getText());
			  }
		  Thread.sleep(5000);
		  driver.close();
    }
}
