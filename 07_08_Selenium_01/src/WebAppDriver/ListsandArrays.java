package WebAppDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ListsandArrays {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MathanRajS\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("http://newtours.demoaut.com/");
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.findElement(By.tagName("title")).getText());
		/*WebElement link = driver.findElement(By.linkText("Cruises"));
		Actions MO = new Actions(driver);
		Action mouseover = MO.moveToElement(link).build();
		mouseover.perform();
		MO.sendKeys(link,(Keys.ENTER)).perform();*/
	
	}
}