package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewFirst
{
	public static void main(String args[])
	{
		System.out.println("Hi");
		System.setProperty("webdriver.chrome.driver", "D:\\SAN\\SeleniumJava Download\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.google.com");
		
		driver.get("https://www.taxjournal.com");
		
		driver.findElement(By.id("tax_journal_pages_search"));
		
		driver.manage().window().maximize();
		
//		driver.manage().deleteAllCookies();
//		
		String title = driver.getTitle();
//		
		System.out.println("Title is : "+ title);
//			
		
//	System.out.println("Title is : "+driver.getTitle());
		
		driver.close();
		
		if(title.equals("Google"))
		{
			System.out.println("Title is corrert ... Congrats");
		}
		else
		{
			System.out.println("Title is incorrect ...Try again");
		}
		
		
//		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
	}
}