package ru.netology.statics;

public class StatsService {


    public int calculateSum(int[] purshases) {
        int sum = 0;
        for (int purchace : purshases) {
            sum += purchace;

        }
        return sum;
    }

    public int calculateAverageTotal(int[] purchases) {
        int total = calculateSum(purchases);
        int average = total / purchases.length;

        return average;

    }

    public int findMaxMonthSale(int[] purshases) {
        int maxMonth = purshases[0];
        int monthNumber = 0;

        for (int currentMonthNumber = 1; currentMonthNumber < purshases.length; currentMonthNumber = currentMonthNumber + 1) {
            int purchase = purshases[currentMonthNumber];
            if (maxMonth <= purchase) {
                maxMonth = purchase;
                monthNumber = currentMonthNumber;
            }
        }
        return monthNumber + 1;
    }

    public int findMinMonthSale(int[] purshases) {
        int minMonth = purshases[0];
        int monthNumber = 0;

        for (int currentMonthNumber = 1; currentMonthNumber < purshases.length; currentMonthNumber = currentMonthNumber + 1) {
            int purchase = purshases[currentMonthNumber];
            if (minMonth > purchase) {
                minMonth = purchase;
                monthNumber = currentMonthNumber;
            }
        }

        return monthNumber + 1;
    }

    public int calculateMaxAverageCount(int[] purshases) {

        int averageAmount = calculateAverageTotal(purshases);
        int count = 0;

        for (int purchase : purshases) {
            if (purchase < averageAmount) {
                count += 1;
            }
        }
        return count;
    }

    public int calculateMinAverageCount(int[] purshases) {

        int averageAmount = calculateAverageTotal(purshases);
        int count = 0;

        for (int purchase : purshases) {
            if (purchase > averageAmount) {
                count += 1;
            }
        }
        return count;
    }
}



