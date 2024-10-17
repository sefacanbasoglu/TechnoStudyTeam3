package main;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Elements01 extends BaseDriver {
    public Elements01() {
        PageFactory.initElements(BaseDriver.driver,this);
    }



}


