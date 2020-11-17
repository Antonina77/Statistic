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
        int NumberMonth = 0;
        int Average = total / purchases.length;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] < Average)
                NumberMonth++;
        }
        return NumberMonth;

    }

    public int findMaxMonthSale(int[] purshases) {
        int MaxMonth = purshases[0];
        int monthNumber = 0;

        for (int currentMonthNumber = 1; currentMonthNumber < purshases.length; currentMonthNumber = currentMonthNumber + 1) {
            int purchase = purshases[currentMonthNumber];
            if (MaxMonth <= purchase) {
                MaxMonth = purchase;
                monthNumber = currentMonthNumber;
            }
        }
        return monthNumber + 1;
    }

    public int findMinMonthSale(int[] purshases) {
        int MinMonth = purshases[0];
        int monthNumber = 0;

        for (int currentMonthNumber = 1; currentMonthNumber < purshases.length; currentMonthNumber = currentMonthNumber + 1) {
            int purchase = purshases[currentMonthNumber];
            if (MinMonth > purchase) {
                MinMonth = purchase;
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



