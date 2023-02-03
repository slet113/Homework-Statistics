package ru.netology.stats;

public class StatsService {
    public int salesAmount(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int salesAverage(int[] sales) {
        int sum = 0;
        int average = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            average = sum / sales.length;
        }
        return average;
    }

    public int salesMax(int[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int salesMin(int[] sales) {
        int minMonth = 0;
        int month = 0;

        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int salesBelowTheAverage(int[] sales) {
        int sum = 0;
        int average = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            average = sum / sales.length;
        }

        int count = 0;
        for (int t : sales) {
            if (t < average) {
             count++;
            }
        }
        return count;
    }

    public int salesAboveTheAverage(int[] sales) {
        int sum = 0;
        int average = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            average = sum / sales.length;
        }

        int count = 0;
        for (int t : sales) {
            if (t > average) {
                count++;
            }
        }
        return count;
    }
}
