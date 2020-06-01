package homepage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.HomePage;
import navigationpages.NavigationPage;
import utility.Config;

public class HeaderFooter {

	

	public NavigationPage objnav = new NavigationPage();

	public WebDriver driver;
	public HomePage objhomepage;
	@BeforeClass
	public void Loginpage() {
		driver = Config.chromePath();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://app-qa.shipnautic.com");
		driver.manage().window().maximize();
		objhomepage = objnav.navigatetohomepage(driver);

	}
	@Test
	public void headerfooter()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		objhomepage.login();
		System.out.println("User login successfully!!");
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		objhomepage.packages();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		 WebElement element = driver.findElement(By.xpath("//*[text()=\" QAPackage 1 x 1 x 1 \"]"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		 Actions actions = new Actions(driver);
		 actions.moveToElement(element).perform();
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 WebElement delbutton = driver.findElement(By.xpath("(//*[text()=\"delete\"])[2]"));
		 actions.moveToElement(delbutton).perform();
		     delbutton.click();
		     try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
				WebElement delete = driver.findElement(By.xpath("//*[@class=\"mat-raised-button mat-primary ng-star-inserted\"]"));
				 actions.moveToElement(delete).perform();
				delete.click();
				
				objhomepage.delete();
				System.out.println("Package successfully deleted!!");
	}
	
}
