package com.pruralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Dice {
    static void main(String[] args) {

        Dice Dice = new Dice();
        Dice dice = new Dice();


        int roll1 = Dice.roll();
        int roll2 = dice.roll();


        int counterTwo = 0;
        int counterFour = 0;
        int counterSix = 0;
        int counterSeven = 0;


        int i = 0;
        for ( i = 1; i <= 100 ; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;
            if (sum == 2) {
                counterTwo++;
            } else if (sum == 4) {
                counterFour++;
            } else if (sum == 6) {
                counterSix++;
            } else if (sum == 7) {
                counterSeven++;
            }

            System.out.println("Roll 1:  " + roll1 + " - " + roll2 + "  Sum: " + sum);

        }
        System.out.println("Two counts: " + counterTwo);
        System.out.println("Four counts: " + counterFour);
        System.out.println("Six counts: " + counterSix);
        System.out.println("Sevengit  counts: " + counterSeven);
    }
    public int roll(){
        int maxValue = 6;
        int minValue = 1;
        int randomNumber = (int)(Math.random() * (maxValue - minValue + 1)) + minValue;
        return randomNumber;
    }
}



