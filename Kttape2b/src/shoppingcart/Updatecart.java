package shoppingcart;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.Account;
import navigationpages.CartPage;
import navigationpages.HomePage;
import navigationpages.NavigationPage;
import navigationpages.PdpPage;
import navigationpages.PlpPage;
import utility.Config;

public class Updatecart {



	public NavigationPage objnav = new NavigationPage();
	public WebDriver driver;
	public HomePage objhomepage;
    public Account objaccountpage;
    public PlpPage objplppage;
    public PdpPage objpdppage;
    public CartPage objcartpage;
	@BeforeClass
	public void Loginpage() {

		driver = Config.chromePath();
		driver.get("http://kttapeb2b.commercestaging.com/");
		driver.manage().window().maximize();
		objhomepage = objnav.navigatetohomepage(driver);
        objaccountpage = objnav.navigatetoaccountpage(driver);
        objplppage = objnav.navigatetoplppage(driver);
        objpdppage = objnav.navigatetopdp(driver);
        objcartpage = objnav.navigatetocartpage(driver);
	}
	
	@Test 
	public void updatecart()
	{
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		objhomepage.popup();
		objhomepage.loginaccount();
		objplppage.shopproduct();
		objcartpage.updatecart();
	}
	
	
	
	
	
	
	
	
	
}
