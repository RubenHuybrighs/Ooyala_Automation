package base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	protected WebDriver driver;
	
	public Base()
	{
	}
	
	public WebDriver getDriver()
	{
		if (driver == null)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://the-internet.herokuapp.com/login");
			driver.manage().window().maximize();
			return driver;
		}
		else
		{
			return driver;
		}
	}
	
	public void verifyTitle(String expected)
	{
		String currentTitle = driver.getTitle();
		Assert.assertTrue(currentTitle.equals(expected));
	}
	
	public void waitForVisibilityOf(By locator) 
	{
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForClickabilityOf(By locator) 
    {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
