package navigationpages;

import java.util.List;

import org.apache.xalan.xsltc.compiler.sym;
import org.omg.PortableServer.POAPackage.ObjectAlreadyActiveHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

import utility.Config;

public class HomePage {

	public WebDriver driver;
	
    @FindBy(xpath="(//*[@class=\"DismissButton__closeButtonImage-spg526-0 kzJcQX ResetElements__Img-sc-8e6zl9-4 needsclick DismissButton__closeButtonImage-spg526-0 kzJcQX dXiMfc\"])[1]")
	WebElement popup;
	@FindBy(xpath="//*[@class=\"logo\"]")
	WebElement logo;
	@FindBy(xpath="(//*[@href=\"http://kttapeb2b.commercestaging.com/company/account/create/\"])[3]")
	WebElement dealeraccount;
	@FindBy(xpath="//*[@id=\"company_name\"]")
	WebElement companyname;
	@FindBy(xpath="//*[@id=\"legal_name\"]")
	WebElement companylegalname;
	@FindBy(xpath="//*[@id=\"company_email\"]")
	WebElement companyemail;
	@FindBy(xpath="//*[@id=\"street0\"]")
	WebElement street;
	@FindBy(xpath="//*[@id=\"city\"]")
	WebElement city;
	@FindBy(xpath="//*[@id=\"region_id\"]")
	WebElement state;
	@FindBy(xpath="//*[@id=\"postcode\"]")
	WebElement postalcode;
	@FindBy(xpath="//*[@id=\"telephone\"]")
	WebElement telephone;
	@FindBy(xpath="//*[@id=\"email_address\"]")
	WebElement email;
	@FindBy(xpath="//*[@id=\"firstname\"]")
	WebElement firstname;
	@FindBy(xpath="//*[@id=\"lastname\"]")
	WebElement lastname;
	@FindBy(xpath="//*[@id=\"gender\"]")
	WebElement gender;
	@FindBy(xpath="//*[@class=\"action save primary\"]")
	WebElement submit;
	@FindBy(xpath="//*[@class=\"message-success success message\"]")
	WebElement successmsg;
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement loginemail;
	@FindBy(xpath="(//*[@id=\"pass\"])[1]")
	WebElement loginpass;
	@FindBy(xpath="(//*[@id=\"send2\"])[1]")
	WebElement signin;
	@FindBy(xpath="//*[@id=\"newsletter\"]")
	WebElement subscription;
	@FindBy(xpath="//*[@class=\"action subscribe primary\"]")
	WebElement subscriptionclick;
	@FindBy(xpath="//*[@class=\"message-success success message\"]")
	WebElement subscriptionmsg;
	@FindBy(xpath="//*[@id=\"newsletter\"]")
	WebElement newsletter;
	@FindBy(xpath="//*[@id=\"newsletter-error\"]")
	WebElement invalidemailmsg;
	@FindBy(xpath="//*[@class=\"block block-search\"]")
	WebElement searchicon;
	@FindBy(xpath="//*[@id=\"search\"]")
	WebElement searchtext;
	@FindBy(xpath="//*[@class=\"action search\"]")
	WebElement searchsubmit;
	@FindBy(xpath="//*[@class=\"products list items product-items\"]")
	WebElement searchproductlist;
	@FindBy(xpath="//*[@id=\"sorter\"]")
	WebElement sorter;
	public void headerlogo()
	{
		if(logo.isDisplayed())
		{
			System.out.println("Logo is present on gated page");
		}
	}
	
	public void popup()
	{
	popup.click();
	}
	
	public void applyfordealer(WebDriver driver)
	{
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", dealeraccount);
		//dealeraccount.click();
		companyname.sendKeys("YSPL");
		companylegalname.sendKeys("QAYSPL");
		companyemail.sendKeys("qayspl123@gmail.com");
		street.sendKeys("276/8 california");
		city.sendKeys("california");
		Select objstate = new Select(state);
		objstate.selectByVisibleText("California");
		postalcode.sendKeys("19001");
		telephone.sendKeys("8222835572");
		email.sendKeys(Config.getemail());
		firstname.sendKeys("lakshay");
		lastname.sendKeys("Ahuja");
		Select objgender = new Select(gender);
		objgender.selectByVisibleText("Male");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
		submit.click();
		System.out.println("Message after apply dealer account"+successmsg.getText());
		
	}
	
	public void loginaccount()
	{
		loginemail.sendKeys("jayanta.roy92@gmail.com");
		loginpass.sendKeys("Magento123");
		signin.click();
		System.out.println("User is logged in succesfully");
	}
			
	
	public void subscription()
	
	{
		subscription.sendKeys(Config.getemail());
		subscriptionclick.click();
		System.out.println("Subscription Message"+subscriptionmsg.getText());
	}
	
	
	public void newusersubs()
	{
		subscription.sendKeys(Config.getemail());
		subscriptionclick.click();
		System.out.println("Subscription Message"+subscriptionmsg.getText());
	}
	
	public void invalidsubs()
	{
		subscription.sendKeys("qayspl1234");
		subscriptionclick.click();
		System.out.println("Subscription Message with invalid email address\n"+invalidemailmsg.getText());
	}
	
	public void searchresult()
	{
		  searchicon.click();
		  searchtext.sendKeys("blister treatment");
		  searchsubmit.click();
		  System.out.println("Product List after searching keyword blister treatment "+searchproductlist.getText());
	}
	
	
	public void searchprice()
	{
		  searchicon.click();
		  searchtext.sendKeys("blister treatment");
		  searchsubmit.click();
		  System.out.println("Product List before using sorting\n "+searchproductlist.getText());
	      Select objsorter = new Select(sorter);
	      objsorter.selectByVisibleText("Price");
	      try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	      System.out.println("Product List after using sorting of price\n"+searchproductlist.getText());
	}
	
	  public void searchproductname()
	  {
		  Select objsorter = new Select(sorter);
	      objsorter.selectByVisibleText("Product Name");
	      try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
	      System.out.println("Product List after using sorting product name\n"+searchproductlist.getText());
	  }
	
	
	
}
