package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterUserPage 
{
   WebDriver driver;
   
   public RegisterUserPage( WebDriver driver)
   {
	   this.driver=driver;
   }
   
   private By existingLoialityCardButton=By.xpath("//h2[@class=\"h-title-medium radio-title\"][contains(.,\"Am deja un card\")]");
   private By newLoialityCardButton=By.xpath("//h2[@class=\"h-title-medium radio-title\"][contains(.,\"Nu am un card\")]");
   private By emailField=By.id("email");
   private By continueButton=By.xpath("//button[@class=\"w-100 drmax-btn drmax-btn--primary drmax-btn--medium drmax-btn-icon--left\"]");
   private By firstNameField=By.id("firstName");
   private By lastNameField=By.id("lastName");
   private By passwordField=By.id("password");
   private By termsAndConditionsAgreementButton=By.xpath("//div[@class=\"drmax-selection__text w-100\"]/div/span/a/following-sibling::a[@href=\"https://www.drmax.ro/politica-confidentialitate\"]");
   private By advertisingAgreementButton=By.xpath("//div[@class=\"drmax-selection__text w-100\"]/div/span[contains(.,\"Sunt de acord sa primesc \")]");
   private By submitButton=By.xpath("//button[@class=\"w-100 mt-2 drmax-btn drmax-btn--primary drmax-btn--medium drmax-btn-icon--left\"]/div/span[contains(.,\"Finalizeaza inregistrarea\")]");


   public void checkPageVisibility()
   {
	   
   }
}


