package Main;

import Utility.BaseDriverParametres;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class Elements {
    public Elements() {

        PageFactory.initElements(BaseDriverParametres.driver, this);
    }

    @FindBy(xpath = "(//*[text()='Kurslar'])[1]")
    public WebElement courses;

    @FindBy(xpath = "//*[text()='SDET-Yazılım Test Uzmanı']")
    public WebElement sdet;

    @FindBy(css = "[class='t978__link-inner t978__link-inner_left']")
    public List<WebElement> coursesList;

    @FindBy(xpath = "(//a[@data-buttonfieldset='button2'])[1]")
    public WebElement campusLogin;

    @FindBy(css = "[class='mdc-button__label']")
    public WebElement loginButton;

    @FindBy(css = "[class='tn-atom js-click-zero-stat']")
    public WebElement basvur;

    @FindBy(css = "[aria-label='name']")
    public WebElement nameSurnameInput;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(id = "input_1661174990146")
    public WebElement phoneNumberInput;

    @FindBy(css = "[name='Input']")
    public WebElement age;

    @FindBy(css = "[name='Input_2']")
    public WebElement job;

    @FindBy(css = "[id='sb-1667664755026']")
    public WebElement egitimDurumu;

    @FindBy(css = "[name='country_2']")
    public WebElement ulke;


    @FindBy(css = "[name='course']")
    public WebElement kurs;

    @FindBy(css = "[name='survey']")
    public WebElement biziNeredenDuydun;

    @FindBy(css = "[name='promo code']")
    public WebElement promo;

    @FindBy(css = "[class='t-checkbox__indicator']")
    public WebElement okudumKabulEdiyorumTk;

    @FindBy(xpath = "(//a[@href='https://techno.study/tr/terms'])[1]")
    public WebElement okudumKabulEdiyorum;

    @FindBy(css = "[class='t-submit']")
    public WebElement gonder;

    @FindBy(css = "[class='t-form-success-popup__wrapper']")
    public WebElement success;


    @FindBy(css = "[alt='TechnoStudy']")
    public WebElement logo;

    @FindBy(xpath = "(//a[@class='t-btn t-btn_md js-click-stat'])[1]")
    public WebElement bilgiAlin;

    @FindBy(css = "[field='title']")
    public WebElement kullanimSartlariGoruntulenme;

    @FindBy(xpath = "//a[text()='Detaylı bilgi']")
    public WebElement detayliBilgi;

    @FindBy(linkText = "[text()='Kursuna Giriş']")
    public WebElement text;

    @FindBy(xpath = "//a[contains(@href, 'facebook')]")
    public WebElement facebookIcon;

    @FindBy(xpath = "//a[contains(@href, 'instagram')]")
    public WebElement instagramIcon;

    @FindBy(xpath = "//a[contains(@href, 'youtube')]")
    public WebElement youtubeIcon;

    @FindBy(xpath = "//a[contains(@href, 'linkedin')]")
    public WebElement linkedlnIcon;

    @FindBy(xpath = "//span[text()='Yeni hesap oluştur']")
    public WebElement yenihasap;


//    @FindBy(css = "[aria-label='name']")
//    public WebElement nameSurnameInput;
//
//    @FindBy(css = "[aria-label='name']")
//    public WebElement nameSurnameInput;


}