package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P02_ViewsPage {

    public P02_ViewsPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Date Widgets\"]")
    public WebElement DateWidgetsbutton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Drag and Drop\"]")
    public WebElement DragandDrop;
}
