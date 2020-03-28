package mouseHover;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseMovement2
{

	static WebDriver driver;

	@Test
	public void mouseHover() throws Exception
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver_80_2.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://executeautomation.com/blog/mouse-hover-click-selenium/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//a[@href='http://executeautomation.com/blog/functional-tools/'])[2]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@href='http://executeautomation.com/blog/functional-tools/bdd-and-specflow-video-series/'])[2]")).click();

		
	}
}
