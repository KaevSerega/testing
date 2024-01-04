package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QrCodePage {
    public WebDriver driver;
    public QrCodePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div/div/span")
    private WebElement text;
    public String getText() {
        return text.getText();
    }

}
