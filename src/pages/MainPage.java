package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
  }
