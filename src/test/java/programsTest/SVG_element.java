package programsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVG_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_google_charts.asp");
	WebElement svgElement =	driver.findElement(By.xpath("//body/div[@id='piechart']/div/div/div[1]//*[local-name()='svg']//*[name()='g'][8]"));
		System.out.println(svgElement.getText());
		System.out.println(svgElement.getAttribute("value"));
		driver.quit();
		//System.out.println(svgElement.getText());
	}

}
