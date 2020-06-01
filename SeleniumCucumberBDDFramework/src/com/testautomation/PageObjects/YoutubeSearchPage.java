package com.testautomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YoutubeSearchPage 
{
	WebDriver driver;
	
	public YoutubeSearchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"search-input\"]")
	public WebElement SearchTextbox;
	
	@FindBy(how=How.CSS,using="#search-icon-legacy")
	public WebElement SearchButton;
	
	public void NavigateToResultPage()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SearchTextbox.click();
		SearchTextbox.sendKeys("selenium by bakkappa n");
		SearchButton.click();
	}
	

}
