package samples.oops;

public class ConfigReader {

    private String browserType;
    private int timeout;

    public ConfigReader(String browserType,int timeout)
    {
        this.browserType = browserType;
        this.timeout = timeout;

    }

    public String getBrowserType()
    {
        return this.browserType;
    }

    public int getimeout()
    {
        return this.timeout;
    }
    
}
