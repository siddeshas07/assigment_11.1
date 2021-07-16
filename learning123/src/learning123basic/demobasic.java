package learning123basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class demobasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    // System Property for Chrome Driver   
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASSiddesh\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new FirefoxDriver();  
          
           // Launch Website  
        driver.navigate().to("https://halodev.checkpointsystems.com/r/halo/user/login/");  

	}

}
