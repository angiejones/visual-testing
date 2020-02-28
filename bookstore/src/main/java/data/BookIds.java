package data;

import org.openqa.selenium.By;

public enum BookIds {
    ALL_BOOKS("productList"),
    AGILE_TESTING("pid3");

    String id;
    BookIds(String id){
        this.id = id;
    }

    public By getLocator(){
        return By.id(id);
    }
}