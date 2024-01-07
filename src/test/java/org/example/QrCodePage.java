package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QrCodePage {

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div/div/span")
    private WebElement text;

    public WebDriver driver;

    public QrCodePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getText() {
        return text.getText();
    }
}
