package cse360assign2;

/**
 * Name: Khang Le
 * Class ID: 450
 * Assignment 2
 *
 * Calculator.java contains the Calculator class which contains computational methods on addition,
 * subtraction, multiplication, and division. This class can also return the current total of
 * calculations performed so far and can return the history of which these calculations were done.
 */

public class Calculator {

    private int total;

    /**
     * Only constructor of the Calculator class that initializes the total of the calculations to 0.
     */
    public Calculator () {
        total = 0;  // not needed - included for clarity
    }

    /**
     * The getTotal method should return the current result of all the calculations done together.
     * @return the current result of all the calculations done together but only returns 0 for now.
     */
    public int getTotal () {
        return 0;
    }

    /**
     * The add method accepts an integer value and should add it to the current total.
     * @param value is the integer taken from a user and is to be added to the current total.
     */
    public void add (int value) {

    }

    /**
     * The subtract method accepts an integer value and should subtract that value to the current total
     * @param value is the integer taken from a user and is to be subtracted to the current total.
     */
    public void subtract (int value) {

    }

    /**
     * The multiply method accepts an integer value and should multiply that value to the current total.
     * @param value is the integer take from a user and is to be multiplied to the current total.
     */
    public void multiply (int value) {

    }

    /**
     * The divide method accepts an integer value and should divide that value to the current total.
     * @param value is the intger take from a user and is to be divided to the current total.
     */
    public void divide (int value) {

    }

    /**
     * The getHistory method returns a string of the history of the previous calculations that were done.
     * @return the history of the previous calculations that were done.
     */
    public String getHistory () {
        return "";
    }
}