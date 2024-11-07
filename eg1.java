package test1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.internal.ReporterConfig;

public class eg1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	String a="test@exprzn.com";
	String b="Pass@123";
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://exprzn.com/auth");
		driver.findElement(By.id("username")).sendKeys("test@exprzn.com");
		driver.findElement(By.id("password")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SoftAssert a1=new SoftAssert();
		a1.assertEquals(a, "test@exprzn.com");
	    a1.assertEquals(b,"Pass@123");
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.urlContains("http://exprzn.com/meetings"));
		Reporter.log("Login Successfully");
		a1.assertAll();
	}
	@Test
	public void login1() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://exprzn.com/auth");
		driver.findElement(By.id("username")).sendKeys("test@exprzn1.com");
		driver.findElement(By.id("password")).sendKeys("Pass@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SoftAssert a1=new SoftAssert();
		a1.assertEquals(a, "test@exprzn1.com");
	    a1.assertEquals(b,"Pass@1234");
	    Reporter.log("Login UNSuccessfully");
		a1.assertAll();
	}
	
	@Test
	public void login3() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://exprzn.com/auth");
		driver.findElement(By.id("username")).sendKeys("test@exprzn.com");
		driver.findElement(By.id("password")).sendKeys("Pass@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SoftAssert a1=new SoftAssert();
		a1.assertEquals(a, "test@exprzn.com");
	    a1.assertEquals(b,"Pass@1234");
	    Reporter.log("Login UNSuccessfully");
		a1.assertAll();
	}
	@Test
	public void login4() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://exprzn.com/auth");
		driver.findElement(By.id("username")).sendKeys("test@exprz2n.com");
		driver.findElement(By.id("password")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SoftAssert a1=new SoftAssert();
		a1.assertEquals(a, "test@expr2zn.com");
	    a1.assertEquals(b,"Pass@123");
	    Reporter.log("Login UnSuccessfully");
		a1.assertAll();
	}
	@Test
	public void login5() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://exprzn.com/auth");
		driver.findElement(By.id("username")).sendKeys("test@exprzn.com");
		driver.findElement(By.id("password")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> townhall = driver.findElements(By.linkText("Townhall Meeting"));
		int size=townhall.size();
		Reporter.log("No of time townhall repeating is",+ size);
		driver.quit();
		
		
		
	}

}
