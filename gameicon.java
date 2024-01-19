package Action;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import Pages.Config;
import Sources.Baseclass;

public class gameicon extends Baseclass {
	@Test
    public  void UserLogin()throws Throwable {
		Baseclass.invoke();
		test = report.startTest("Game icon");
			
		Thread.sleep(1000);
		driver.findElement(Config.loginicon).click();
		System.out.println("Login button clicked !!");
		
		Thread.sleep(2000);
		// valid credentails
		try {
			WebElement username = driver.findElement(Config.username);
			username.sendKeys("Expired");
			System.out.println(" Username entered !!");
			WebElement password = driver.findElement(Config.password);
			Thread.sleep(2000);
			password.sendKeys("Test@1234");
			System.out.println("Password Entered!!");
			Thread.sleep(2000);
			driver.findElement(Config.eyeicon).click();	
			Thread.sleep(1500);

			test.log(LogStatus.PASS, "Valid username and password  ", "To open Screenshots : <a href=' "
					+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		} catch (Exception f10) {
			System.out.println("Valid username and password  Failed");

			f10.getMessage();
			test.log(LogStatus.FAIL, "Valid username and password  FAILED ", "To open Screenshots : <a href=' "
					+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		}
		
		
		// Remember me &  Login success
				try {
					driver.findElement(Config.rememberme).click();					
					driver.findElement(Config.Loginbutton).click();
					System.out.println("Login successfully!!");
					Thread.sleep(1500);

					test.log(LogStatus.PASS, " login success ", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("Login successfully  Failed");

					f10.getMessage();
					test.log(LogStatus.FAIL, "Login  successfuly FAILED ", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}
				Thread.sleep(3000);
				
				driver.findElement(Config.Cookiess).click();
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
			// Casino  Menu 
			try {
			driver.findElement(Config.livecasino).click();
			System.out.println("Casino menu  redirect successfully");
				test.log(LogStatus.PASS, "casino menu succesfully redirect", "To open Screenshots : <a href=' "
						+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
			} catch (Exception f10) {
				System.out.println("casino menu successfully   Failed");

				f10.getMessage();
				test.log(LogStatus.FAIL, "casino menu  FAILED ", "To open Screenshots : <a href=' "
						+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
			}
			
		//	Thread.sleep(3000);   
			// Chat Menu 
					try {
					driver.findElement(Config.chat).click();
					System.out.println(" chat    Success");
						test.log(LogStatus.PASS, " chat succesfully ", "To open Screenshots : <a href=' "
								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					} catch (Exception f10) {
						System.out.println("chat  successfully   Failed");

						f10.getMessage();
						test.log(LogStatus.FAIL, "chat menu   FAILED ", "To open Screenshots : <a href=' "
								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					}
					
		Thread.sleep(3000);   
		// Gameicon Menu 
				try {
				driver.findElement(Config.casinogame).click();
				System.out.println(" Seeall  redirect  Success");
					test.log(LogStatus.PASS, "Seeall menu succesfully redirect", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("Seeall menu successfully   Failed");

					f10.getMessage();
					test.log(LogStatus.FAIL, "Seeall menu   FAILED ", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}
				
				Thread.sleep(6000);  
			
				//Casino game favourite Menu 
				try {
				driver.findElement(Config.gameiconclick).click();
				System.out.println("casino favorite game opened  Success");
					test.log(LogStatus.PASS, "casino favorite game opened", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("casino favorite game opened  Failed");

					f10.getMessage();
					test.log(LogStatus.FAIL, "casino favorite game opened   FAILED ", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} 
				Thread.sleep(6000);	
				
				
				
				
		}}
			
				
				
				
				
				






