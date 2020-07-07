package com.triples.project.configuration.chromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChromeDriverContext {

    // window 는 .exe 붙여야 한다.
    @Value("${selenium.webDriver.path}")
    private String CHROME_DRIVER_PATH;

    private WebDriver driver;

    @Bean
    public WebDriver webDriver() {

        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--window-size=1366,768");
//        options.addArguments("--headless");
//        options.setProxy(null);
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//        capabilities.setCapability("pageLoadStrategy", "none");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);

        return driver;
    }


}
