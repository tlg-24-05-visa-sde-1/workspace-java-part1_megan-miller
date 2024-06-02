package org.math;

class CalculatorTest {
    public static void main(String[] args) {
        boolean isCorrect = true;

        for (int i = 0; i < 1_000_000; i++) {
            int result = Calculator.randomInt(5,20);
            if (result < 5 || result > 20 ){
                isCorrect = false;
                break;
            }
        }
        if(isCorrect) {
            System.out.println("It Works!");
        } else {
            System.out.println("It doesn't Work!");
        }

    }
}