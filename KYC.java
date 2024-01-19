package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import Pages.Config;
import Sources.Baseclass;


public class KYC extends Baseclass{
	@Test
    public  void UserLogin()throws Throwable {
		Baseclass.invoke();
		test = report.startTest("Login");
		Thread.sleep(1000);
		driver.findElement(Config.loginicon).click();
		System.out.println("Login button clicked !!");

		
		Thread.sleep(3000);
		// valid credentails
		try {
			WebElement username = driver.findElement(Config.username);
			username.sendKeys("Dob008");
			System.out.println(" Username entered !!");
			WebElement password = driver.findElement(Config.password);
			Thread.sleep(2000);
			password.sendKeys("Test@123");
			System.out.println("Password Entered!!");
			Thread.sleep(2000);
			driver.findElement(Config.eyeicon).click();	
			driver.findElement(Config.rememberme).click();					
			driver.findElement(Config.Loginbutton).click();
			Thread.sleep(1500);

			test.log(LogStatus.PASS, "Valid username and password  ", "To open Screenshots : <a href=' "
					+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		} catch (Exception f10) {
			System.out.println("Valid username and password  Failed");

			f10.getMessage();
			test.log(LogStatus.FAIL, "Valid username and password  FAILED ", "To open Screenshots : <a href=' "
					+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		}
		
		     Thread.sleep(2000);
				  //Hamburger menu site &  My profile click  
		  	       try {	  	    
		  	    	 driver.findElement(Config.Myaccount).click(); 
		  	    	 System.out.println("Post Hamburger Menu clicked!!");
		  	    	driver.findElement(Config.Myprofile).click(); 	
		  	    	driver.findElement(Config.KYCmenu).click();
		  	    //	KYCmenu
		             System.out.println("Post kyc  Menu");
		    			Thread.sleep(1500);
						test.log(LogStatus.PASS, "Kyc Verified", "To open Screenshots : <a href=' "
								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");	    			
		    			}
		    			catch(Exception f10) 
		    			{
		    				System.out.println("KYC failed");
		    				f10.getMessage();
		    				test.log(LogStatus.PASS, "KYC  Failed", "To open Screenshots : <a href=' "
									+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");	    				
		    			}
				

					Thread.sleep(3000);
					// kyc empty details  
					try {
						driver.findElement(Config.KYCsubmit).click();								
					System.out.println("Kyc empty verified  successfully");
						test.log(LogStatus.PASS, "Kyc empty verified   successfully ", "To open Screenshots : <a href=' "
								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					} catch (Exception f10) {
						System.out.println("Kyc empty  Failed");
						f10.getMessage();
						test.log(LogStatus.FAIL, "Kyc empty  FAILED ", "To open Screenshots : <a href=' "
								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					}	
		  	       
					Thread.sleep(3000);
					// kyc id   Menu 
					try {
						driver.findElement(Config.KYCid).click();								
					System.out.println("Kyc id selected  successfully");
						test.log(LogStatus.PASS, "Kyc id selected  successfully ", "To open Screenshots : <a href=' "
								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					} catch (Exception f10) {
						System.out.println("Kyc id selected Failed");
						f10.getMessage();
						test.log(LogStatus.FAIL, "Kyc id selected  FAILED ", "To open Screenshots : <a href=' "
								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					}	
					
					Thread.sleep(3000);
					// kyc document   Menu 
					try {						
						WebElement KYCdocuments = driver.findElement(Config.KYCdocument);
						Thread.sleep(2000);
						KYCdocuments.sendKeys("234567890234");												
					System.out.println("Kyc document entered  successfully");
						test.log(LogStatus.PASS, "Kyc document entered  successfully", "To open Screenshots : <a href=' "
								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					} catch (Exception f10) {
						System.out.println("Kyc document entered  successfully Failed");
						f10.getMessage();
						test.log(LogStatus.FAIL, "Kyc document entered  FAILED ", "To open Screenshots : <a href=' "
								+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					}	
					 Thread.sleep(2000);	
				  	  // Datepicker 
				  	    try {	  	      	   
					            WebElement kycdate = driver.findElement(Config.KYCdatepicker);
					            System.out.println(" KYCdatepicker  Selected  successfully!!");
					 			Thread.sleep(4000);
					 			kycdate.sendKeys("26-12-2005");
					 			Thread.sleep(5000);
					 			kycdate.click();
					 			Thread.sleep(4000);				 			
		                       System.out.println("KYCdatepicker updated  successfully!!");					            
					            test.log(LogStatus.PASS, "KYCdatepicker  Selected  successfully"," open Screenshots : <a href=' "
										+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					    			}
					    			catch(Exception f10)  
					    			{
					    				System.out.println("KYCdatepicker  Selected  failed");
				    				f10.getMessage();
						            test.log(LogStatus.FAIL, "KYCdatepicker FAILEd ","To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");					            
				  	     	}   
				  	    
				  	  Thread.sleep(2000);	
				  	  // More than 2 mb choose file1 
				  	       try {	  	      	   
				  		    WebElement elem =driver.findElement(Config.KYCchoosefile);					    	
						  	elem.sendKeys("C:\\Users\\DE-LT\\Downloads\\SampleJPGImage_200kbmb.jpg");
					 			Thread.sleep(4000);				 			
		                       System.out.println("More than 2mb  updated  successfully!!");					            
					            test.log(LogStatus.PASS, "More than 2mb  successfully"," open Screenshots : <a href=' "
										+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					    			}
					    			catch(Exception f10)  
					    			{
					    				System.out.println("More than 2mb  Selected  failed");
				    				f10.getMessage();
						            test.log(LogStatus.FAIL, "More than 2mb FAILEd ","To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");					            
				  	     	} 
				  	  Thread.sleep(2000);	
				  	  //less than 2 mb choose file1 
				  	       try {	  	      	   
				  		    WebElement elem =driver.findElement(Config.KYCchoosefile);					    	
						  	elem.sendKeys("C:\\Users\\DE-LT\\Downloads\\SampleJPGImage_50kbmb (1).jpg");
					 			Thread.sleep(4000);				 			
		                       System.out.println("Less than 2mb updated  successfully!!");					            
					            test.log(LogStatus.PASS, "Less than 2mb updated   Selected  successfully"," open Screenshots : <a href=' "
										+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					    			}
					    			catch(Exception f10)  
					    			{
					    				System.out.println("Less than 2mb updated   Selected  failed");
				    				f10.getMessage();
						            test.log(LogStatus.FAIL, "Less than 2mb updated  FAILEd ","To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");					            
				  	     	} 		  	       
				  	     Thread.sleep(2000);	
					  	  // choose file 2
					  	       try {	  	      	   
					  		    WebElement elem =driver.findElement(Config.KYCchoosefile2);					    	
							  	elem.sendKeys("C:\\Users\\DE-LT\\Downloads\\SampleJPGImage_50kbmb (1).jpg");
						 			Thread.sleep(4000);				 			
			                       System.out.println("Proof 1 & 2  updated  successfully!!");					            
						            test.log(LogStatus.PASS, "Proof 1 & 2  updated  Selected  successfully"," open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
						    			}
						    			catch(Exception f10)  
						    			{
						    				System.out.println("Proof 1 & 2  updated  Selected  failed");
					    				f10.getMessage();
							            test.log(LogStatus.FAIL, "Proof 1 & 2  updated"
							            		+ " FAILEd ","To open Screenshots : <a href=' "
												+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");					            
					  	     	}   

								Thread.sleep(3000);
								// kyc  details  updated successfully
								try {
									driver.findElement(Config.KYCsubmit).click();								
								System.out.println("kyc  details  updated successfully");
									test.log(LogStatus.PASS, "kyc  details  updated successfully", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								} catch (Exception f10) {
									System.out.println("kyc  details  updated  Failed");
									f10.getMessage();
									test.log(LogStatus.FAIL, "kyc  details  updated  FAILED ", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								}	  	    
				  	    
			  	    
	}
}


            
            
        	  

