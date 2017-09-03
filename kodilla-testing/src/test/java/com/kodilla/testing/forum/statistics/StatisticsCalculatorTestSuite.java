package com.kodilla.testing.forum.statistics;

import org.junit.*;

import javax.naming.NameNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void firstCalculateAdvStatisticsTest() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<String>();
        for(int i = 0; i<100; i++) {
            usersList.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(statisticsCalculator.getUsersQuantity(), 100);
        Assert.assertEquals(statisticsCalculator.getPostsQuantity(), 1000);
        Assert.assertEquals(statisticsCalculator.getCommentsQuantity(), 100);
        Assert.assertEquals(statisticsCalculator.getUsersPostsAverage(), 10, 0);
        Assert.assertEquals(statisticsCalculator.getUsersCommentsAverage(), 1, 0);
        Assert.assertEquals(statisticsCalculator.getCommentsPerPostAverage(), 0.1, 0);
        statisticsCalculator.showStatistics();
    }

    @Test
    public void secondCalculateAdvStatisticsTest() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCalculator.getUsersQuantity(), 0);
        Assert.assertEquals(statisticsCalculator.getPostsQuantity(), 0);
        Assert.assertEquals(statisticsCalculator.getCommentsQuantity(), 0);
        Assert.assertEquals(statisticsCalculator.getUsersPostsAverage(), Double.NaN, 0);
        Assert.assertEquals(statisticsCalculator.getUsersCommentsAverage(), Double.NaN, 0);
        Assert.assertEquals(statisticsCalculator.getCommentsPerPostAverage(), Double.NaN, 0);
        statisticsCalculator.showStatistics();

    }
    @Test
    public void ThirdCalculateAdvStatisticsTest() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<String>();
        for(int i = 0; i<100; i++) {
            usersList.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCalculator.getUsersQuantity(), 100);
        Assert.assertEquals(statisticsCalculator.getPostsQuantity(), 100);
        Assert.assertEquals(statisticsCalculator.getCommentsQuantity(), 1000);
        Assert.assertEquals(statisticsCalculator.getUsersPostsAverage(), 1, 0);
        Assert.assertEquals(statisticsCalculator.getUsersCommentsAverage(), 10, 0);
        Assert.assertEquals(statisticsCalculator.getCommentsPerPostAverage(), 10, 0);
        statisticsCalculator.showStatistics();
    }
}
