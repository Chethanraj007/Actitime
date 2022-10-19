package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFirstSelOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell%20I3/Desktop/hotel.html");
		WebElement cplistbox = driver.findElement(By.id("cp"));
		Select s=new Select(cplistbox);
		WebElement fsOption = s.getFirstSelectedOption();
		String text = fsOption.getText();
		System.out.println(text);
		driver.close();
	
	}

}
