package ru.netology.stats;

public class StatsService {
    public long sumAllSales(long[] sales) {
        long sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];

        }
        return sumSales;
    }

    public long averageSales(long[] sales) {
        long sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];

        }
        return sumSales / 12;
    }

    public int maxSaleMonth(long[] sales) {
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

    public int minSaleMonth(long[] sales) {
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

    public int belowAverageSales(long[]sales) {
        int sum = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                sum++;
            }
        }
        return sum;

    }
    public int aboveAverageSales(long[]sales) {
        int sum = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                sum++;
            }
        }
        return sum;




}

}