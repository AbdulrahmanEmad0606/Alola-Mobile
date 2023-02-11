package example.Page;

import Base.PageBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class P01_Login extends PageBase {



    // Get username field and clear
    @AndroidFindBy(id = "et_user_name")
    MobileElement userName;
    // clear and set Username
    public void setUserName(String userNameText){
        clear(userName);
        sendText(userName,userNameText);
    }
    // Get password field and clear
    @AndroidFindBy(id = "et_password")
    MobileElement password;


    // clear and set Password
    public void setPassword(String passwordTxt){
        clear(password);
        sendText(password,passwordTxt);
    }
    //get login button
    @AndroidFindBy(id = "sign_on_btn")
    MobileElement loginBtn;
    // click on login button
    public void clickLogin(){
       loginBtn.click();
    }
}
