package Pages;

import org.openqa.selenium.By;

public class Config {
			            
				//Login icon
				public static By loginicon           = By.xpath("/html/body/div[1]/div/div[3]/div[1]");
				public static By loginiconclose      = By.xpath("/html/body/div[2]/div[4]/div[2]/div/div/div[2]/div[1]/button");
				
				//logout button 
				public static By Logout              = By.xpath("/html/body/div[3]/div[2]/div/div[5]/ul/li[9]");
				public static By Logoutbutton        = By.xpath("/html/body/div[3]/div[4]/div[5]/div/div/div[2]/div[1]");
				
				
				//Login form
            	public static By username            = By.xpath("//*[@id=\"Username\"]");
		        public static By password            = By.xpath("//*[@id=\"Password\"]");
		        public static By eyeicon             = By.xpath("//*[@id=\"admin_login\"]/div/div[1]/div[2]/img[1]");
		        public static By rememberme          = By.xpath(" //*[@id=\"remember_me\"]");	     
		        public static By Loginbutton         = By.xpath("//*[@id=\"login_check\"]");
		        
		        //Signup form 
		        public static By Signup             = By.xpath("/html/body/div[1]/div/div[3]/div[2]");
		        public static By Signupbutton       = By.xpath(" //*[@id=\"phone_submit_register\"]");
		        public static By signupusername     = By.xpath("//*[@id=\"user_name\"]");
		        public static By signupemail        = By.xpath("//*[@id=\"user_email\"]");
		        public static By signuppassword     = By.xpath("//*[@id=\"user_password\"]");
		        public static By signupmobile       = By.xpath("//*[@id=\"user_mobile_no\"]");
		        public static By signupcode         = By.xpath(" //*[@id=\"user_country_code\"]");
		        
		        public static By Country            = By.xpath("//*[@id=\"user_country_name\"]");
		        public static By Currency           = By.xpath("//*[@id=\"user_currency_code\"]");
		        public static By State              = By.xpath("//*[@id=\"user_state_code\"]");
		        public static By Ageconfrms         = By.xpath("//*[@id=\"age_cnfrm\"]");
		        public static By eyeicon1            = By.xpath("//*[@id=\"phone_user_registration\"]/div[7]/img[1]");
		        public static By TermsConditions    =   By.xpath("/html/body/div[2]/div[4]/div[4]/div/div/div[2]/div[2]/div/div/div/div/div/div/div/form/div[9]/input");
		       
		        
		        
                //Forgot pswd
                public static By   forgot              =  By.xpath("/html/body/div[2]/div[4]/div[2]/div/div/div[2]/div[2]/form/div/div[1]/div[6]/div");
                public static By   forgotsubmit        =  By.xpath("//*[@id=\"submit_forgotpassword\"]");
                public static By   forgotinpufiled     =  By.xpath("//*[@id=\"user_email_mobile\"]");
                
                //Reset  password 
                public static By   NewPassword          =  By.xpath("//*[@id=\"newpassword\"]");
                public static By   Confirmpassword      =  By.xpath("//*[@id=\"confirmpassword\"]");
                public static By   Resetsubmit          =  By.xpath("//*[@id=\"submit_forgotpassword\"]");
               
                
                
                // cookies popup 
                public static By  Cookiess             =  By.xpath("//*[@id=\"cookieviewpopup\"]/div[2]");
                
           	        
		        //preloginheader
                public static By home                 =  By.xpath("/html/body/div[2]/div[2]/div/div[2]/ul/li[1]/a");
                public static By livecasino           =  By.xpath("/html/body/div[2]/div[2]/div/div[2]/ul/li[3]/a");
                public static By casino               =  By.xpath("/html/body/div[2]/div[2]/div/div[2]/ul/li[2]/a");
                public static By promotions           =  By.xpath("/html/body/div[2]/div[2]/div/div[2]/ul/li[4]/a");
                public static By Aboutus              =  By.xpath("/html/body/div[2]/div[2]/div/div[4]/ul/li[1]/a");
                public static By Paymentmethod        =  By.xpath("/html/body/div[2]/div[2]/div/div[4]/ul/li[2]/a");
                public static By Privacypolicy        =  By.xpath("/html/body/div[2]/div[2]/div/div[4]/ul/li[4]/a");
                public static By kycpolicy            =  By.xpath("/html/body/div[2]/div[2]/div/div[4]/ul/li[5]/a");
                public static By Responsibegaming     =  By.xpath("/html/body/div[2]/div[2]/div/div[4]/ul/li[6]/a");
		        public static By Terms                =  By.xpath("/html/body/div[2]/div[2]/div/div[4]/ul/li[7]/a");
		        public static By Contactus            =  By.xpath("/html/body/div[2]/div[2]/div/div[4]/ul/li[8]/a");
		        
		      
		        
		        public static By livecasinogame       =  By.xpath(" /html/body/div[2]/div[4]/div[11]/div[1]/div[1]/div/img");
		        	        
		        //pre login Footermenu 
                public static By Aboutus1              =  By.cssSelector("#myPage > div.left-right-sec-main > div.main_body > div.container > div > div.container-fluid-bgfooter > div > div.black_bg > div.footer_content > div.footer_list1 > ul > li:nth-child(1) > a");
                public static By Paymentmethod1        =  By.xpath("/html/body/div[2]/div[4]/div[10]/div/div[2]/div[4]/div[2]/ul/li[2]/a");
                public static By Contactus1            =  By.xpath("/html/body/div[2]/div[4]/div[10]/div/div[2]/div[4]/div[2]/ul/li[4]/a");
                public static By Privacypolicy1        =  By.xpath("/html/body/div[2]/div[4]/div[10]/div/div[2]/div[4]/div[3]/ul/li[1]/a");
		        public static By Kycpolicy             =  By.xpath("/html/body/div[2]/div[4]/div[10]/div/div[2]/div[4]/div[3]/ul/li[2]/a");
		        public static By Responsibe1           =  By.xpath("/html/body/div[2]/div[4]/div[10]/div/div[2]/div[4]/div[3]/ul/li[3]/a");
		        public static By Terms1                =  By.xpath("/html/body/div[2]/div[4]/div[10]/div/div[2]/div[4]/div[3]/ul/li[4]/a");
		       
		       //html/body/div[3]/div[2]/div/div[3]/ul/li[1]/a/span
                //postloginhamburgermenu
		        public static By Myaccount             =  By.xpath("/html/body/div[3]/div[2]/div/div[3]/ul/li[1]/a/span");
                public static By Myprofile             =  By.xpath("/html/body/div[3]/div[2]/div/div[3]/ul/li[1]/div/a[1]"); 
                public static By KYCmenu               =  By.xpath("/html/body/div[3]/div[4]/div[8]/div/li[5]/a"); 
                public static By RAF                   =  By.xpath("/html/body/div[3]/div[4]/div[8]/div/li[7]/a");
               
                public static By Settings              =  By.xpath("/html/body/div[3]/div[4]/div[8]/div/li[8]/a");                        
                public static By Message               =  By.xpath("/html/body/div[3]/div[4]/div[8]/div/li[9]/a");
                               
                //Post Bank menu
                public static By  Bank                 =   By.xpath("/html/body/div[3]/div[2]/div/div[2]/ul/li[2]/a/img[1]");             
                public static By  deposit              =  By.xpath("/html/body/div[3]/div[4]/div[8]/div/li[1]/a");
                public static By  Withdraw             =  By.xpath("/html/body/div[3]/div[4]/div[8]/div/li[2]/a");
                
                //Post Bank menu
                public static By Bonus                 =  By.xpath("/html/body/div[3]/div[4]/div[8]/div/li[3]/a");
                public static By FreeSpin              =  By.xpath("/html/body/div[3]/div[4]/div[10]/div/div/div/div/div/div/nav/ul/li[2]/a");
                public static By UnclaimedBonus        =  By.xpath("/html/body/div[3]/div[4]/div[10]/div/div/div/div/div/div/nav/ul/li[3]/a");
                public static By  ConsumedBonus        =   By.xpath("/html/body/div[3]/div[4]/div[10]/div/div/div/div/div/div/nav/ul/li[4]/a");
                
               
              //Post Transcation  menu
                public static By   transcation         =  By.xpath("/html/body/div[3]/div[4]/div[8]/div/li[6]/a");
                public static By   Alltranscation      =  By.xpath("/html/body/div[3]/div[4]/div[7]/div/li[6]/a");
                public static By   DepositSummary      =  By.xpath("/html/body/div[3]/div[4]/div[10]/div/div/div/div[1]/nav/ul/li[2]/a");
                public static By   WithdrawSummary     =  By.xpath("/html/body/div[3]/div[4]/div[10]/div/div/div/div[1]/nav/ul/li[3]/a");
                public static By   GameHistory         =  By.xpath("/html/body/div[3]/div[4]/div[10]/div/div/div/div[1]/nav/ul/li[4]/a");
                
                
              //Post login  sub menu
                public static By Posthome                 =  By.xpath("/html/body/div[3]/div[2]/div/div[2]/ul/li[1]/a/span");
                public static By Postcasino               =  By.xpath("/html/body/div[3]/div[2]/div/div[2]/ul/li[2]/a/span");
                public static By Postlivecasino           =  By.xpath("/html/body/div[3]/div[2]/div/div[2]/ul/li[3]/a/span");
               // public static By Postlivecasinogame       =  By.xpath(" /html/body/div[2]/div[4]/div[11]/div[1]/div[1]/div/img");
             
             
                public static By Postpromotions           =  By.xpath("/html/body/div[3]/div[2]/div/div[2]/ul/li[4]/a/span");
                public static By PostAboutus              =  By.xpath("/html/body/div[3]/div[2]/div/div[5]/ul/li[1]/a");
                public static By PostPaymentmethod        =  By.xpath("/html/body/div[3]/div[2]/div/div[5]/ul/li[2]/a");
                public static By PostPrivacypolicy        =  By.xpath("/html/body/div[3]/div[2]/div/div[5]/ul/li[4]/a");
                public static By Postkyc                  =  By.xpath("/html/body/div[3]/div[2]/div/div[5]/ul/li[5]/a");
                
                public static By PostResponsibegaming     =  By.xpath("/html/body/div[3]/div[2]/div/div[5]/ul/li[6]/a");
		        public static By PostTerms                =  By.xpath("/html/body/div[3]/div[2]/div/div[5]/ul/li[7]/a");
		        public static By PostContactus            =  By.xpath("/html/body/div[3]/div[2]/div/div[5]/ul/li[8]/a");
           
           
               // My Profile page
		        public static By   promotion           =  By.xpath("/html/body/div[3]/div[6]/div/div/form/div/p");
		        public static By   Profilesubmit       =  By.xpath("//*[@id=\"profile_validation\"]/div[2]/button");
		        public static By   firstname           =  By.xpath("//*[@id=\"first_name\"]");
		        public static By   lastname            =  By.xpath("//*[@id=\"last_name\"]");
		        public static By   city                =  By.xpath("//*[@id=\"cityId\"]");
		        public static By   address             =  By.xpath("//*[@id=\"address\"]");
		        public static By   city1               =  By.xpath("/html/body/div[3]/div[4]/div[9]/div/div/div/div/form/div[1]/div[2]/div[3]/ul/li[1]");
                public static By   gender              =  By.xpath("/html/body/div[3]/div[4]/div[9]/div/div/div/div/form/div[1]/div[1]/div[4]/select");
                public static By   DOB                 =  By.xpath("/html/body/div[3]/div[4]/div[9]/div/div/div/div/form/div[1]/div[1]/div[5]/input");
                public static By   Profilesubmits      =  By.xpath("/html/body/div[3]/div[4]/div[9]/div/div/div/div/form/div[2]/button");  
                
                
                public static By   KYCSelect           =  By.xpath("/html/body/div[3]/div[4]/div[11]/div/div/div/div[1]/form/div/div[2]/div[1]/select");   
                public static By   KYCpassport         =  By.xpath("//html/body/div[12]/div[1]/div/div[2]/div[1]/div/ul/li[1]/a"); 
                public static By   KYCid               =  By.xpath("/html/body/div[3]/div[4]/div[11]/div/div/div/div[1]/form/div/div[2]/div[1]/select/option[2]"); 
                public static By   KYCdrivinglicense   =  By.xpath("/html/body/div[3]/div[4]/div[11]/div/div/div/div[1]/form/div/div[2]/div[1]/select/option[3]"); 
                public static By   KYCsubmit           =  By.xpath("/html/body/div[3]/div[4]/div[11]/div/div/div/div[1]/form/div/div[2]/div[14]/button");
                public static By   KYCdocument         =  By.xpath("/html/body/div[3]/div[4]/div[11]/div/div/div/div[1]/form/div/div[2]/div[2]/input");             
                public static By   KYCdatepicker       =  By.xpath(" /html/body/div[3]/div[4]/div[11]/div/div/div/div[1]/form/div/div[2]/div[3]/input"); 
                public static By   KYCchoosefile       =  By.xpath("/html/body/div[3]/div[4]/div[11]/div/div/div/div[1]/form/div/div[2]/div[9]/div[1]/input[2]"); 
                public static By   KYCchoosefile2      =  By.xpath("/html/body/div[3]/div[4]/div[11]/div/div/div/div[1]/form/div/div[2]/div[9]/div[2]/input[2]"); 
                
               //country drop down
                public static By   countrydropdown     =  By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[1]/div");     
                public static By   dropdown            =  By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[1]/div/ul");
	
        // settings menu :             
                public static By   depositlimit         =  By.xpath("/html/body/div[3]/div[4]/div[10]/div/div/div/div/div[3]/div/nav/ul/li[2]/a");
                public static By   depositlimitsubmit   =  By.xpath("/html/body/div[3]/div[4]/div[10]/div/div/div/div/div[3]/div/div/div[1]/form/div[2]/button");                 
                public static By   changepassword       =  By.xpath("/html/body/div[3]/div[4]/div[10]/div/div/div/div/div[3]/div/nav/ul/li[3]/a");
                public static By   changepsdbutton      =  By.xpath("/html/body/div[3]/div[4]/div[10]/div/div/div/div/div[3]/div/div/div[5]/form/div[2]/button");                
                public static By   selfexculsion        =  By.xpath("/html/body/div[3]/div[4]/div[10]/div/div/div/div/div[3]/div/nav/ul/li[4]/a");
                
                
                //game  icon  load
                public static By   gameiconclick        =  By.xpath("/html/body/div[3]/div[4]/div[11]/div/div/div[1]/div/div/div/div/div/div[1]");                
                public static By   provider             =  By.xpath(" /html/body/div[3]/div[4]/div[9]/div[1]/li[6]/a");
                public static By   chat                 =  By.xpath("/html/body/div/div/div");
                public static By   casinogame           =  By.xpath("/html/body/div[3]/div[4]/div[11]/div/div/div[1]/div/div");
	}

 
