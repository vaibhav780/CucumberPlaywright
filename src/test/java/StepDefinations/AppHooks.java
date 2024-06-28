package StepDefinations;

import Factory.PlaywrightFactory;
import Utils.ComLogger;
import com.microsoft.playwright.*;
import io.cucumber.java.Before;

public class AppHooks  extends PlaywrightFactory {
    public PlaywrightFactory playwrightFactory;
    public   Page page;


    @Before
    public void setup(){
        playwrightFactory = new PlaywrightFactory();
        page = playwrightFactory.initbrowser();
        page.navigate("https://opensource-demo.orangehrmlive.com");
        ComLogger.info( "In Hooks");
    }




    public void teardown(){
        page.context().browser().close();
        ComLogger.info("Page Driver Closed");
    }
}
