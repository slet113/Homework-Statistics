package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void sumOfAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.salesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.salesAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthNumberWithMaxAmount () {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.salesMax(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthNumberWithMinAmount () {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.salesMin(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfMonthsWhereSalesAreBelowAverage () {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.salesBelowTheAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfMonthsWhereSalesAreAboveAverage () {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.salesAboveTheAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
