package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FaceApp 
{

WebDriver driver;
	
	public void lanunchApplication(String browsername,String url)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\automationframework\\src\\test\\java\\utils\\chromedriver.exe");
			driver=new ChromeDriver(); 
			
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\eclipse-workspace\\automationframework\\src\\test\\java\\utils\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\HP\\eclipse-workspace\\automationframework\\src\\test\\java\\utils\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
	}
	
}
