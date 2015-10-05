package pages;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.fluentlenium.core.FluentPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class BasePage extends FluentPage{
    static WebDriver driver;
    static {
        String browserType = System.getProperty("browser");
        if (browserType == null)
            browserType = "firefox";
        if (browserType.toLowerCase().contains("chrome"))
            driver = new ChromeDriver();
        else if (browserType.toLowerCase().contains("htmlunit"))
            driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
        else
            driver = new FirefoxDriver();
    }

    public BasePage(){
        super(driver);
    }

    public void quitBrowser(){
        getDriver().close();
    }
}