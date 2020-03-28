package lib;

import java.rmi.activation.ActivationSystem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction
{
	public static void mouse_hover(WebDriver driver,WebElement elementToHover)
	{
		Actions actions= new Actions(driver);
		actions.moveToElement(elementToHover).build().perform();
	}
	public static void mouse_hover_click(WebDriver driver,WebElement elementToHover,WebElement elementToClick)
	{
		Actions actions= new Actions(driver);
		actions.moveToElement(elementToHover).click(elementToClick).build().perform();
	}
	
	
	public static void doubleclick(WebDriver driver,WebElement elementToClick)
	{
		Actions actions= new Actions(driver);
		actions.doubleClick(elementToClick).build().perform();
	}
}
