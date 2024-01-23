package Action;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import Pages.Config;
import Sources.Baseclass;

public class countrylist extends Baseclass {
	@Test
    public  void UserLogin()throws Throwable {
		Baseclass.invoke();
		test = report.startTest("Pre Login");
		driver.findElement(Config.Cookiess).click();

		 // List of countries
        List<String> countries = List.of("unitedkingdom","finland", "norway","canada","newzealand","india","portugal","spain");
       
        // Iterate through countries
        for (String country : countries) {
            try {
            	           	
  		        Thread.sleep(3000);
        		driver.findElement(Config.countrydropdown).click();        		
        		WebElement element = driver.findElement(By.id(country));
        		Actions actions = new Actions(driver);
        		actions.moveToElement(element).click().perform();
        		
        		
        		   Thread.sleep(3000);
    			//Home Menu 
    			try {
    			driver.findElement(Config.home).click();
    			System.out.println("Home menu Redirect successfully ");
    				test.log(LogStatus.PASS, "Home menu succesfully redirect", "To open Screenshots : <a href=' "
    						+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
    			} catch (Exception f10) {
    				System.out.println("Home menu successfully Failed");
    				f10.getMessage();
    				test.log(LogStatus.FAIL, "Home menu FAILED ", "To open Screenshots : <a href=' "
    						+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
    			}
 			
    			   Thread.sleep(3000);
       			//Casino  Menu 
       			try {
       			driver.findElement(Config.casino).click();
       			System.out.println(" Casino menu Redirect successfully ");
       				test.log(LogStatus.PASS, "Casino menu succesfully redirect", "To open Screenshots : <a href=' "
       						+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
       			} catch (Exception f10) {
       				System.out.println("Casino menu successfully Failed");
       				f10.getMessage();
       				test.log(LogStatus.FAIL, "Casino menu FAILED ", "To open Screenshots : <a href=' "
       						+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
       			}
    			
    			Thread.sleep(3000);
    			// livecasino Menu 
    					try {
    					driver.findElement(Config.livecasino).click();
    					System.out.println("Live casino menu  redirect  Success");
    						test.log(LogStatus.PASS, "livecasino menu succesfully redirect", "To open Screenshots : <a href=' "
    								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
    					} catch (Exception f10) {
    						System.out.println("livecasino menu successfully   Failed");

    						f10.getMessage();
    						test.log(LogStatus.FAIL, "livecasino menu   FAILED ", "To open Screenshots : <a href=' "
    								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
    					}	
    					
    					
    					Thread.sleep(3000);
    					// Promotions  Menu 
    					try {
    					driver.findElement(Config.promotions).click();
    					System.out.println("promotions menu redirect  successfully");
    						test.log(LogStatus.PASS, "promotions menu succesfully redirect", "To open Screenshots : <a href=' "
    								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
    					} catch (Exception f10) {
    						System.out.println("promotions menu successfully   Failed");

    						f10.getMessage();
    						test.log(LogStatus.FAIL, "promotions menu FAILED ", "To open Screenshots : <a href=' "
    								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
    					}	
    					
    					Thread.sleep(3000);
    					// Aboutus  Menu 
    					try {
    					driver.findElement(Config.Aboutus).click();
    					System.out.println("Aboutus menu redirect  successfully  ");
    						test.log(LogStatus.PASS, "Aboutus menu succesfully redirect", "To open Screenshots : <a href=' "
    								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
    					} catch (Exception f10) {
    						System.out.println("Aboutus menu successfully  Failed");

    						f10.getMessage();
    						test.log(LogStatus.FAIL, "Aboutus menu  FAILED ", "To open Screenshots : <a href=' "
    								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
    					}	
    					Thread.sleep(3000);
    					// Paymentmethod  Menu 
    					try {
    					driver.findElement(Config.Paymentmethod).click();
    					System.out.println("Paymentmethod menu redirect  successfully  ");
    						test.log(LogStatus.PASS, "Paymentmethod menu succesfully redirect", "To open Screenshots : <a href=' "
    								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
    					} catch (Exception f10) {
    						System.out.println("Paymentmethod menu successfully  Failed");
    						f10.getMessage();
    						test.log(LogStatus.FAIL, "Paymentmethod menu  FAILED ", "To open Screenshots : <a href=' "
    								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
    					}		
    					Thread.sleep(3000);
    					// Privacypolicy  Menu 
    					try {
    					driver.findElement(Config.Privacypolicy).click();
    					System.out.println("Privacypolicy menu redirect  successfully  ");
    						test.log(LogStatus.PASS, "Privacypolicy menu succesfully redirect", "To open Screenshots : <a href=' "
    								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
    					} catch (Exception f10) {
    						System.out.println("Privacypolicy menu successfully  Failed");
    						f10.getMessage();
    						test.log(LogStatus.FAIL, "Privacypolicy menu  FAILED ", "To open Screenshots : <a href=' "
    								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
    					}
    					
    					Thread.sleep(3000);
    					// KYCpolicy  Menu 
    					try {
    					driver.findElement(Config.Privacypolicy).click();
    					System.out.println("KYCpolicy menu redirect  successfully  ");
    						test.log(LogStatus.PASS, "KYCpolicy menu succesfully redirect", "To open Screenshots : <a href=' "
    								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
    					} catch (Exception f10) {
    						System.out.println("KYCpolicy menu successfully  Failed");
    						f10.getMessage();
    						test.log(LogStatus.FAIL, "KYCpolicy menu  FAILED ", "To open Screenshots : <a href=' "
    								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
    					}
  					Thread.sleep(3000);
    					// Responsibegaming  Menu 
    					try {  						
    					driver.findElement(Config.Responsibegaming).click();
    					System.out.println("Responsibegaming menu redirect  successfully  ");
    						test.log(LogStatus.PASS, "Responsibegaming menu succesfully redirect", "To open Screenshots : <a href=' "
    								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
    					} catch (Exception f10) {
    						System.out.println("Responsibegaming menu successfully  Failed");
    						f10.getMessage();
    						test.log(LogStatus.FAIL, "Responsibegaming menu  FAILED ", "To open Screenshots : <a href=' "
    								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
    					}		
    					Thread.sleep(3000);
    					// Terms  Menu 
    					try {
    					driver.findElement(Config.Terms).click();
    					System.out.println("Terms menu redirect  successfully  ");
    						test.log(LogStatus.PASS, "Terms menu succesfully redirect", "To open Screenshots : <a href=' "
    								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
    					} catch (Exception f10) {
    						System.out.println("Terms menu successfully  Failed");
    						f10.getMessage();
    						test.log(LogStatus.FAIL, "Terms menu  FAILED ", "To open Screenshots : <a href=' "
    								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
    					}		
    					Thread.sleep(2000);
    					// Contactus  Menu 
    					try {
    					driver.findElement(Config.Contactus).click();
    					System.out.println("Contactus menu redirect  successfully  ");
    						test.log(LogStatus.PASS, "Contactus menu succesfully redirect", "To open Screenshots : <a href=' "
    								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
    					} catch (Exception f10) {
    						System.out.println("Contactus menu successfully  Failed");
    						f10.getMessage();
    						test.log(LogStatus.FAIL, "Contactus menu  FAILED ", "To open Screenshots : <a href=' "
    								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
    					}
          }
            catch (Exception e) {
                e.printStackTrace(); 
            } 
        }		
}}
			
				
				
				
				
				






