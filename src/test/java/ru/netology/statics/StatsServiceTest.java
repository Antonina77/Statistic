package ru.netology.statics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void ShouldCalculateSum() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }


    @Test
    void ShouldcalculateAvergeTotal() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.CalculateAverageTotal(purchases);
        assertEquals(expected, actual);
    }


    @Test
    void ShouldFindMaxMonthSale() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.FindMaxMonthSale(purchases);


        assertEquals(expected, actual);
    }

    @Test
    void ShouldFindMinMonthSale() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.FindMinMonthSale(purchases);


        assertEquals(expected, actual);
    }


    @Test
    void ShouldCalculateMaxAverageCount() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.CalculateMaxAverageCount(purchases);


        assertEquals(expected, actual);
    }

    @Test
    void ShouldCalculateMinAverageCount() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.CalculateMinAverageCount(purchases);


        assertEquals(expected, actual);
    }
}











