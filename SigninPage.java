package ObjectRepository;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	
	WebDriver driver;
	
	@FindBy(id = "session_key")
	 WebElement username; 
	 
	 @FindBy(id = "session_password")
	 WebElement password;
	 
	 @FindBy(xpath = "//*[@id=\"main-content\"]/section[1]/div/div/form[1]/div[2]/button")
	 WebElement signInBtn;
	 
	 public SigninPage()
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rushikesh kulkarni\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        driver=new ChromeDriver(options);
	        
	        driver.get("https://www.linkedin.com/home");
	        driver.manage().window().maximize();
	        
	        PageFactory.initElements(driver, this );
	 }
	        
	        public void launchApplication()
		    {
		    	driver.get("https://www.linkedin.com/home");
		    }

		    public void closeBrowser() {
				driver.close();
		    }
		    
		 
		     public void enterUserName(String un)
		     {
		    	 username.sendKeys(un);
		    	 
		     }
		     
		     public void enterPassword(String pwd)
		     {
		    	 password.sendKeys(pwd);
		     }
		     
		     public void clickButton()
		     {
		    	 signInBtn.click();
		     }
	 
}
		 
	 


