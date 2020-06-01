package navigationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NavigationPage {

	public HomePage navigatetohomepage(WebDriver driver) {
		HomePage objhomepage = new HomePage();
		PageFactory.initElements(driver, objhomepage);
		return objhomepage;
	}		
}
