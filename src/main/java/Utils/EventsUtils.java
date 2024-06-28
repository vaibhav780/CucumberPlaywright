package Utils;

import com.microsoft.playwright.Page;

public class EventsUtils {
    Page page;

    public EventsUtils(Page page) {
        this.page = page;
    }

    public String getTitle(){
        return page.title();
    }
}
