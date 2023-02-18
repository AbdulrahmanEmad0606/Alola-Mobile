package Base;

import example.stepDefs.Hooks;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class Utils extends PageBase{
    //get submit button
    public void submitForm() throws InterruptedException {
        AndroidElement submitBtn = (AndroidElement) Hooks.driver.findElement(By.id("com.youxel.check_plus:id/next_btn"));
        submitBtn.click();
        Thread.sleep(4000);
    }
    //Navigate to the saved events
    public void navigateToSavedEvent() throws InterruptedException {
        AndroidElement sideIcon = (AndroidElement) Hooks.driver.findElementById("com.youxel.check_plus:id/dashboardMenuConstraintLayout");
        sideIcon.click();

        // get the record element
        AndroidElement recordElement = (AndroidElement) Hooks.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]");
        recordElement.click();
        Thread.sleep(2000);

        // get the saved events button
        AndroidElement savedEvents = (AndroidElement) Hooks.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
        savedEvents.click();

        // get the first saved element
        AndroidElement firstSavedElement = (AndroidElement) Hooks.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.view.ViewGroup/android.view.ViewGroup[2]");
        firstSavedElement.click();
        Thread.sleep(2000);
    }

// get the save button
    public AndroidElement getSaveBtn() {
        return (AndroidElement) Hooks.driver.findElementById("com.youxel.check_plus:id/save_tv");
    }
    //submit the saved form
    public void submitSavedForm() throws InterruptedException {
        AndroidElement submitBtn = (AndroidElement) Hooks.driver.findElement(By.id("com.youxel.check_plus:id/submit_btn"));
        submitBtn.click();
        Thread.sleep(3000);
    }
}
