package testa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Verify_Page_title
{
	public static void main(String args[])throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeliniumTest\\Driver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Users\\ADMIN\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");		
		WebDriver driver=new ChromeDriver(options);
		//EdgeDriver d=new EdgeDriver();
		driver.navigate().to("https://magento.softwaretestingboard.com/");
		Thread.sleep(4000);
		//verify page title
		if(driver.getTitle().equals("Home Page")) {
		System.out.println("Title matched");
		}
		else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
		}
		
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();

		if(driver.getTitle().equals("Customer Login")){
		System.out.println("Title matched");
			}
		else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}
		Thread.sleep(3000);
		driver.close();	

	}
	
}
