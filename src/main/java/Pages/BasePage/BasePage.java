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

    public void clickOnElementsButton(){
        elementsButton.click();
    }
}
