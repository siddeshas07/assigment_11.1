package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public void login() {
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("siddeshas1999@gmail.com");
		
		WebElement p = driver.findElement(By.id("password"));
		p.sendKeys("7975869561");
		
		WebElement l = driver.findElement(By.name("submit"));
		l.click();
	}
}
