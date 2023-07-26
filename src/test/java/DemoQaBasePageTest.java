import Pages.BasePage.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoQaBasePageTest extends BaseTest {

    private final static String BASE_URL = "https://demoqa.com";

    @Test
    public void testElementsBtn() {
        BasePage basePage = new BasePage(BASE_URL);
        basePage.clickOnElementsButton();
        Assert.assertEquals(basePage.elementsPageHeaderText.getText(), "Elements");
    }

}
