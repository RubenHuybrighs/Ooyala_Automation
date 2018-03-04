package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import base.Base;

public class LoginPage extends Base {
	
	static WebDriver driver1;
	private String loginTitle = "The Internet";
	private String expectedDescription = "This is where you can log into the secure area. Enter tomsmith for the username and SuperSecretPassword! for the password. If the information is wrong you should see error messages.";
	private String userid = "tomsmith";
	private String pw = "SuperSecretPassword!";
	private String expectedConfirmationText = "You logged into a secure area!";
	
	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.cssSelector("[type='submit'][class='radius']");
	By confirmation = By.cssSelector("#flash");
	By logoutButton = By.cssSelector(".icon-2x");
	
	public LoginPage() 
	{
		driver = super.getDriver();
	}
	
	public void enterUsername()
	{
		super.waitForVisibilityOf(username);
		driver.findElement(username).sendKeys(userid);
	}
	
	public void enterPassword()
	{
		super.waitForVisibilityOf(password);
		driver.findElement(password).sendKeys(pw);
	}
	
	public void clickLoginButton()
	{
		super.waitForClickabilityOf(loginButton);
		driver.findElement(loginButton).click();
	}
	
	public void verifyLoginDescription()
	{
		WebElement descriptionText = driver.findElement(By.className("subheader"));
		String text = descriptionText.getText();
		Assert.assertTrue(text.equals(expectedDescription));
	}
    
    public void verifyConfirmationText()
    {
    	super.waitForVisibilityOf(confirmation);
    	String actual = driver.findElement(confirmation).getText();
    	Assert.assertTrue(actual.contains(expectedConfirmationText));
    }
	
	public String getLoginTitle()
	{
		return loginTitle;
	}
	
	public void logOut()
	{
		super.waitForClickabilityOf(logoutButton);
		driver.findElement(logoutButton).click();
	}
}
