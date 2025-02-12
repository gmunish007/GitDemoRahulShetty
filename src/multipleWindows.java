import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class multipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		// open url 1 on a browser
		// then open url 2 in another tab on same browser
		// copy first course name from new tab and paste it on first tab
		
		// creating new tab on the same browser
		driver.switchTo().newWindow(WindowType.TAB);
		
		
		// since this requires multiple windows, we request each window. tab ID to switch to it
		Set<String> windw = driver.getWindowHandles();
		Iterator<String> it = windw.iterator();
		
		String parentID = it.next();
		String childID = it.next();
		
		
		// switch to child window
		driver.switchTo().window(childID);
		
		// now open new URL on child window since the focus is now on child window
		driver.get("https://rahulshettyacademy.com/");
		
		// get the data from the child window
		
		// switch back to parent window
		driver.switchTo().window(parentID);
		
		// input the value into field
		
		

	}

}
