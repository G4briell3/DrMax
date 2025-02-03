package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage 
{
  WebDriver driver;
  
  public  MainPage(WebDriver driver)
  {
	  this.driver=driver;
  }
  
  private By pageHeader=By.xpath("//div[@class=\"pb-html\"]/h2[contains(.,\"Bun venit pe Dr. Max\")]");
  private By loginButton=By.xpath("//button[@id=\"login-btn-header\"]");
  private By loginButtonFromModal=By.xpath("//button[@class=\"mb-3 drmax-btn drmax-btn--primary drmax-btn--medium drmax-btn-icon--left\"]");
  private By createAccountButton=By.xpath("//button[@id=\"login-register-btn\"]");
  private By emailField=By.xpath("//input[@id=\"username\"]");
  private By passwordField=By.xpath("//input[@id=\"current-password\"]");
  private By cartIcon=By.xpath("//div[@class=\"drmax-btn-text-div\"][@data-v-9e534942=\"\"]");
  private By carouselAdvertise=By.xpath("//div[@class=\"carousel carousel-slider slide\"]");
  private By userProfileButton=By.xpath("//div[@class=\"user-profile-btn__left\"]"); //visible after login
  private By eShopMenuButton=By.xpath("//a[@class=\"nuxt-link-exact-active  isCurrent showMenu\"]");
  private By consentModal=By.xpath("//button[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]");
  private By closeModal=By.xpath("//div[@class=\"Icon__IconContainer-sc-11wrh3u-0 kDHnhD PopupCloseControl__CloseIcon-sc-1jcqu10-1 hbINHT\"]");
 // private By closeOtherModal=By.xpath("//button[@class=\"CybotCookiebotBannerCloseButton\"]");
  
  public void clickOnLoginButton()
  {
  	driver.findElement(loginButton).click();
  }
  
  public void checkPageVisibilityBeforeLogin() throws InterruptedException
  {
	  driver.findElement(consentModal).click();
	  
	  driver.findElement(closeModal).click();
	  //Thread.sleep(50000);
	  WebElement closeOtherModal=driver.findElement(By.xpath("//button[@class=\"CybotCookiebotBannerCloseButton\"]"));
	  System.out.println("Is button enabled? " +  closeOtherModal.isDisplayed());
	  //driver.findElement(closeOtherModal).click();
	  closeOtherModal.click(); de facut aici 
	  //Thread.sleep(6000);
	  driver.findElement(eShopMenuButton).isEnabled() ; //check if this is ok
	  driver.findElement(pageHeader).isDisplayed();
	  driver.findElement(loginButton).isDisplayed();
	  driver.findElement(cartIcon).isDisplayed();
	  driver.findElement(carouselAdvertise).isDisplayed();
	  
	  
  }
}
