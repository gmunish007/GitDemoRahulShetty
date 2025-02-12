import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://altoconvertpdftojpg.com");
		
		driver.findElement(By.cssSelector("[class*='btn-choose']")).click();
		
		Thread.sleep(3000);
		
		// Step 1: Shift focus to the upload window
		// Step 2: set text/ path into file name edit box
		// Step 3: Click open to upload file
		
		
		// Download and install AutoIT software and launch it
		// Write the above 3 steps in AutoIT window in scite.exe file
		
		// Use file Au3Info.exe file to get the title and id of the element which will be used in the script
		
		// ControlFocus("Open", "", "Edit1")
		// ControlSetText("Open", "", "Edit1", "path of the file")
		// ControlClick("Open", "", "Button1")
		
		// and then save the script with .au3 extension
		// right click on that script and select compile. It will convert it into an .exe file
		// next invoke that .exe file from your Selenium and it will launch a window, select the file and upload it
		// in order to execute .exe file in Selenium, we use Java since selenium does not support .exe files.
		// We use Runtime class
		
		
		// we will path .exe file path into the argument
		Runtime.getRuntime().exec("file path.exe");
		
	}
}
