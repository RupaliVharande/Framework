package generic;

import java.awt.MouseInfo;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
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
		WebDriverWait wait=new WebDriverWait(driver, 60);
		ExpectedCondition<WebElement> ec=ExpectedConditions.visibilityOfElementLocated(by);
		
		
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
		else if(type.equalsIgnoreCase("linktext"))
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
	
	
	public void captureScreenShot(String name)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source;
		source=ts.getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File destination=new File("C:\\Users\\HP\\eclipse-workspace\\Framework\\target\\"+name+".png");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public int getCountofBrokenImages(List<WebElement> elements)
	{
	    int count=0;
		for(WebElement image:elements)
		{
			HttpClient client=HttpClientBuilder.create().build();
			HttpGet request=new HttpGet(image.getAttribute("src"));
			try {
				HttpResponse response=client.execute(request);
				int code=response.getStatusLine().getStatusCode();
				if(code!=200)
				{
					count++;
				}
				System.out.println(response);
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		
		return count;
		
			
		
		
	}
	
	public String mouseHoverOperation(WebElement webElement, WebElement webElement2)
	{
		
		Actions op=new Actions(driver);
		op.moveToElement(webElement).build().perform();
		return webElement2.getText();
		
		
	}
	
	public void moveMouse(int point) {
		Actions op=new Actions(driver);
		
		double y = MouseInfo.getPointerInfo().getLocation().getY();
		point =(int) y;
		System.out.println(point);
		op.moveByOffset(0, -5).build().perform();;
		
		
	}
	
	public int getWindowWidthHeight(String dimensionName) {
		int value =0;
		if(dimensionName.equalsIgnoreCase("height")) {
			
			value= driver.manage().window().getSize().height;
			
		}
		else if(dimensionName.equalsIgnoreCase("width")) {
			value= driver.manage().window().getSize().width;
		}
		return value;		
		
	}
	
	public void dragandDrop(WebElement webElement,WebElement webElement2) 
	
	{
		Actions op=new Actions(driver);
       
        // op.dragAndDrop(webElement, webElement2).build().perform();
         /*op.clickAndHold(webElement)

				.moveToElement(webElement2)

				.release(webElement2)

				.build().perform();*/
         
        /*op.clickAndHold(webElement).moveToElement(webElement2).release(webElement2).build().perform();
         try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
         
         
         Actions builder = new Actions(driver);
         org.openqa.selenium.interactions.Action dragAndDrop = builder.clickAndHold(webElement)
         .moveToElement(webElement2)
         .release(webElement2)
         .build();
         dragAndDrop.perform();

       
         
        

	}
	
}
