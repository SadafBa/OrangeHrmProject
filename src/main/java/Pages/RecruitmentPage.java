package Pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RecruitmentPage {

    @FindBy(css = "div[role='option']>span") private List<WebElement> options;
    WebDriver driver = Browser.driver;

    public RecruitmentPage selectOPtionfromDropDown(String textOption){
      List<WebElement> elements =  driver.findElements(By.className("oxd-select-text--after"));
      elements.get(0).click();

      for (WebElement element: options){
          System.out.println(element.getText());
          if (element.getText().equals(textOption)){
              element.click();
              break;
          }
      }
      return this;
    }

}
