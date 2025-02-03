package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;

public class RegisterUserTests extends BaseTest
{
 @Before @Override
 public void before()
 {
	 super.before();
	 driver.get(URL.Main); 
	 
 }
 
 @Test
 public void testCase1() throws InterruptedException  //Register User
 {
	 mainPage.checkPageVisibilityBeforeLogin();
	 //Thread.sleep(500000);
	 mainPage.clickOnLoginButton();
 }
}
