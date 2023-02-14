package TestCases;

import io.appium.java_client.TouchAction;
import org.example.pages.*;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//import touchactions libraries
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
//import time library
import static java.time.Duration.ofSeconds;



public class TC01_CheckSwipe extends TestBases{

    P01_HomePage homePage;
    P02_ViewsPage viewsPage;
    P03_DateWidgets dateWidgets;
    P04_InlinePage inlinePage;

    P06_Dialog dialog;
    TouchAction touchAction;

    @Test (priority = 1)
    public void TC001_checkSwipe() throws InterruptedException {
        homePage = new P01_HomePage(driver);
        viewsPage = new P02_ViewsPage(driver);
        dateWidgets = new P03_DateWidgets(driver);
        inlinePage = new P04_InlinePage(driver);
        touchAction = new TouchAction<>(driver);

        // TODO: Step 1: click Views in homepage
        homePage.viewsbutton.click();
        // TODO: Step2: click datawidget in views page
        viewsPage.DateWidgetsbutton.click();
        // TODO: Step3: click inline in Datawidget page
        dateWidgets.Inlinebutton.click();

        // take screen shot
        PageBases.captureScreenshot(driver,"before");
        Thread.sleep(2000);

        // TODO step4: move clock from 12 to 3

        touchAction.longPress(longPressOptions().withElement(element(inlinePage.Firstposition)).withDuration(ofSeconds(2))).moveTo(element(inlinePage.Secondposition)).release().perform();
        Thread.sleep(5000);

        // take screen shot
        PageBases.captureScreenshot(driver,"After");

        //Assert if the time successfully
         Assert.assertEquals("15", inlinePage.ChecktheTime.getAttribute("content-desc"));


        Thread.sleep(2000);
        // TODO step4: move clock from 3 to 3:30
       touchAction.longPress(longPressOptions().withElement(element(inlinePage.ChecktheTime)).withDuration(ofSeconds(2))).moveTo(element(inlinePage.Thirdposition)).release().perform();
        Thread.sleep(2000);



    }





}
