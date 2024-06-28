package Pages;

import com.microsoft.playwright.Page;

public class LoginPage {
    Page page;

    String loginHead ="//h5";
    String username = "//*[@name=\"username\"]";
    String password ="//*[@name=\"password\"]";
    String logingbtn = "//button";
    public LoginPage(Page page) {
        this.page = page;
    }


     public String getPageHead(){
        return page.locator(loginHead).textContent();
     }
    public void fillusername(String uname){
        page.fill(username,uname);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void fillpassword(String pass){
        page.fill(password,pass);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void doLogin(String username, String password){
        fillusername(username);
        fillpassword(password);
        page.click(logingbtn);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
