package TestCases;

import io.appium.java_client.TouchAction;
import org.example.pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class TC02_CheckDragandDrop extends TestBases {
    P01_HomePage homePage;
    P02_ViewsPage viewsPage;
    TouchAction touchAction;

    P05_DragandDrop dragandDrop;

    @Test(priority = 3)
    public void TC003_checkDragandDrop() throws InterruptedException {
        homePage = new P01_HomePage(driver);
        viewsPage = new P02_ViewsPage(driver);

        touchAction = new TouchAction<>(driver);
        dragandDrop = new P05_DragandDrop(driver);

        // TODO: Step 1: click Views in homepage
        homePage.viewsbutton.click();
        // TODO: Step2: click drag and drop in views page
        viewsPage.DragandDrop.click();

        // take screen shot
        PageBases.captureScreenshot(driver, "before drag");

        // TODO: Step3: Drag the pall from fisrt position to second position
        touchAction.longPress(longPressOptions().withElement(element(dragandDrop.Firstposition)).withDuration(ofSeconds(2))).moveTo(element(dragandDrop.Secondposition)).release().perform();

        // take screen shot
        PageBases.captureScreenshot(driver, "After drop");
        Thread.sleep(2000);
        //Assert
        Assert.assertEquals("Dropped!", driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText());

    }


}
