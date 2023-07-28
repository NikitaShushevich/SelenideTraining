import Pages.BasePage.BasePage;
import com.codeborne.selenide.ElementsCollection;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoQaBasePageTest extends BaseTest {

    private final static String BASE_URL = "https://demoqa.com";

    @Test
    public void testElementsBtn() {
        BasePage basePage = new BasePage(BASE_URL);
        basePage.clickOnElementsButton();
        Assert.assertEquals(basePage.getElementsPageHeaderText().getText(), "Elements");
    }
    @Test
    public void testFormsBtn(){
        BasePage basePage = new BasePage(BASE_URL);
        basePage.clickOnFormsButton();
        Assert.assertEquals(basePage.getFormsPageHeaderText().getText(), "Forms");
    }

    @Test
    public void testWidgetsBtn(){
        BasePage basePage = new BasePage(BASE_URL);
        basePage.clickOnWidgetsButton();
        Assert.assertEquals(basePage.getWidgetsPageHeaderText().getText(), "Widgets");
    }

    @Test
    public void testAlertsFWBtn(){
        BasePage basePage = new BasePage(BASE_URL);
        basePage.clickOnAlertsFWButton();
        Assert.assertEquals(basePage.getAlertsFWPageHeaderText().getText(), "Alerts, Frame & Windows");
    }

    @Test
    public void testInteractionsBtn(){
        BasePage basePage = new BasePage(BASE_URL);
        basePage.clickOnInteractionsButton();
        Assert.assertEquals(basePage.getInteractionsPageHeaderText().getText(), "Interactions");
    }
    @Test
    public void testBoolStoreAppBtn(){
        BasePage basePage = new BasePage(BASE_URL);
        basePage.clickOnBookStoreAppButton();
        Assert.assertEquals(basePage.getBookStoreAppPageHeaderText().getText(), "Book Store");
    }
    @Test
    public void checkFooterText(){
        BasePage basePage = new BasePage(BASE_URL);
        Assert.assertEquals(basePage.getBasePageFooterText().getText(), "© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED.");
    }

    @Test
    public void numberOfElementsCheck(){
        BasePage basePage = new BasePage(BASE_URL);
        basePage.clickOnBookStoreAppButton();
        ElementsCollection booksListItems = basePage.getListOfBooks();
        System.out.println(booksListItems.size());
        Assert.assertEquals(booksListItems.size(), 8);
        }



    }



