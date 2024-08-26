package webtest.utils;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

/**
 * @ClassName WebTestUtils
 * @Description TODO
 * @Author JIANGSHEN
 * @Date 2024/8/26 18:05
 * @Version 1.0
 */
public class WebTestUtils {

    private EdgeDriver driver;

    /**
    *@MethodName: openBrowser
    *@Description TODO
    *@Author JIANGSHEN
    *@Date 2024/8/26
    *@Time 18:07
    */
    public void openBrowser() {
      /*        System.setProperty("webdriver.chrome.driver","webDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); */
        System.setProperty("webdriver.edge.driver", "webDrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.verboseLogging", "true");
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(edgeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//停顿10s，等待浏览器打开
    }

    /**
    *@MethodName: closeBrowser
    *@Description TODO
    *@Author JIANGSHEN
    *@Date 2024/8/26
    *@Time 18:07
    */
    public void closeBrowser(){
        driver.quit();
    }

}
