package samples.oops;

public class Loginpage extends BasePage {

    public Loginpage(WebDriver driver, ConfigReader config)
    {
        super(driver,config);
    }
    
    @Override
    public void page_action(String url, String element) 
    { 
        
        System.out.println("LOG: Starting specific login page sequence...");
        super.page_action(url, element);
        System.out.println("LOG: Page action completed for Login.");  
    }

    @Override
    public String getPageTitle()
    {
        String PT = "";
        System.out.println("Page title is read");
        return PT;

    }
}
