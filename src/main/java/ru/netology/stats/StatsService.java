package ru.netology.stats;

public class StatsService {
    public long salesAmount(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long salesAverage(long[] sales) {
        long sum = salesAmount(sales);
        long average = 0;

        for (int i = 0; i < sales.length; i++) {
            average = sum / sales.length;
        }
        return average;
    }

    public int salesMax(long[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int salesMin(long[] sales) {
        int minMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long salesBelowTheAverage(long[] sales) {
        long average = salesAverage(sales);
        long count = 0;

        for (long t : sales) {
            if (t < average) {
                count++;
            }
        }
        return count;
    }

    public long salesAboveTheAverage(long[] sales) {
        long average = salesAverage(sales);
        long count = 0;

        for (long t : sales) {
            if (t > average) {
                count++;
            }
        }
        return count;
    }
}
