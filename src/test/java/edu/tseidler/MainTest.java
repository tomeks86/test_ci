package edu.tseidler;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void failingTest() {
        Assert.assertTrue(true, "this is supposed to fail");
    }

}
