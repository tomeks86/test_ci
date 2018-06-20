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

    @DataProvider
    private static Object[][] dataForSubtraction() {
        return new Object[][]{
                {1, 1, 0},
                {2, 5, -3},
                {2, -5, 7},
        };
    }

    @Test(dataProvider = "dataForSubtraction")
    public void shouldSubtractNumbers(int a, int b, int difference) {
        Assert.assertEquals(main.subtract(a, b), difference);
    }

    @DataProvider
    private static Object[][] dataForMultiplication() {
        return new Object[][]{
                {1, 1, 1},
                {2, 5, 10},
                {2, -5, -11},
        };
    }

    @Test(dataProvider = "dataForMultiplication")
    public void shouldMultiplyNumbers(int a, int b, int product) {
        Assert.assertEquals(main.multiply(a, b), product);
    }
}
