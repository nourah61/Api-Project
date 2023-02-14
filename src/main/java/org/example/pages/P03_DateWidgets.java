package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P03_DateWidgets {

    public P03_DateWidgets(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"2. Inline\"]")
    public WebElement Inlinebutton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"1. Dialog\"]")
    public WebElement Dialogbutton;
}
