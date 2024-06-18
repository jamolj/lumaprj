package testa;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Next_Page_Arrow {
	
	
WebDriver driver;
	
	//@BeforeTest
	public void startUp() {
		System.setProperty("webdriver.chrome.driver","./Driverfiles/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		System.out.println("open url");
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
		System.out.println("click on sign IN");
	}
//using data provider
	@DataProvider(name="data")
	public Object[][] getData()
	{
		return new Object[][] {{"kulkarnidivya@gmail.com","Chaitu@4111"}};
		
	}
	
	@Test(dataProvider = "data")
	public void tc(String email,String password) throws IOException {
		
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
	driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
	System.out.println("entered email & password");
	driver.findElement(By.id("send2")).click();
	System.out.println("click on sign in button");
	}
	@AfterTest
	public void tc02() throws Exception {
	    driver.findElement(By.linkText("Women")).click();
	    driver.findElement(By.linkText("Tops")).click();
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("window.scroll(0,1500)");
	    driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/div[2]/ul/li[6]/a")).click();
		driver.close();
	}



}
