package testa;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calling_POM_ChangePassword
{
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Change_Password lg= new Change_Password(driver);
		lg.url();
		lg.signInLink();
		lg.enterEmail("kulkarnidivya@gmail.com");
		lg.enterPassword("Chaitu@4111");
		lg.clickOnSignInBtn();
		Thread.sleep(4000);
		driver.navigate().refresh();
		lg.clickOnProfileArrow();
		lg.clickOnMyAccount();
		lg.clickOnChnagePassword();
		lg.enterCurrentPass("Chaitu@4111");
		lg.enterNewPass("Chaitu@4111");
		lg.enterConfirmNewPass("Chaitu@4111");
		lg.clickOnSaveBtn();
	
	System.out.println("password got changed");
	driver.close();
	}
}
