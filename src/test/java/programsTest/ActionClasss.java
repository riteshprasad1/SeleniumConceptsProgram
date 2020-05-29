package programsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClasss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		WebElement dropDown = driver.findElement(By.xpath("//a[@class='menulink']"));
		Actions action = new Actions(driver);
		action.moveToElement(dropDown).build().perform();
		driver.findElement(By.xpath("//ul[@class='submenu']//a[contains(text(),'Courses')]")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
