package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P05_DragandDrop {

    public P05_DragandDrop(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_1")
    public WebElement Firstposition;

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_2")
    public WebElement Secondposition;


}

