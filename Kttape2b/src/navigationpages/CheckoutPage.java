package navigationpages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Factory;

import utility.Config;

public class CheckoutPage {

	public WebDriver driver;

	@FindBy(xpath="//*[@id=\"ui-id-3\"]")
	WebElement shopprodcuts;
	@FindBy(xpath="(//*[@class=\"action tocart primary\"])[1]")
	WebElement AddtoCart;
	@FindBy(xpath="//*[@id=\"top-cart-btn-checkout\"]")
	WebElement proceedtocheckout;
	@FindBy(xpath="//*[@id=\"mes_gateway\"]")
	WebElement creditcardradio;
	@FindBy(xpath="//*[@name=\"payment[cc_number]\"]")
	WebElement ccnum;
	@FindBy(xpath="//*[@name=\"payment[cc_exp_month]\"]")
	WebElement expirymonth;
	@FindBy(xpath="//*[@name=\"payment[cc_exp_year]\"]")
	WebElement expiryyear;
	@FindBy(xpath="//*[@name=\"payment[cc_cid]\"]")
	WebElement cvv;
	@FindBy(xpath="(//*[@title=\"Place Order\"])[3]")
	WebElement placeorder;
	@FindBy(xpath="//*[@class=\"checkout-success\"]")
	WebElement successmsg;
	@FindBy(xpath="(//*[@class=\"step-title\"])[1]")
	WebElement steptitle;
	
	public void checkout()
	{
		shopprodcuts.click();
		 AddtoCart.click();
		 try {
			 Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		 proceedtocheckout.click();
	}
	
	
	
	public void placeorder(WebDriver driver)
	{
		
		
		
		 shopprodcuts.click();
		 AddtoCart.click();
		 try {
			 Thread.sleep(6000);
		} catch (Exception e) {
			
		}
		 proceedtocheckout.click();
		 try {
			Thread.sleep(20000);
		} catch (Exception e) {
			
		}
		 if(steptitle.isDisplayed())
		 {
		    WebElement objshipping = driver.findElement(By.xpath("//*[@id=\"s_method_fedex_FEDEX_GROUND\"]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", objshipping);
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		 
		 WebElement st_1 = driver.findElement(By.xpath("//*[@id=\"mes_gateway\"]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", st_1);
		 try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
         ccnum.sendKeys("4012301230123010");
         Select objmonth = new Select(expirymonth);
         objmonth.selectByVisibleText("02 - February");
         Select objyear = new Select(expiryyear);
         objyear.selectByVisibleText("2019");
         cvv.sendKeys("123");
         try {
			Thread.sleep(10000);
		} catch (Exception e) {
			
		}
            Actions objplace = new Actions(driver);
            objplace.doubleClick(placeorder).build().perform();
         try {
			Thread.sleep(20000);
		} catch (Exception e) {
			
		}
         
         System.out.println("Checkout Success message"+successmsg.getText());
		 }
		 
		 else
		 {
			 try
				{
				
				TakesScreenshot ts = (TakesScreenshot)driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./screenshot/"+"checkoutscreenshot"+".png"));
				System.out.println("screenshot Taken");
				}
				catch(Exception e)
				{
					System.out.println("Exception while taking screenshot"+e.getMessage());
				}
		 }
		 
	}
}
