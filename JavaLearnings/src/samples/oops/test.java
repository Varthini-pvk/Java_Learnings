package samples.oops;

public class test {


public static void main(String[] args) {    
    // 1. Setup Config
ConfigReader myConfig = new ConfigReader("Chrome", 10);

// 2. Setup Driver
WebDriver myDriver = new Chrome();

// 3. Setup Page with both
BasePage pageobj = new Loginpage(myDriver, myConfig);

// 4. Usage
pageobj.click("login_button");            // Calls Version 1
pageobj.clickAfterWait("submit_button", 5);        // Calls Version 2
pageobj.clickAfterDefaultWait("link");// Uses the 10 from myConfig
}
    
}
