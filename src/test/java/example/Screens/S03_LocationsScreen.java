package example.Screens;

import Base.PageBase;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class S03_LocationsScreen extends PageBase {
    // get Show all button
    AndroidTouchAction actions;
    @AndroidFindBy(id = "com.youxel.check_plus:id/save_tv")
    AndroidElement skipButton;
    public void clickSkip() {
        skipButton.click();
    }
}
