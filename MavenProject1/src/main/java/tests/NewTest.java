package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class NewTest
{
	public WebDriver driver;
	@Test
	public void openMyBlog()
	{
		driver.get("https://www.softwaretestingmaterial.com/");
	}
	@BeforeClass
	public void beforeClass()
	{
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",path+"\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}
}
