package Pages.BasePage;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class BasePage {

    public BasePage(String url){
        Selenide.open(url);
    }
    private static final SelenideElement elementsButton = $x("//div[@class='card mt-4 top-card']//h5[contains(text(), 'Elements')]");
    public static final SelenideElement elementsPageHeaderText = $x("//div[@class='main-header']");
    public static final SelenideElement formsButton = $x("//div[@class='card-body']//h5[contains(text(), 'Forms')]");
    public static final SelenideElement formsPageHeaderText = $x("//div[@class='main-header']");
    private static final SelenideElement widgetsButton = $x("//div[@class='card-body']//h5[contains(text(),'Widgets')]");
    private static final SelenideElement widgetsPageHeaderText = $x("//div[@class='main-header']");
    private static final SelenideElement alertsFWButton = $x("//div[@class='card-body']//h5[contains(text(), 'Alerts, Frame & Windows')]");
    private static final SelenideElement alertsFWPageHeaderText = $x("//div[@class='main-header']");
    private static final SelenideElement interactionsButton = $x("//div[@class='card-body']//h5[contains(text(),'Interactions')]");
    private static final SelenideElement interactionsPageHeaderText = $x("//div[@class='main-header']");
    private static final SelenideElement bookStoreAppButton = $x("//div[@class='card-body']//h5[contains(text(),'Book Store Application')]");
    private static final SelenideElement bookStoreAppPageHeaderText = $x("//div[@class='main-header']");


    public SelenideElement getElementsPageHeaderText(){
        return elementsPageHeaderText;
    }

    public  SelenideElement getFormsPageHeaderText(){
        return formsPageHeaderText;
    }

    public SelenideElement getWidgetsPageHeaderText(){
        return widgetsPageHeaderText;
    }

    public SelenideElement getAlertsFWPageHeaderText(){
        return alertsFWPageHeaderText;
    }

    public SelenideElement getInteractionsPageHeaderText(){
        return interactionsPageHeaderText;
    }

    public SelenideElement getBookStoreAppPageHeaderText(){
        return bookStoreAppPageHeaderText;
    }




    public void clickOnElementsButton(){elementsButton.click();}
    public void clickOnFormsButton(){formsButton.click();}
    public void clickOnWidgetsButton(){widgetsButton.click();}
    public void clickOnAlertsFWButton(){alertsFWButton.click();}
    public void clickOnInteractionsButton(){interactionsButton.click();}
    public void clickOnBookStoreAppButton(){bookStoreAppButton.scrollTo().click();}
}
