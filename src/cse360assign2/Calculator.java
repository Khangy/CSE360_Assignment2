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
    private String history;
    /**
     * Only constructor of the Calculator class that initializes the total of the calculations to 0
     * and initializes the history with 0 to start.
     */
    public Calculator () {
        total = 0;  // not needed - included for clarity
        history = "0";
    }

    /**
     * The getTotal method returns the current result of all the calculations done together.
     * @return the current result of all the calculations done together.
     */
    public int getTotal () {
        return total;
    }

    /**
     * The add method accepts an integer value and should add it to the current total.
     * @param value is the integer taken from a user and is to be added to the current total.
     */
    public void add (int value) {
        total = total + value;
        history = history + " + " + value;
    }

    /**
     * The subtract method accepts an integer value and should subtract that value to the current total
     * @param value is the integer taken from a user and is to be subtracted to the current total.
     */
    public void subtract (int value) {
        total = total - value;
        history = history + " - " + value;
    }

    /**
     * The multiply method accepts an integer value and should multiply that value to the current total.
     * @param value is the integer take from a user and is to be multiplied to the current total.
     */
    public void multiply (int value) {
        total = total * value;
        history = history + " * " + value;
    }

    /**
     * The divide method accepts an integer value and should divide that value to the current total but in the case
     * the parameter value is 0, then the total will be set to 0 as well.
     * @param value is the integer take from a user and is to be divided to the current total except the case
     *              when the parameter is 0, then total will be set to 0.
     */
    public void divide (int value) {
        if (value == 0) {
            total = 0;
        }
        else {
            total = total / value;
        }
        history = history + " / " + value;
    }

    /**
     * The getHistory method returns a string of the history of the previous calculations that were done.
     * @return the history of the previous calculations that were done.
     */
    public String getHistory () {
        return history;
    }
}