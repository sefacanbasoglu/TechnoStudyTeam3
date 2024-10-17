package main;

import Utlity.BaseDriver;


public class TechnoStudy extends BaseDriver {
  Elements01 elements=new Elements01();
  public void Test_US_1() {

    Elements01 elements = new Elements01();

    // wait.until(ExpectedConditions.elementToBeClickable(elements.courses)).click();


    for (int i = 0; i < elements.coursesList.size(); i++) {
      wait.until(ExpectedConditions.elementToBeClickable(elements.courses)).click();
      wait.until(ExpectedConditions.elementToBeClickable(elements.coursesList.get(i))).click();
      Assert.assertTrue(elements.coursesList.get(i).isEnabled(), "Kurs bulunamadi");
    }
  }

  @Test(enabled = false)
  public void Test2() {
    Elements elements = new Elements();
    wait.until(ExpectedConditions.elementToBeClickable(elements.campusLogin)).click();
    Assert.assertTrue(elements.loginButton.isDisplayed());

  }

    }








