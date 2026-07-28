// EXP.2: Programs on method oveerloading and constructor overloading
// NAME: Aryan Khedekar
// UIN: 251P107
public class Calculator {

    int num1, num2;
    double dnum1, dnum2;

    Calculator() {
        num1 = 0;
        num2 = 0;
    }

    Calculator(int a, int b) {
        num1 = a;
        num2 = b;
    }

    Calculator(double a, double b) {
        dnum1 = a;
        dnum2 = b;
    }

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        System.out.println("Default sum: " + c1.add(c1.num1, c1.num2));

        Calculator c2 = new Calculator(5, 10);
        System.out.println("Integer sum: " + c2.add(c2.num1, c2.num2));

        Calculator c3 = new Calculator(5.5, 10.2);
        System.out.println("Double sum: " + c3.add(c3.dnum1, c3.dnum2));
    }
}