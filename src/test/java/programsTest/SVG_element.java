package programsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVG_element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.switchTo().frame(0);
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_google_pie_chart");
		Thread.sleep(15000);
		driver.switchTo().frame("iframeResult");
	WebElement svgElement =	driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='g'][2]//*[local-name()='g'][4]//*[local-name()='rect']"));
		System.out.println(svgElement.getText());
		String fillText = svgElement.getAttribute("fill");
		System.out.println(fillText);
		svgElement.click();
		
		Thread.sleep(5000);
		driver.quit();
		//System.out.println(svgElement.getText());
		
		
		
		//*[name()='svg']//*[local-name()='g'][2]//*[local-name()='g']
	}

}
