package navigationpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;
import com.sun.mail.handlers.message_rfc822;

public class PlpPage {
	

	@FindBy(xpath="//a[@href=\"http://kttapeb2b.commercestaging.com/shop-products\"]")
	WebElement shopproduct;
	@FindBy(xpath="(//*[@class=\"action tocart primary\"])[1]")
	WebElement addtocartplp;
	@FindBy(xpath="//*[@class=\"message-success success message\"]")
	WebElement succesmsg;
	@FindBy(xpath="(//*[@class=\"action towishlist\"])[1]")
	WebElement addtowishlist;
	@FindBy(xpath="(//*[@class=\"action requisition-list-button toggle change\"])[1]")
	WebElement plprequistion;
	@FindBy(xpath="(//*[@title=\"Create New Requisition List\"])[1]")
	WebElement createrequistionplp;
	@FindBy(xpath="(//*[@class=\"list-items\"]/li[1])[1]")
	WebElement existingreqlist;
	@FindBy(xpath="//*[@id=\"requisition-list-name\"]")
	WebElement requisitionlistname;
	@FindBy(xpath="//*[@class=\"action primary confirm\"]")
	WebElement saverequistionlist;
	@FindBy(xpath="//*[@class=\"message-success success message\"]")
	WebElement successmsg;
	@FindBy(xpath="//*[@id=\"sorter\"]")
	WebElement sorter;
	@FindBy(xpath="//*[@class=\"products list items product-items\"]")
	WebElement productlist;
	@FindBy(xpath="//*[@class=\"action viewcart\"]")
	WebElement viewandeditcart;
	@FindBy(xpath="//*[@class=\"action delete\"]")
	WebElement removeitemminicart;
	@FindBy(xpath="//*[@class=\"action-primary action-accept\"]")
	WebElement removeaccept;
	
	
	
	
	public void shopproduct()
	{
		shopproduct.click();
	}
	public void addtocartplp()
	{
	        shopproduct.click();
	        try {
				Thread.sleep(2000);
			} catch (Exception e) {
				
			}
	        
	       addtocartplp.click();
	       try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	       System.out.println("Product added to cart succesfully\n"+succesmsg.getText()); 
	       
	}
	
	
	public void addtowishlist(WebDriver driver)
	{
		shopproduct.click();
        try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
        Actions objaddtocart = new Actions(driver);
        objaddtocart.moveToElement(addtocartplp).build().perform();
        try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
        addtowishlist.click();
        try {
          Thread.sleep(3000);			
		} catch (Exception e) {
			// TODO: handle exception
		}
        System.out.println("Message after adding product to wishlist"+succesmsg.getText());
        
        
	}
	 public void createrequistionplp(WebDriver driver)
	 {
		 shopproduct.click();
	        try {
				Thread.sleep(2000);
			} catch (Exception e) {
				
			}
	        Actions objaddtocart = new Actions(driver);
	        objaddtocart.moveToElement(addtocartplp).build().perform();
	        try {
				Thread.sleep(3000);
			} catch (Exception e) {
				
			}
	        plprequistion.click(); 
	        try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
	        createrequistionplp.click();
            try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
            
            requisitionlistname.sendKeys("Testing");
            saverequistionlist.click();
            try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
            
            System.out.println("Message after adding product to new requisition list\n"+succesmsg.getText());
            
	 }

	
	public void existingreqlist(WebDriver driver)
	{
		/*shopproduct.click();
        try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}*/
        Actions objaddtocart = new Actions(driver);
        objaddtocart.moveToElement(addtocartplp).build().perform();
        try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
        plprequistion.click(); 
        try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
        existingreqlist.click();
        try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
        System.out.println("Message after adding product to existing requistion list\n"+succesmsg.getText());
	}
	
	public void sorterbyposition()
	{
		shopproduct.click();
        try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
        Select objposition = new Select(sorter);
        objposition.selectByVisibleText("Position");
        System.err.println("Product list after using sorting by postion\n");
        System.out.println(productlist.getText());
        
	}
	
	
	public void sorterbyname()
	{

		shopproduct.click();
        try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
        Select objposition = new Select(sorter);
        objposition.selectByVisibleText("Product Name");
        try {
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
		}
        System.err.println("Product list after using sorting by product name\n");
        System.out.println(productlist.getText());
	}
	
	public void sorterbyprice()
	{
		shopproduct.click();
        try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
        Select objposition = new Select(sorter);
        objposition.selectByVisibleText("Price");
        try {
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
		}
        System.err.println("Product list after using sorting by price\n");
        System.out.println(productlist.getText());
	}
	
	public void gocartfrmminicart()
	{
		shopproduct.click();
        try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
        addtocartplp.click();
        try {
			Thread.sleep(6000);
		} catch (Exception e) {
			// TODO: handle exception
		}
        
        viewandeditcart.click();
        System.out.println("Go to cart page from mini cart is working fine");
        
	}
	
	public void removefrmcart()
	{
		shopproduct.click();
        try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
        addtocartplp.click();
        try {
			Thread.sleep(6000);
		} catch (Exception e) {
			// TODO: handle exception
		}
        removeitemminicart.click();
        try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
        
        removeaccept.click();
        System.out.println("Product has been removed succesfully from mini cart");
	}
}
