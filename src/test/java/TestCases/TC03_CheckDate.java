package TestCases;

import io.appium.java_client.TouchAction;
import org.example.pages.*;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC03_CheckDate extends TestBases{

    P01_HomePage homePage;
    P02_ViewsPage viewsPage;
    P03_DateWidgets dateWidgets;
    P04_InlinePage inlinePage;

    P06_Dialog dialog;

    TouchAction touchAction;
    @Test(priority = 2)
    public void TC002_checkDate() throws InterruptedException {
        homePage = new P01_HomePage(driver);
        viewsPage = new P02_ViewsPage(driver);
        dateWidgets = new P03_DateWidgets(driver);
        dialog = new P06_Dialog(driver);

        // TODO: Step 1: click Views in homepage
        homePage.viewsbutton.click();
        // TODO: Step2: click datawidget in views page
        viewsPage.DateWidgetsbutton.click();
        // TODO: Step3: click Dialog in Datawidget page
        dateWidgets.Dialogbutton.click();
        // TODO: Step4: click ChangeTheDate
        dialog.ChangeDate.click();
        //wait
        Thread.sleep(4000);
        //moth change
        dialog.nextmonth.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dialog.march.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dialog.okbutton.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


    }
}
