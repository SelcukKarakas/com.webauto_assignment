package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;


public class Handles_Page extends BasePage {
    @FindBy(css = "#draggable13>p")
    private WebElement canDragHandle;
    @FindBy(xpath = "//p[contains(text(),'but you')]")
    private WebElement canNotDragHandle;
    @FindBy(css = "#draggable13")
    private WebElement boxWithBigBox;
    @FindBy(id = "draggable14")
    private WebElement boxWithSmallBox;
    @FindBy(xpath = "//div[@xpath='1']")
    private WebElement outerFrame;

    public Handles_Page() {
        super();
    }

    public void dragCanDragHandle(int xOffset, int yOffset) {
        actions.moveToElement(canDragHandle).dragAndDropBy(canDragHandle, xOffset, yOffset).build().perform();

    }

    public void dragBoxWithSmallBox(int xOffset, int yOffset) {
        actions.moveToElement(boxWithSmallBox, 0, -80).dragAndDropBy(boxWithSmallBox, xOffset, yOffset).build().perform();

    }
    public void dragBoxWithBigBox(int xOffset, int yOffset) {
        actions.moveToElement(canDragHandle,0,0).dragAndDropBy(boxWithBigBox, xOffset, yOffset).build().perform();

    }
    public int widthOfBoxWithSmallBox(){
        return canDragHandle.getSize().width;
    }
    public int heightOfBoxWithSmallBox(){
        return canDragHandle.getSize().height;
    }

}
