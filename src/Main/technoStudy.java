package Main;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class technoStudy extends BaseDriver {

    @Test
    public void Test_US_1() {

        Elements elements = new Elements();

        // wait.until(ExpectedConditions.elementToBeClickable(elements.courses)).click();


        for (int i = 0; i < elements.coursesList.size(); i++) {
            wait.until(ExpectedConditions.elementToBeClickable(elements.courses)).click();
            wait.until(ExpectedConditions.elementToBeClickable(elements.coursesList.get(i))).click();
            Assert.assertTrue(elements.coursesList.get(i).isEnabled(), "Kurs bulunamadi");
        }
    }

    @Test(enabled = false)
    public void Test_US_2() {
        Elements elements = new Elements();
        wait.until(ExpectedConditions.elementToBeClickable(elements.campusLogin)).click();
        Assert.assertTrue(elements.loginButton.isDisplayed());

    }

    @Test(enabled = true)
    public void Test3() {
        Elements elements = new Elements();


        elements.basvur.click();
        elements.nameSurnameInput.sendKeys("testyusuf ucucu");
        elements.email.sendKeys("test_team@gmail.com");
        elements.phoneNumberInput.sendKeys("5212102121");
        elements.age.sendKeys("22");

        elements.job.sendKeys("QA Enginner");


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

    @Test(enabled = true)
    public void Test4() {

        Elements elements = new Elements();

        for (int i = 0; i < elements.coursesList.size(); i++) {
            String getUrl = driver.getCurrentUrl();
            wait.until(ExpectedConditions.elementToBeClickable(elements.courses)).click();

            wait.until(ExpectedConditions.elementToBeClickable(elements.coursesList.get(i))).click();

            Tools.Sleep(3);

            Assert.assertTrue(elements.coursesList.get(i).isEnabled(), "Kurs sayfası açılmadı : " + elements.coursesList.get(i).getText());

        }


    }

    @Test
    public void Test5() {

        //        Test Case 5: Submenu Social Media
//        1. Web sitesinin alt menüsünde "Sosyal Medya" hesaplarına ulaşabileceğim bir alan
//        bulunmalıdır.
//        2. Her sosyal medya hesabının adı ve/veya simgesi görünmelidir.
//        3. İstediğim bir sosyal medya hesabına tıkladığımda, ilgili sosyal medya sayfası veya profil
//        açılmalıdır.

        Elements elements = new Elements();

        Actions actions = new Actions(driver);

        // Facebook
        // WebElement facebookIcon = driver.findElement(By.xpath("//a[contains(@href, 'facebook')]"));
        actions.moveToElement(elements.facebookIcon).perform();

        elements.facebookIcon.click();
        Tools.Sleep(3);

        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(currentUrl.contains("facebook.com"), "Facebook linki doğru açılmadı!");

        // Anasayfaya
        driver.navigate().back();
        Tools.Sleep(3);

        // Instagram
        actions.moveToElement(elements.instagramIcon).perform();

        elements.instagramIcon.click();
        Tools.Sleep(3);

        currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("instagram.com"), "Instagram linki doğru açılmadı!");

        // Anasayfaya
        driver.navigate().back();
        Tools.Sleep(3);

        // LinkedIn
        actions.moveToElement(elements.linkedlnIcon).perform();
        elements.linkedlnIcon.click();
        Tools.Sleep(3);

        currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("linkedin.com"), "LinkedIn linki doğru açılmadı!");

        // Anasayfaya
        driver.navigate().back();
        Tools.Sleep(3);

        //Youtube
        actions.moveToElement(elements.youtubeIcon).perform();
        elements.youtubeIcon.click();
        Tools.Sleep(3);

        currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("youtube.com"), "Youtube linki doğru açılmadı!");

        // Anasayfaya
        driver.navigate().back();
        Tools.Sleep(3);


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
}








