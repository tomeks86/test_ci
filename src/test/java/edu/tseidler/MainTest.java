package edu.tseidler;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MainTest {
    private Main main = new Main();

    @DataProvider
    private static Object[][] dataForAddition() {
        return new Object[][]{
                {1, 1, 2},
                {2, 5, 7},
                {2, -5, -3},
        };
    }

    @Test(dataProvider = "dataForAddition")
    public void shouldAddNumbers(int a, int b, int sum) {
        Assert.assertEquals(main.add(a, b), sum);
    }
}
