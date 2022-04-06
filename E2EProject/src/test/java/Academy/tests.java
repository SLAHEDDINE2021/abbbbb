package Academy;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tests {

	@Test
	public void initialize()  {

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("[class='blinkingText']")).click();
		
		 Set<String> windows = driver.getWindowHandles();
		 
		 Iterator<String> it = windows.iterator();
		 String parentWindow = it.next();
		 String childWindow = it.next();
		 
		 
		 driver.switchTo().window(childWindow);
		 
		 

			System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

			driver.findElement(By.cssSelector(".im-para.red")).getText();
			
			String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
			
			System.out.println(email);
			
			driver.switchTo().window(parentWindow);
			
			driver.findElement(By.id("username")).sendKeys(email);
		 
		
	  
		
		

	}}

	/*
	 * driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	 * 
	 * 
	 * 
	 * driver.findElement(By.cssSelector("[class='blinkingText']")).click();
	 * 
	 * 
	 * Set<String> windows = driver.getWindowHandles();
	 * 
	 * Iterator<String> it = windows.iterator();
	 * 
	 * String prentWindow = it.next(); String childWindow = it.next();
	 * 
	 * driver.switchTo().window(childWindow);
	 * 
	 * System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText
	 * ()); driver.findElement(By.cssSelector(".im-para.red")).getText();
	 * 
	 * String email
	 * =driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].
	 * trim().split(" ")[0];
	 * 
	 * System.out.println(email);
	 * 
	 * driver.switchTo().window(prentWindow);
	 * 
	 * driver.findElement(By.id("username")).sendKeys(email);
	 * 
	 * 
	 * 
	 * 
	 * /* driver.get("https://jqueryui.com/droppable/");
	 * 
	 * //nombre de frame dans la page
	 * 
	 * System.out.println(driver.findElements(By.tagName("iframe")).size());
	 * 
	 * //acceder a ce fram
	 * 
	 * //driver.switchTo().frame(0);
	 * 
	 * driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	 * 
	 * 
	 * WebElement souce = driver.findElement(By.id("draggable"));
	 * 
	 * WebElement destination = driver.findElement(By.id("droppable"));
	 * 
	 * Actions act = new Actions (driver);
	 * 
	 * act.dragAndDrop(souce, destination).build().perform();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * /*driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	 * 
	 * driver.findElement(By.id("divpaxinfo")).click();
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); /*for(int
	 * i=1;i<2;i++) {
	 * 
	 * driver.findElement(By.id("hrefIncAdt")).click();
	 * 
	 * 
	 * }
	 */

	/*
	 * int i=1; int i1=0;
	 * 
	 * while(i<2) { driver.findElement(By.id("hrefIncAdt")).click(); i++;
	 * 
	 * } while (i1<3) {
	 * 
	 * driver.findElement(By.id("hrefIncChd")).click(); i1++;
	 * 
	 * }
	 * 
	 * driver.findElement(By.id("btnclosepaxoption")).click();
	 * 
	 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	 * 
	 * 
	 * 
	 * 
	 * /* driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	 * 
	 * Select sel = new
	 * Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	 * 
	 * 
	 * sel.selectByValue("USD");
	 * 
	 * System.out.println(sel.getFirstSelectedOption().getText());
	 * 
	 * 
	 * /*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 * 
	 * driver.findElement(By.id("name")).sendKeys("slah");
	 * driver.findElement(By.id("confirmbtn")).click();
	 * 
	 * String alertMessage =driver.switchTo().alert().getText();
	 * 
	 * System.out.println(alertMessage);
	 * 
	 * driver.switchTo().alert().accept();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * /*driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	 * 
	 * driver.findElement(By.id("autosuggest")).sendKeys("Ind");
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 * 
	 * List<WebElement> listChoix =
	 * driver.findElements(By.cssSelector("[class='ui-menu-item']"));
	 * 
	 * for(WebElement option :listChoix) {
	 * 
	 * if(option.getText().equalsIgnoreCase("India")) {
	 * 
	 * 
	 * 
	 * option.click();
	 * 
	 * break; }
	 * 
	 * 
	 * }
	 */
	

