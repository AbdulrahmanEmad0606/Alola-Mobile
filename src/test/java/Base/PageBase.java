package Base;

import example.stepDefs.Hooks;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PageBase {

    public static final long WAIT = 160;
    AndroidTouchAction actions;

    public PageBase() {
        //used to decorate/initiate each mobile element directly as a “MobileElement” variable.
        // available for java 11 not supported in java18
        PageFactory.initElements(new AppiumFieldDecorator(Hooks.driver), this);
    }
    public void waitFor() {
        Hooks.driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    }
    public void waitForVisibility(MobileElement element) {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForVisibilityOfText(MobileElement element,String text) {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, 20);
        wait.until(ExpectedConditions.textToBePresentInElement(element,text));
    }
    public void clickOnElement(MobileElement element) {
        try {
            if (element.isEnabled() && element.isDisplayed()) {
                waitForVisibility(element);
                element.click();
            }
            else {
                System.out.println("Unable to click on element");
            }
        }
        catch (Exception e){
            System.out.println("Unable to click on element "+ e.getStackTrace());
        }

    }

    public void sendText(MobileElement element, String text) {
        waitForVisibility(element);
        element.sendKeys(text);
    }

    public String getAttribute(MobileElement element, String attribute) {
        waitForVisibility(element);
        return element.getAttribute(attribute);
    }

    public void scrollDownHomePage() {
        List<AndroidElement> els = Hooks.driver.findElements(By.id("com.youxel.check_plus:id/itemActivityParent"));
        AndroidElement el = els.get(3);
        actions = new AndroidTouchAction(Hooks.driver)
                .press(ElementOption.element(els.get(3)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(6)))
                .moveTo(ElementOption.element(els.get(0)))
                .release()
                .perform();
        System.out.println("Hello");
    }
    public void scrollDownHomeSection() {
        AndroidElement toElement = (AndroidElement)Hooks.driver.findElement(By.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
        AndroidElement fromElement = (AndroidElement)Hooks.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]"));

        actions = new AndroidTouchAction(Hooks.driver)
                .press(ElementOption.element(fromElement))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(ElementOption.element(toElement))
                .release()
                .perform();
        System.out.println("Hello");
    }
}
