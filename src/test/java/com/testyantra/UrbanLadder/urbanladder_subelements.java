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
	
	public class urbanladder_subelements 
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
				  
				  String a1="Furniture Online: Buy Home Wooden Furniture Online In India At Best Price - Urban Ladder - Urban Ladder";
				  String e1=driver.getTitle();
				  Assert.assertEquals(a1, e1);
				  Thread.sleep(4000);
				  driver.findElement(By.xpath("//li[@class='topnav_item livingunit']/span")).click();
				  List<WebElement> menuItems = driver.findElements(By.xpath("//li[@class='topnav_item livingunit']//div[@class='taxontype']/a"));
				  List<String> menuItemsExpected = Arrays.asList("Sofa Set","Sofa cum Bed","Chairs","Tables","Storage","Balcony & Outdoor");


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

