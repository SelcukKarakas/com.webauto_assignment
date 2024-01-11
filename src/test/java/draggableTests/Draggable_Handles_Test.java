package draggableTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

public class Draggable_Handles_Test extends Hooks {
    @Test
    void testingDraggableByHandles() throws InterruptedException {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnDraggableLink();
        pages.getWebAutomationPage().clickOnHandlesLink();
        Thread.sleep(2000);
       // pages.getHandlesPage().dragCanDragHandle(350,150); // bigTicket
        pages.getHandlesPage().dragBoxWithBigBox(350,150); // bigTicket
//        //Thread.sleep(2000);
//        pages.getHandlesPage().dragBoxWithSmallBox(350,150);
//        Thread.sleep(2000);
//        System.out.println(pages.getHandlesPage().widthOfBoxWithSmallBox());
//        System.out.println(pages.getHandlesPage().heightOfBoxWithSmallBox());


    }
}
