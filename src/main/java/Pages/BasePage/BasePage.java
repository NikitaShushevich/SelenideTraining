package Pages.BasePage;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BasePage {

    public BasePage(String url){
        Selenide.open(url);
    }
    public final SelenideElement elementsButton = $x("//div[@class='card mt-4 top-card']//h5[contains(text(), 'Elements')]");
    public final SelenideElement elementsPageHeaderText = $x("//div[@class='main-header']");
    public final SelenideElement formsButton = $x("//div[@class='card-body']//h5[contains(text(), 'Forms')]");
    public final SelenideElement formsPageHeaderText = $x("//div[@class='main-header']");
    public final SelenideElement widgetsButton = $x("//div[@class='card-body']//h5[contains(text(),'Widgets')]");
    public final SelenideElement widgetsPageHeaderText = $x("//div[@class='main-header']");
    public final SelenideElement alertsFWButton = $x("//div[@class='card-body']//h5[contains(text(), 'Alerts, Frame & Windows')]");
    public final SelenideElement alertsFWPageHeaderText = $x("//div[@class='main-header']");
    public final SelenideElement interactionsButton = $x("//div[@class='card-body']//h5[contains(text(),'Interactions')]");
    public final SelenideElement interactionsPageHeaderText = $x("//div[@class='main-header']");
    public final SelenideElement bookStoreAppButton = $x("//div[@class='card-body']//h5[contains(text(),'Book Store Application')]");
    public final SelenideElement bookStoreAppPageHeaderText = $x("//div[@class='main-header']");






    public void clickOnElementsButton(){
        elementsButton.click();
    }
    public void clickOnFormsButton(){formsButton.click();}
    public void clickOnWidgetsButton(){widgetsButton.click();}
    public void clickOnAlertsFWButton(){alertsFWButton.click();}
    public void clickOnInteractionsButton(){interactionsButton.click();}
    public void clickOnBookStoreAppButton(){bookStoreAppButton.scrollTo().click();}
}
