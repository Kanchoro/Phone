package Models;

public class Calculation {
    private int firstNumber;
    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public Calculation(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public String toString() {
        return "Calculation!" +
                "\nFirstNumber: " + firstNumber +
                "\nSecondNumber: " + secondNumber
                ;
    }
}
