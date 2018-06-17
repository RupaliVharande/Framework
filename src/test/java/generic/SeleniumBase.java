package generic;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class SeleniumBase extends Base
{
	
	static WebDriver driver;
	
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
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}

	/*private TimeUnit TimeUnit() {
		// TODO Auto-generated method stub
		return null;
	}*/
	
	public void explicitWait(By by)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		ExpectedCondition<WebElement> ec=ExpectedConditions.visibilityOfElementLocated(by);
		
		wait.until(ec);
	}

	public void closeApplication()
	{
		driver.quit();
	}
	
	
	
	
	public String getPageDetails(String type)
	{
		String str="null";
		if(type.equalsIgnoreCase("title"))
				{
			
		    str=driver.getTitle();
			
				}
		else if(type.equalsIgnoreCase("current url"))
		{
			
			str=driver.getCurrentUrl();
			
		}
		else if(type.equalsIgnoreCase("page source"))
		{   
			
		    str=driver.getPageSource();
			
		}
		else if(type.equalsIgnoreCase("handle"))
		{
			str=driver.getWindowHandle();
			
		}
	
			//System.out.println(str);
			return str;
		
	}
	
	public List<WebElement> identifyElements(String type,String address)
	{
	By by;
		if(type.equalsIgnoreCase("id"))
		{
			by=By.id(address);
			return driver.findElements(by);
		}
		else if(type.equalsIgnoreCase("name"))
		{
			by=By.name(address);
			return driver.findElements(by);
		}
		
		else if(type.equalsIgnoreCase("link"))
		{
			by=By.linkText(address);
			return driver.findElements(by);
		}
		else if(type.equalsIgnoreCase("partialLink"))
		{
			by=By.partialLinkText(address);
			return driver.findElements(by);
		}
		else if(type.equalsIgnoreCase("css"))
		{
			by=By.cssSelector(address);
			return driver.findElements(by);
		}
		else if(type.equalsIgnoreCase("tagname"))
		{
			by=By.tagName(address);
			return driver.findElements(by);
		}
		else if(type.equalsIgnoreCase("xpath"))
		{
			by=By.xpath(address);
			return driver.findElements(by);
		}
		
		return null;
	}
	
	
	public WebElement identifyElement(String type,String address)
	{
		By by;
		
		if(type.equalsIgnoreCase("id"))
		{
			by=By.id(address);
			return driver.findElement(by);
		}
		else if(type.equalsIgnoreCase("name"))
		{
			by=By.name(address);
			return driver.findElement(by);
		}
		else if(type.equalsIgnoreCase("link"))
		{
			by=By.linkText(address);
			return driver.findElement(by);
		}
		else if(type.equalsIgnoreCase("partialLink"))
		{
			by=By.partialLinkText(address);
			return driver.findElement(by);
		}
		else if(type.equalsIgnoreCase("css"))
		{
			by=By.cssSelector(address);
			return driver.findElement(by);
		}
		else if(type.equalsIgnoreCase("tagname"))
		{
			by=By.tagName(address);
			return driver.findElement(by);
		}
		else if(type.equalsIgnoreCase("xpath"))
		{
			by=By.xpath(address);
			return driver.findElement(by);
		}
          return null;
	}

	public String performAction(String type,String value,WebElement element)
	{
		String str=null;
		Select sel;
		if(type.equalsIgnoreCase("click"))
		{
			element.click();
		}
		else if(type.equalsIgnoreCase("settext"))
		{
			element.sendKeys(value);
		}
		else if(type.equalsIgnoreCase("gettext"))
		{
			str=element.getText();
		}
		else if(type.equalsIgnoreCase("navigate"))
		{
			driver.navigate().to(value);
		}
		else if(type.equalsIgnoreCase("selectByIndex"))
		{
			sel=new Select(element);;
			sel.selectByIndex(Integer.parseInt(value));
		}
		else if(type.equalsIgnoreCase("selectByValue"))
		{
			sel=new Select(element);;
			sel.selectByValue(value);
		}
		else if(type.equalsIgnoreCase("selectByVisibleText"))
		{
			sel=new Select(element);;
			sel.selectByVisibleText(value);			
		}
		else if(type.equalsIgnoreCase("switchwindows"))
		{
	        Set<String> handles=driver.getWindowHandles();
	        System.out.println(handles);
	        System.out.println(value);
	        
	        for(String hh:handles)
	        {
	        	if(hh.equals(value))
	        	{
	        		continue;
	        	}
	        	else
	        	{
	        		driver.switchTo().window(hh);
	        		break;
	        	}
	        
	        }
		}
		else if(type.equalsIgnoreCase("switchframe"))
        {
        	
			if(value.equalsIgnoreCase("parent")) {
				
				driver.switchTo().parentFrame();
			}
			else {
				driver.switchTo().frame(element);
			}     		
        		
        	
        }  
		
		/*else if(type.equalsIgnoreCase("brokenimages"))
		{

			WebElement image=driver.findElements(By.cssSelector("img"));
             if(element.getAttribute("width").equals("0"))
             {        System.out.println(image.getAttribute("outerHTML") + " is broken.");
             }
		    }
		
		*/

		return str;
	}
	
}
