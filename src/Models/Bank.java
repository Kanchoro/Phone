package Models;

public class Bank {
    private double money;

    public Bank(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Bank: +" + money
                ;
    }
}
