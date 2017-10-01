package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void createLog() {
        Logger.getInstance().log("First Log");
    }

    @Test
    public void getLastLogTest() {
        //Given
        //When
        String checkLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals(checkLog, "First Log");
    }
}
