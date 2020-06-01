package navigationpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Factory;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class PdpPage {

	@FindBy(xpath = "(//*[@class=\"product-item-link\"])[1]")
	WebElement blisterproduct;
	@FindBy(xpath = "//*[@class=\"demo-icon porto-icon-plus\"]")
	WebElement plusicon;
	@FindBy(xpath = "//*[@class=\"action primary tocart\"]")
	WebElement addtocart;
	@FindBy(xpath = "//*[@class=\"message-success success message\"]")
	WebElement succesmsg;
	@FindBy(xpath = "//*[@class=\"fotorama__img\"]")
	WebElement imagepdp;
	@FindBy(xpath = "//*[@class=\"product-info-main\"]")
	WebElement productdetail;
	@FindBy(xpath = "//*[@class=\"action edit\"]")
	WebElement editcart;
	@FindBy(xpath = "//*[@id=\"qty\"]")
	WebElement updatequan;
	@FindBy(xpath = "//*[@class=\"action primary tocart\"]")
	WebElement updatecart;
	@FindBy(xpath = "//*[@class=\"bx-viewport\"]")
	WebElement featuredproduct;

	public void changequan() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		blisterproduct.click();
		plusicon.click();
		addtocart.click();
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Message after changing quantity in cart\n" + succesmsg.getText());
	}

	public void addtocart() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		blisterproduct.click();
		addtocart.click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Message after adding product in mini cart\n" + succesmsg.getText());

	}

	public void productdetail() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		blisterproduct.click();
		if (imagepdp.isDisplayed()) {
			System.out.println("Image is present on pdp page");

		}

		else {
			System.out.println("Image is not found on pdp");
		}

		System.out.println("Product Detail on Pdp page\n" + productdetail.getText());

	}

	public void editcart() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		blisterproduct.click();
		addtocart.click();
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		editcart.click();
		updatequan.clear();
		updatequan.sendKeys("2");
		updatecart.click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Message after edit the quantity\n" + succesmsg.getText());

	}

	public void featuredproduct() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		blisterproduct.click();
		if (featuredproduct.isDisplayed()) {
			System.out.println("Featured products are present");
		}

		else {
			System.out.println("Featured products are not present");
		}
	}

}
