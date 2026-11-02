package com.pruralsight;

import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] scores = {225,521,421,162,272,266,218,345,237,344};
        int sum = 0;
        int highScore = 0;
        int lowScore = scores[0];

        for (int num : scores){
            sum = sum + num;
            if (num > highScore) {
                highScore =num;
            }
            if (num < lowScore) {
                lowScore = num;
            }
        }
        Arrays.sort(scores);
        double average = (double) sum / scores.length;
        double median = (scores[4] + scores[5]) / 2.0;
        double medianValue = median - average ;
        System.out.println(sum);
        System.out.println(average);
        System.out.println(highScore);
        System.out.println(lowScore);
        System.out.println(medianValue);
    }
}
