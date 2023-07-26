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
    @Test
    public void testFormsBtn(){
        BasePage basePage = new BasePage(BASE_URL);
        basePage.clickOnFormsButton();
        Assert.assertEquals(basePage.formsPageHeaderText.getText(), "Forms");
    }

    @Test
    public void testWidgetsBtn(){
        BasePage basePage = new BasePage(BASE_URL);
        basePage.clickOnWidgetsButton();
        Assert.assertEquals(basePage.widgetsPageHeaderText.getText(), "Widgets");
    }

    @Test
    public void testAlertsFWBtn(){
        BasePage basePage = new BasePage(BASE_URL);
        basePage.clickOnAlertsFWButton();
        Assert.assertEquals(basePage.alertsFWPageHeaderText.getText(), "Alerts, Frame & Windows");
    }

    @Test
    public void testInteractionsBtn(){
        BasePage basePage = new BasePage(BASE_URL);
        basePage.clickOnInteractionsButton();
        Assert.assertEquals(basePage.interactionsPageHeaderText.getText(), "Interactions");
    }
    @Test
    public void testBoolStoreAppBtn(){
        BasePage basePage = new BasePage(BASE_URL);
        basePage.clickOnBookStoreAppButton();
        Assert.assertEquals(basePage.bookStoreAppPageHeaderText.getText(), "Book Store");
    }

}
