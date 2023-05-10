package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[text()='Products']")
    WebElement productText;

//    @CacheLookup
//    @FindBy(xpath = "//div[@class='inventory_item_name']")
//    WebElement countProduct;


    public String getProductText() {
        return getTextFromElement(productText);
    }
//
//    public int totalProductsOnPage() {
//        return countProductOnThePage(countProduct);

        @CacheLookup
        @FindBy(className = "inventory_item")
        List<WebElement> productsCount;

        public int getActualNumberOfProducts() {
            List<WebElement> productCount = productsCount;
            return productCount.size();
        }

    }

