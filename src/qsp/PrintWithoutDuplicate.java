package qsp;

import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintWithoutDuplicate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell%20I3/Desktop/hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		HashSet<String> hs=new HashSet<String>();
		Select s=new Select(mtrlistbox);
		List<WebElement> allOption = s.getOptions();
		int count = allOption.size();
		for (int i=0; i<count; i++) {
			String text = allOption.get(i).getText();
			hs.add(text);
	}
		for (String option:hs) {
			System.out.println(option);
		}driver.close();
	}

}
