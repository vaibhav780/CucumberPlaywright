package Pages;

import com.microsoft.playwright.Page;

public class Admin {
    Page page;

    String addbtn="//*[@class=\"orangehrm-header-container\"]/button";

    public Admin(Page page) {
        this.page = page;
    }

    public void Click_add(){
    page.click(addbtn);
    }
}
