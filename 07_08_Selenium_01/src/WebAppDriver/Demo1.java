package WebAppDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\MathanRajS\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login/");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123")
			Object id;
			driver.find(id.by());
			Actions act = new Actions(driver);
			act.sendKeys(Keys.RETURN).perform();
			act.sendKeys(Keys.TAB, Keys.TAB, Keys.RETURN).perform();
			
			/*int []a[] = new int[3][3];
			int b[][] = new int[3][];
			int C[][] = new int[][3];

			 ArrayList myList = new ArrayList();
			    myList.add(100);
			    myList.add(200);
			    myList.add(400);
			    myList.add(300);
			    myList.remove(1);
			    System.out.println(myList);*/
				 }
		}


		
