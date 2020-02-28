package FirstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChrome {

	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","D:\\SAN\\SeleniumJava Download\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		
		
	}

}
