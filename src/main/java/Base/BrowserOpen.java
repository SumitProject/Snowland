package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOpen {
	public static WebDriver driver;

    public void intilization() throws IOException {
        String browseract = readPropertyFile("Browser");
        if (browseract.equalsIgnoreCase("chrome")) {
            ChromeOptions o = new ChromeOptions();
            o.addArguments("--remote-allow-origins=*");
            // o.addArguments("headless");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(o);

        } else if (browseract.equalsIgnoreCase("firefox")) {
            FirefoxOptions o = new FirefoxOptions();
            o.addArguments("--remote-allow-origins=*");
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(o);
        } else {
            EdgeOptions o = new EdgeOptions();
            o.addArguments("--remote-allow-origins=*");
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver(o);
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(readPropertyFile("url"));

    }

    public String readPropertyFile(String value) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\swandhare\\eclipse-workspace\\BDD_cucumber_Proj\\src\\main\\java\\Config\\Config.properties");
        Properties p = new Properties();
        p.load(file);
        return p.getProperty(value);

    }
}
