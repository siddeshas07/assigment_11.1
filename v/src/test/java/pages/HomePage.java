package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
this.driver= driver;
	}
	
	public void calculatePremium() throws InterruptedException {
		//clicks on Request Quotation Page
				driver.findElement(By.linkText("Request Quotation")).click();
				
				
				
			
				
				
				//to select the radio button to yes
				driver.findElement(By.id("quotation_windscreenrepair_t")).click();
				
				//make the input value to 1000
				driver.findElement(By.id("quotation_vehicle_attributes_value")).sendKeys("1000");
				Thread.sleep(3000);
				
				//making as Public
				Select select = new Select(driver.findElement(By.id("quotation_vehicle_attributes_parkinglocation"))); select.selectByIndex(3);
				Thread.sleep(3000);
				
				//Clicking  Calculate Premium
				driver.findElement(By.xpath("//input[@value='Calculate Premium']")).click();
				Thread.sleep(3000);
				
				WebElement calculatedPremium = driver.findElement(By.id("calculatedpremium"));
				Assert.assertTrue(calculatedPremium.isDisplayed());
				
				//Clicking   reset
				driver.findElement(By.xpath("//input[@id='resetquote']")).click();
	}

}
