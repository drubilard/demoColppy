package Test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import Page.googlePage;

public class BaseTest {
    protected static googlePage page;

    @BeforeAll
    public static void setUp() {
        page = new googlePage();
        page.get();
        page.getdriver().manage().window().maximize();
    }

    @AfterAll
    public static void tearnDown() {
        // page.getdriver().quit();
    }

}
