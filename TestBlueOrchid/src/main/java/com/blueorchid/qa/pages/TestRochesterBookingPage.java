package com.blueorchid.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.blueorchid.qa.base.TestBase;

public class TestRochesterBookingPage extends TestBase
{
	@FindBy(xpath="//button[contains(text(),' Search')]")
	WebElement search;
	
	@FindBy(xpath="(//a[@id='booknowbtn_2'])[3]")
	WebElement BookNow;
	
	@FindBy(css=".btn-book-now" )
	WebElement Reserve;
	
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	WebElement Continue;
	
	
	
	
	
	
	
	
	//Initializing the PageObject :
	//Ceate constructor
	public TestRochesterBookingPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void BookingPage()
	{
		//Select Hotel from Drop-Down List
		
		Select hotel = new Select(driver.findElement(By.id("Location")));
		hotel.selectByValue("1");		
		
		Select postpaidroom = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/div[1]/div/section[1]/div[1]/div/div[1]"
				+ "/div/div/div[1]/div[2]/div[1]/table/tbody/tr[2]/td[5]/select")));
		postpaidroom.selectByValue("1");
	}

}
