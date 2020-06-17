package com.testyantra.UrbanLadder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class urbanladder 
{	  
		  @Test
		  public void Tc_01() throws InterruptedException 
		  {
			  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			  WebDriver driver=new ChromeDriver();
	
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			  driver.get("https://www.urbanladder.com/");
			  
			  driver.findElement(By.xpath("//div[@id='authentication_popup']/div/div/div[@class='popup-text text-center vert large-6 columns']/a[@class='close-reveal-modal hide-mobile']")).click();
			  
			  String a1="Furniture Online: Buy Home Wooden Furniture Online In India At Best Price - Urban Ladder - Urban Ladder";
			  String e1=driver.getTitle();
			  Assert.assertEquals(a1, e1);
			  
			  List<WebElement> menuItems = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li/span"));
			  List<String> menuItemsExpected = Arrays.asList("Sale","Living","Bedroom","Dining","Storage","Study","Mattresses","Decor","New","Collections");
			  List<String> menuItemsActual = new ArrayList<String>();
			  for(WebElement menuItem:menuItems)
			  {
				  menuItemsActual.add(menuItem.getText());
				  System.out.println(menuItem.getText());
			  }
			  Assert.assertEquals(menuItemsActual, menuItemsExpected);
			  Thread.sleep(5000);
			  driver.close();
	  }
	}

