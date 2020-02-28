package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nov12 {

	public static void main(String args[]) throws InterruptedException {
		System.out.println("Hi ");

		System.setProperty("webdriver.chrome.driver","D:\\SAN\\SeleniumJava Download\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://uat-taxjournal.azurewebsites.net/sitefinity");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("apurvapat@cybage.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("cybage@123");
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		driver.findElement(By.xpath("//input[@id='loginButton']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
