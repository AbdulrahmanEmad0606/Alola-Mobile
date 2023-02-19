package example.Screens.Forms;
import Base.PageBase;
import example.stepDefs.Hooks;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
public class S01_ScanningForm extends PageBase {
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    AndroidElement firstQuestion;
    public void fillForm() throws InterruptedException {
        waitForVisibility(firstQuestion);
        clickOnElement((AndroidElement)Hooks.driver.findElement(By.xpath("//android.view.ViewGroup[1]/android.widget.RadioGroup/android.widget.RadioButton[2]")));
        Thread.sleep(1000);
        AndroidElement secondQuestionLabel = (AndroidElement) Hooks.driver.findElement(By.xpath("//android.view.ViewGroup[2]/android.widget.TextView"));
        System.out.println(secondQuestionLabel.getText());
        AndroidElement secondQuestion = (AndroidElement) Hooks.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.RadioGroup/android.widget.RadioButton[1]"));
        clickOnElement(secondQuestion);
        Thread.sleep(2000);
        AndroidElement thirdQuestion = (AndroidElement) Hooks.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.RadioGroup/android.widget.RadioButton[2]"));
        clickOnElement(thirdQuestion);
        AndroidElement nameOnTheBoard=(AndroidElement) Hooks.driver.findElement(By.id("com.youxel.check_plus:id/text_box_et_clickable"));
        clickOnElement(nameOnTheBoard);
        nameOnTheBoard.sendKeys("Test Name");
        Hooks.driver.hideKeyboard();
       clickOnElement((AndroidElement)Hooks.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.TextView")));
        waitFor();
        clickOnElement((AndroidElement)Hooks.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.CheckBox[1]")));
        scrollDownHomeSection();
        clickOnElement((AndroidElement)Hooks.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.TextView")));
        AndroidElement map = (AndroidElement) Hooks.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout[2]"));
        Thread.sleep(3000);
        clickOnElement(map);
        Thread.sleep(3000);
        clickOnElement((AndroidElement)Hooks.driver.findElement(By.id("com.youxel.check_plus:id/btn")));
        clickOnElement((AndroidElement)Hooks.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.ImageView[2]")));
        clickOnElement((AndroidElement)Hooks.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")));
        clickOnElement((AndroidElement)Hooks.driver.findElement(By.id("com.google.android.documentsui:id/icon_thumb")));
        clickOnElement((AndroidElement)Hooks.driver.findElement(By.id("com.youxel.check_plus:id/save_btn")));
    }
}
