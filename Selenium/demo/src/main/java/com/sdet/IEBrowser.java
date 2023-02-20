package com.sdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

/**
 * Basic IE browser launcher ignoring zoom and security settings
 *
 */
public class IEBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver", "Selenium\\demo\\src\\common\\Resources\\IEDriverServer.exe");

        InternetExplorerOptions options = new InternetExplorerOptions();
        options.introduceFlakinessByIgnoringSecurityDomains();
        options.ignoreZoomSettings();

        WebDriver driver = new InternetExplorerDriver(options);

        driver.get("https://www.microsoft.com");
    }
    
}
