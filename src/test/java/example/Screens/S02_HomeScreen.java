package example.Screens;

import Base.PageBase;
import example.stepDefs.Hooks;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.util.List;

public class S02_HomeScreen extends PageBase {
    AndroidTouchAction actions;
    @AndroidFindBy(id = "viewAllTextView")
    MobileElement viewAll;
    public void expandAllActivities() {
        waitForVisibility(viewAll);
        viewAll.click();
    }
    public void clickOnActivity(int activityNumber) {
        List<AndroidElement> els = Hooks.driver.findElements(By.id("com.youxel.check_plus:id/itemActivityParent"));
        els.get(activityNumber).click();
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    AndroidElement schedule;
    public void selectSchedule() {
        schedule.click();
    }
}
