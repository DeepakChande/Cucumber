package CheckoutPage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.Account;
import navigationpages.CheckoutPage;
import navigationpages.HomePage;
import navigationpages.NavigationPage;
import utility.Config;

public class PlaceOrder {

	
	
	public NavigationPage objnav = new NavigationPage();
	public WebDriver driver;
	public HomePage objhomepage;
    public Account objaccountpage;
    public CheckoutPage objcheckout;
	@BeforeClass
	public void Loginpage() {

		driver = Config.chromePath();
		driver.get("http://kttapeb2b.commercestaging.com/");
		driver.manage().window().maximize();
		objhomepage = objnav.navigatetohomepage(driver);
        objaccountpage = objnav.navigatetoaccountpage(driver);
        objcheckout=objnav.navigatetocheckoutpage(driver);
	}
	
	@Test
	public void placeorder()
	{
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			
		}
		objhomepage.popup();
	    objhomepage.loginaccount();
		objcheckout.placeorder(driver);
	}	
}
