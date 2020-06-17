package com.testyantra.UrbanLadder;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UrbanLadder_Bedroom_Module 
{
	@Test
	  public void Tc_03() throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();

		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.get("https://www.urbanladder.com/");

		  driver.findElement(By.xpath("//div[@id='authentication_popup']/div/div/div[@class='popup-text text-center vert large-6 columns']/a[@class='close-reveal-modal hide-mobile']")).click();
		
		  Actions action = new Actions(driver);
		  WebElement close = driver.findElement(By.xpath("//li[@class='topnav_item bedroomunit']/span"));
		  action.moveToElement(close).build().perform();
		  
		  List<WebElement> sub_bedroomitems = driver.findElements(By.xpath("//li[@class='topnav_item bedroomunit']/span/parent::li//following-sibling::a"));
		  for(WebElement sub_room1item:sub_bedroomitems)
		  {
			  System.out.println(sub_room1item.getText());
		  }
		  Thread.sleep(4000);
		  driver.close();
}
}
