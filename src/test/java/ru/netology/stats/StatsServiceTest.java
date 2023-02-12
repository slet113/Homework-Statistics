package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void sumOfAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.salesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesAmount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.salesAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthNumberWithMaxAmount () {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.salesMax(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthNumberWithMinAmount () {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = service.salesMin(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfMonthsWhereSalesAreBelowAverage () {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.salesBelowTheAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfMonthsWhereSalesAreAboveAverage () {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.salesAboveTheAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
