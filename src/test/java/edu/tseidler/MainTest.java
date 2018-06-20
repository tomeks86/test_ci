package edu.tseidler;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void passingTest() {
        Assert.assertTrue(true, "this is supposed to fail");
    }

    @Test
    public void passingTest2() {
        Assert.assertTrue(false , "this is supposed to fail");
    }

}
