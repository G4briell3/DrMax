package tests;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest 
{
 public static WebDriver driver;
 
 @BeforeClass
 public static void setup()
 {
	 
 }
 
 @AfterClass
 public static void teardown()
 {
		ChromeOptions chromeOption=new ChromeOptions();
		chromeOption.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		chromeOption.addArguments("--disable-notifications"); // Disable notifications
		chromeOption.addArguments("--disable-popup-blocking"); // Disable popup blocking
		System.setProperty("webdriver.chrome.driver","src/resource/chromedriver.exe");
		chromeOption.addArguments("--disable-infobars"); // Disable infobars
		
		chromeOption.addArguments("--disable-default-apps"); // Disable default apps
		chromeOption.addArguments("--no-first-run"); // Skip first run wizards
		chromeOption.addArguments("--no-default-browser-check"); // Skip default browser check
		chromeOption.addArguments("--disable-search-engine-choice-screen");//skip search engine options
		chromeOption.addArguments("--start-maximized"); // Open browser in maximized mode
		
		chromeOption.addArguments("--disable-extensions"); // Disable extensions
		
		driver=new ChromeDriver(chromeOption);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 }
 
 @Before
 public  void before()
 {
	 
 }
 
 @After
 public void after()
 {
	 driver.close();
 }
}
