package AccountDashboard;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.Account;
import navigationpages.HomePage;
import navigationpages.NavigationPage;
import utility.Config;

public class EditAccountInformation {
	
	public NavigationPage objnav = new NavigationPage();
	public WebDriver driver;
	public HomePage objhomepage;
    public Account objaccountpage;
	@BeforeClass
	public void Loginpage() {

		driver = Config.chromePath();
		driver.get("http://kttapeb2b.commercestaging.com/");
		driver.manage().window().maximize();
		objhomepage = objnav.navigatetohomepage(driver);
        objaccountpage = objnav.navigatetoaccountpage(driver);
	}
	
	@Test(priority=1)
	public void editfirstnamelastname()
	{
	
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		objhomepage.popup();
		objhomepage.loginaccount();
		objaccountpage.editname();
	}	
	@Test(priority=2)
	public void editemail() {
		objaccountpage.editemail();
	}
	@Test(priority=3)
	public void editpass() {
		objaccountpage.changepass();
		
	}
	

}
