package WebAppDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MathanRajS\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		/*driver.get("http://opensource-demo.orangehrmlive.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		driver.close();*/
		
		driver.get("http://newtours.demoaut.com/");
		WebElement username  = driver.findElement(By.name("userName"));
		username.sendKeys("sunil");
		System.out.println(username.getAttribute("value"));
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		Thread.sleep(20000);
		if (driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).isDisplayed())
		{
		driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
	}
		
	}
}
