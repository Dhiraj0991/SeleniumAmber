package mouseHover;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseMovement
{

	static WebDriver driver;

	@Test
	public void mouseHover() throws Exception
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver_80_2.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/mouse-hover-in-selenium-webdriver-java");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Automation"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Selenium Tutorial'])[1]")).click();
	}
}
