package Main;

import Utlity.BaseDriver;
import Utlity.BaseDriverParameter;
import Utlity.Tools;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Set;


public class technoStudy extends BaseDriver {

    @Test
    public void Test_US_1() throws IOException {

        Elements elements = new Elements();

        // wait.until(ExpectedConditions.elementToBeClickable(elements.courses)).click();


        for (int i = 0; i < elements.coursesList.size(); i++) {
            wait.until(ExpectedConditions.elementToBeClickable(elements.courses)).click();
            wait.until(ExpectedConditions.elementToBeClickable(elements.coursesList.get(i))).click();
            Assert.assertTrue(elements.coursesList.get(i).isEnabled(), "Kurs bulunamadi");

            TakesScreenshot ts = (TakesScreenshot) driver;
            File shot = new File("target/screnshott/incorectSystem.jpg");
            File picture = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(picture, shot);


        }
    }

    @Test(enabled = false)
    public void Test_US_2() throws IOException {
        Elements elements = new Elements();
        wait.until(ExpectedConditions.elementToBeClickable(elements.campusLogin)).click();
        Assert.assertTrue(elements.loginButton.isDisplayed());

        TakesScreenshot ts = (TakesScreenshot) driver;
        File shot = new File("target/screnshott/sayfa1.jpg");
        File picture = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(picture, shot);

    }

    @Test(dataProvider = "getData")
    public void Test3(String name, String mail, String phoneNumber, String age, String job) {
        Elements elements = new Elements();


        elements.basvur.click();
        elements.nameSurnameInput.sendKeys(name);
        elements.email.sendKeys(mail);
        elements.phoneNumberInput.sendKeys(phoneNumber);
        elements.age.sendKeys(age);

        elements.job.sendKeys(job);
        Tools.Sleep(5);

        Select select = new Select(elements.egitimDurumu);
        select.selectByValue("Üniversite");

        Select select1 = new Select(elements.ulke);
        select1.selectByVisibleText("Algeria");

        Select select2 = new Select(elements.kurs);
        select2.selectByValue("Job Center & Arbeitsamt");

        Select select3 = new Select(elements.biziNeredenDuydun);
        select3.selectByValue("Instagram");

        elements.promo.sendKeys("TestTeam3dh");
        elements.okudumKabulEdiyorum.click();

        elements.gonder.click();
    }

    @DataProvider
    Object[][] getData() {
        Object[][] data = {
                {"Test Team3", "test_team@gmail.com", "5212102121", "22", "QA Enginner"}};
        return data;
    }


    @Test(enabled = true)
    public void Test4() throws IOException {

        Elements elements = new Elements();

        for (int i = 0; i < elements.coursesList.size(); i++) {
            String getUrl = driver.getCurrentUrl();
            wait.until(ExpectedConditions.elementToBeClickable(elements.courses)).click();

            wait.until(ExpectedConditions.elementToBeClickable(elements.coursesList.get(i))).click();



            Assert.assertTrue(elements.coursesList.get(i).isEnabled(), "Kurs sayfası açılmadı : " + elements.coursesList.get(i).getText());

            TakesScreenshot ts = (TakesScreenshot) driver;
            File shot = new File("target/screnshott/sayfa2.jpg");
            File picture = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(picture, shot);

        }


    }

    @Test
    public void Test5() {


        Elements elements = new Elements();

        Actions actions = new Actions(driver);

        // Facebook
        // WebElement facebookIcon = driver.findElement(By.xpath("//a[contains(@href, 'facebook')]"));
        actions.moveToElement(elements.facebookIcon).perform();

        elements.facebookIcon.click();

        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(currentUrl.contains("facebook.com"), "Facebook linki doğru açılmadı!");

        // Anasayfaya
        driver.navigate().back();

        // Instagram
        actions.moveToElement(elements.instagramIcon).perform();

        elements.instagramIcon.click();


        currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("instagram.com"), "Instagram linki doğru açılmadı!");

        // Anasayfaya
        driver.navigate().back();


        // LinkedIn
        actions.moveToElement(elements.linkedlnIcon).perform();
        elements.linkedlnIcon.click();


        currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("linkedin.com"), "LinkedIn linki doğru açılmadı!");

        // Anasayfaya
        driver.navigate().back();


        //Youtube
        actions.moveToElement(elements.youtubeIcon).perform();
        elements.youtubeIcon.click();


        currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("youtube.com"), "Youtube linki doğru açılmadı!");

        // Anasayfaya
        driver.navigate().back();


    }

    @Test(enabled = true)
    public void Test6() {
        Elements elements = new Elements();
        for (int i = 0; i < elements.coursesList.size(); i++) {

            wait.until(ExpectedConditions.elementToBeClickable(elements.courses)).click();
            wait.until(ExpectedConditions.elementToBeClickable(elements.coursesList.get(i))).click();
            wait.until(ExpectedConditions.elementToBeClickable(elements.logo)).click();
            Assert.assertTrue(elements.logo.isEnabled());
        }
        elements.bilgiAlin.click();
        Assert.assertTrue(elements.logo.isEnabled());
        elements.logo.click();

        Actions actions = new Actions(driver);
        actions.scrollToElement(elements.gonder);
        Assert.assertTrue(elements.logo.isEnabled());
        elements.logo.click();

    }

    @Test(enabled = true)
    public void Test7() {
        Elements elements = new Elements();
        elements.courses.click();
        elements.sdet.click();
        Assert.assertTrue(elements.text.isDisplayed());


    }


    @Test(enabled = true)
    public void Test8() {
        Elements elements = new Elements();

        elements.bilgiAlin.click();
        Actions actions = new Actions(driver);
        actions.scrollToElement(elements.gonder);


        elements.okudumKabulEdiyorum.click();

        String orjinalWindow = driver.getWindowHandle();


        Set<String> allwindow = driver.getWindowHandles();

        for (String windowHandle : allwindow) {
            if (!windowHandle.equals(orjinalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
            elements.campusLogin.click();
            Assert.assertTrue(elements.kullanimSartlariGoruntulenme.isDisplayed());


        }
    }

}








