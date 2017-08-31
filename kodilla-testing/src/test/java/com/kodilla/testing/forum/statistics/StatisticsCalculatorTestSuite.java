package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
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
        Assert.assertEquals(statisticsCalculator.getUsersPostsAverage(), 10);
        Assert.assertEquals(statisticsCalculator.getUsersCommentsAverage(), 1);
        Assert.assertEquals(statisticsCalculator.getCommentsPerPostAverage(), 0.1);
        statisticsCalculator.showStatistics();
    }
}
