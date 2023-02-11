package example.Page;

import Base.PageBase;
import example.stepDefs.Hooks;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.util.List;

public class P02_Homepage extends PageBase {
    // get Show all button
    AndroidTouchAction actions;
    @AndroidFindBy(id = "viewAllTextView")
    MobileElement viewAll;

    public void expandAllActivities() {
        waitForVisibility(viewAll);
        viewAll.click();
    }



    public void scrollTo() {
        scrollDown();
    }

    public void clickOnActivity(int activityNumber) {
        List<AndroidElement> els=Hooks.driver.findElements(By.id("com.youxel.check_plus:id/itemActivityParent"));
        els.get(activityNumber).click();
    }


}
