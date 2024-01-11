package alertsTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class ShowConfirm_Test extends Hooks {

    @Test
    void testShowConfirm() throws InterruptedException {

        // Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();
        // Click on the Alerts Link
        pages.getWebAutomationPage().clickOnAlertsLink();

        BrowserUtils.scrollUpWithPageUp();

        // Click on the Show Confirm Link
        pages.getWebAutomationPage().clickOnShowConfirmLink();
        Thread.sleep(3000);




    }
}
