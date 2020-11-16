package ru.netology.statics;

public class StatsService {


    public int calculateSum(int[] purshases) {
        int sum = 0;
        for (int purchace : purshases) {
            sum += purchace;

        }
        return sum;
    }

    public int CalculateAverageTotal(int[] purshases) {
        int total = 0;
        for (int purchace : purshases) {
            total += purchace;

        }
        return total / 12;
    }

    public int FindMaxMonthSale(int[] purshases) {
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


    public int FindMinMonthSale(int[] purshases) {
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


    public int CalculateMaxAverageCount(int[] purshases) {

        int averageAmount = CalculateAverageTotal(purshases);
        int count = 0;

        for (int purchase : purshases) {
            if (purchase < averageAmount) {
                count += 1;
            }
        }
        return count;
    }

    public int CalculateMinAverageCount(int[] purshases) {

        int averageAmount = CalculateAverageTotal(purshases);
        int count = 0;

        for (int purchase : purshases) {
            if (purchase > averageAmount) {
                count += 1;
            }
        }
        return count;
    }
}



