package FirstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFF {

	
	public static void main(String[] args) 
	{
	
	
		System.setProperty("webdriver.gecko.driver","D:\\SAN\\SeleniumJava Download\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://www.facebook.com");
	
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
//		System.out.println(driver.getPageSource());
		
		
	
		
	}

}
