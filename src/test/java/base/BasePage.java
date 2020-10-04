package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.ReadData;

public class BasePage {

    public static WebDriver driver;

    public static String path = System.getProperty("user.dir");
    public static String os = System.getProperty("os.name");
    public static String chromeMacDriverPath = path + ReadData.readDataFromPropertyFile("chromeDriver_mac").trim();
    public static String chromeWinDriverPath = path + ReadData.readDataFromPropertyFile("chromeDriver_win").trim();
    public static String firfoxMacDriverPath = path + ReadData.readDataFromPropertyFile("firefoxDriver_mac").trim();
    public static String firfoxWinDriverPath = path + ReadData.readDataFromPropertyFile("firefoxDriver_win").trim();
    public static String browser = ReadData.readDataFromPropertyFile("browser");

    public static void navigate_To_URL() {

        System.out.println("############# Executing test cases on " + browser + " browser ###############");

        if (os.equalsIgnoreCase("Mac OS X"))
        {
            if (browser.equalsIgnoreCase("chrome"))
            {
                chromeDriverMac();
            }
            if (browser.equalsIgnoreCase("firefox"))
            {
                firefoxBrowserMac();
            }
        }
        else if (os.contains("Windows"))
        {
            if (browser.equalsIgnoreCase("chrome"))
            {
                chromeDriverWin();
            }
            if (browser.equalsIgnoreCase("firefox"))
            {
                firefoxBrowserWin();
            }
        }

        driver.get(ReadData.readDataFromPropertyFile("TestURL"));
        driver.manage().window().maximize();
    }


    public static void chromeDriverMac()
    {
        System.out.println("&&&&&& launching chrome browser on MAC &&&&&&");
        System.setProperty("webdriver.chrome.driver", chromeMacDriverPath);
        driver = new ChromeDriver();
    }

    public static void chromeDriverWin()
    {
        System.out.println("&&&&&& launching chrome browser on WIN &&&&&&");
        System.setProperty("webdriver.chrome.driver", chromeWinDriverPath);
        driver = new ChromeDriver();
    }

    public static void firefoxBrowserMac()
    {
        System.out.println("&&&&&& launching firefox browser in MAC &&&&&&");
        System.setProperty("webdriver.gecko.driver",firfoxMacDriverPath );
        driver = new FirefoxDriver();
    }

    public static void firefoxBrowserWin()
    {
        System.out.println("&&&&&& launching firefox browser in WIN &&&&&&");
        System.setProperty("webdriver.gecko.driver",firfoxWinDriverPath );
        driver = new FirefoxDriver();
    }

    public static WebElement FindBy(By e)
    {
        return driver.findElement(e);
    }

}