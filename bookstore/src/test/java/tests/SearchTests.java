package tests;

import static org.junit.Assert.*;

import com.applitools.eyes.MatchLevel;
import data.BookIds;
import models.Book;
import org.junit.Test;
import base.BaseTests;
import pages.SearchPage;

import java.util.List;

public class SearchTests extends BaseTests {

//    @Test // Functional Testing
//    public void searchByFullTitle(){
//        String title = "Agile Testing";
//        page.search(title);
//        assertTrue(page.isBookVisible(title));
//        assertEquals(1, page.getNumberOfVisibleBooks());
//    }


    @Test //Visual Testing - full page
    public void searchByFullTitle(){
        page.search("Agile Testing");
        validateWindow();
    }

    @Test //Visual Testing - just element
    public void searchByFullTitle_Element(){
        page.search("Agile Testing");
        validateElement(BookIds.AGILE_TESTING.getLocator());
    }

//    @Test // functional testing
//    public void searchByPartialTitle(){
//        page.search("Test");
//
//        var expectedBooks = List.of(
//                "Test Automation in the Real World",
//                "Experiences of Test Automation",
//                "Agile Testing",
//                "How Google Tests Software",
//                "Java For Testers"
//        );
//
//        expectedBooks.forEach(b->page.isBookVisible(b));
//        assertEquals(expectedBooks.size(), page.getNumberOfVisibleBooks());
//    }

    @Test // Visual Testing
    public void searchByPartialTitle(){
        page.search("Test");
        validateWindow();
    }
    
    @Test // Visual Testing - Dynamic Content
    public void dynamicContent(){
        eyes.setMatchLevel(MatchLevel.LAYOUT);
        validateWindow();
    }
}