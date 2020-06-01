package navigationpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utility.Config;

public class HomePage {

	public WebDriver driver;
	
	
		@FindBy(xpath="//*[@id=\"mat-input-0\"]")
		WebElement email;
		@FindBy(xpath="//*[@id=\"mat-input-1\"]")
		WebElement password;
		@FindBy(xpath="(//*[@class=\"mat-button-wrapper\"])[1]")
		WebElement login;
		@FindBy(xpath="(//*[@class=\"count-card mat-card\"])[5]")
		WebElement packages;
		@FindBy(xpath="(//*[@class=\"mat-button-wrapper\"])[2]")
		WebElement addbutton;
		@FindBy(xpath="//*[@id=\"mat-input-3\"]")
		WebElement packagename;
		@FindBy(xpath="(//*[@class=\"mat-button-wrapper\"])[16]")
		WebElement tickmark;
		@FindBy(xpath="//*[text()=\" QAPackage 1 x 1 x 1 \"]")
		WebElement packageclick;
		@FindBy(xpath="//*[text()=\"more_vert\"]")
		WebElement logout1;
		@FindBy(xpath="//*[text()=\"power_settings_new\"]")
		WebElement logout2;
		
		public void login()
		{
			/*try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			email.click();
			email.sendKeys(Config.getemail());
			password.click();
			password.sendKeys(Config.Password());
			login.click();
		}
		
		public void packages()
		{
		      packages.click();
		      try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		      addbutton.click();
		      packagename.click();
		      packagename.sendKeys("QAPackage");
		      try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					tickmark.click();			
		
		}
		
		public void delete()
		{
			logout1.click();
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			logout2.click();
		}
	
}
