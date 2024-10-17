package main;

import Utlity.BaseDriver;


public class TechnoStudy extends BaseDriver {
  Elements01 elements=new Elements01();

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

      Assert.assertTrue(elements.coursesList.get(i).isEnabled(), "Kurs sayfası açılmadı : "+ elements.coursesList.get(i).getText());

    }


  }
    }








