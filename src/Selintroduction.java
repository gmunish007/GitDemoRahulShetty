import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class Selintroduction {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/MU20261457/Desktop/DevOps/Testing/Browser Drivers/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.rahulshettyacademy.com";
		driver.get(url);
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();	
	}
}