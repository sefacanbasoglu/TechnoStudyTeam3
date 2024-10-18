package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseDriverParametres {
    public static WebDriver driver;
    public static WebDriverWait wait;
    @Parameters("browserTipi")
    @BeforeClass
    public void initialOperations(String browserTipi){
        switch (browserTipi.toLowerCase())
        {
            case "Safari":driver=new SafariDriver();break;
            case "edge":driver=new EdgeDriver();break;
            default: driver=new ChromeDriver();
        }
        driver=new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        login();
    }

    @AfterClass
    public void finishingOperations() {

        Tools.Sleep(3);
        driver.quit();


    }

    public void login(){
        driver.get("https://techno.study/tr/");

    }


}

