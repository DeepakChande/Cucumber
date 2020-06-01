package navigationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CartPage {

	@FindBy(xpath = "//*[@class=\"action viewcart\"]")
	WebElement viewandeditcart;
	@FindBy(xpath = "(//*[@class=\"product-item-link\"])[1]")
	WebElement blisterproduct;
	@FindBy(xpath = "//*[@class=\"action primary tocart\"]")
	WebElement addtocart;
	@FindBy(xpath="//*[@class=\"porto-icon-up-dir\"]")
	WebElement plusicon;
	@FindBy(xpath="(//*[@class=\"price-excluding-tax\"])[3]")
	WebElement subtotal;
	@FindBy(xpath="//*[@class=\"action update\"]")
	WebElement updateshoppingcart;
	@FindBy(xpath="//*[@class=\"action action-delete\"]")
	WebElement removepdt;
    @FindBy(xpath="//*[@class=\"cart-empty\"]")
    WebElement cartempty;
    @FindBy(xpath="//*[@class=\"use-ajax action action-towishlist\"]")
    WebElement movetowishlist;
    @FindBy(xpath="//*[@class=\"message-success success message\"]")
    WebElement wishlistmsg;
	public void updatecart() {
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
		
		viewandeditcart.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Price before updating cart quantity "+subtotal.getText());
		plusicon.click();
		updateshoppingcart.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Price after updating cart quantiy from 1 to 2 "+subtotal.getText());
		
	}
	
	
	public void removepdt()
	{
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
		
		viewandeditcart.click();
		removepdt.click();
		System.out.println("Message after removing product from shopping cart\n"+cartempty.getText());
	}
	

	public void movetowishlist()
	{
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
		
		viewandeditcart.click();
		movetowishlist.click();
	    System.out.println("Message after moving product to wishlist"+wishlistmsg.getText());
	    
	}
	
	
}
