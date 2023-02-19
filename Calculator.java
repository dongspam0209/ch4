package Ch4;

public class Calculator {
    private String owner;

    public Calculator(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        return num1 / num2;
    }

    public double divide(String num1, String num2) {
        return Double.parseDouble(num1)/Double.parseDouble(num2);
    }


}
