package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P06_Dialog {
    public P06_Dialog(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"change the date\"]")
    public WebElement ChangeDate;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Next month\"]")
    public WebElement nextmonth;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"15 March 2023\"]")
    public WebElement march;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
    public WebElement okbutton;
}
