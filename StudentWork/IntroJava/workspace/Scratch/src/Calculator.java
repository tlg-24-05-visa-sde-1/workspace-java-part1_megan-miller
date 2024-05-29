/*
 * This is an "all-static" class, i/e/, one with nothing but static methods
 * These methods are called from clients as Calulator.add(), Calculator.subtract(), etc.
 */
class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    /*
     * indicates if the supplied integer is even or not.
     */
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /*
     * Returns a random integer between 1 and 16 (inclusive)
     */
    public static int randomInt() {
        return randomInt(1,16);
    }

    /*
     * Returns a random integer between min and max (inclusive)
     */
    public static int randomInt(double min, double max) {
        return (int)((Math.random() * (max - min + 1)) + min);
    }


}