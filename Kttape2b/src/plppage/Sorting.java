package plppage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.Account;
import navigationpages.HomePage;
import navigationpages.NavigationPage;
import navigationpages.PlpPage;
import utility.Config;

public class Sorting {

	
	
	
	public NavigationPage objnav = new NavigationPage();
	public WebDriver driver;
	public HomePage objhomepage;
    public Account objaccountpage;
    public PlpPage objplppage;
	@BeforeClass
	public void Loginpage() {

		driver = Config.chromePath();
		driver.get("http://kttapeb2b.commercestaging.com/");
		driver.manage().window().maximize();
		objhomepage = objnav.navigatetohomepage(driver);
        objaccountpage = objnav.navigatetoaccountpage(driver);
        objplppage = objnav.navigatetoplppage(driver);
	}
	
	@Test(priority=1)
	public void sortingbyposition()
	{
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		objhomepage.popup();
		objhomepage.loginaccount();
		objplppage.sorterbyposition();
	}
	@Test(priority=2)
	public void sortingbyname()
	{
		
		objplppage.sorterbyname();
	}
	@Test(priority=3)
	public void sortingbyprice()
	{
		
	    objplppage.sorterbyprice();
	}
	
}
