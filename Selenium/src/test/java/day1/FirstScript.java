package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FirstScript {
	
	public static void main(String[] args) {
		
	}
	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\SrinivasKini\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		Assert.assertTrue(title.equals("Online Bookstore"), "Title is not matching");
		WebElement element=driver.findElement(By.name("category_id"));
		Select select= new Select(element);
		select.selectByValue("2");
		driver.quit();
	}

}
