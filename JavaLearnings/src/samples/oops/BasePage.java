package samples.oops;

public abstract class BasePage {

    protected WebDriver driver;
    protected ConfigReader config;

    public BasePage(WebDriver driver, ConfigReader config)
    {
        this.driver = driver;
        this.config = config;
    }

    public void click(String locator)
    {
            System.out.println("clicked the locator without wait"+locator);
    }

    public void clickAfterWait(String locator, int waitTime)
    {
            System.out.println("clicked the locator after waiting for"+waitTime+"seconds" +locator);
    }

    public void clickAfterDefaultWait(String locator)
    {
            int defaultWait = config.getimeout();
            System.out.println("clicked the locator after waiting for"+defaultWait+"seconds" +locator);
    }


    public void page_action(String url, String locator) 
    {
        driver.get(url);
        driver.findElement(locator);
        driver.close();
    }

    public abstract String getPageTitle();


    
}
