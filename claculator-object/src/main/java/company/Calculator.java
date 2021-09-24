package company;

public class Calculator {
    public int answer;
    double answerB;


    public int addInt(int a, int b) {
        answer = a + b;
        System.out.println(a + " + " + b + " = " + answer);
        return a + b;
    }

    public int subtractInt(int a, int b) {
        answer = a- b;
        System.out.println(a + " - " + b + " = " + answer);
        return a - b;
    }


    public int multiplyInt(int a, int b) {
        answer = a * b;
        System.out.println(a + " * " + b + " = " + answer);
        return a * b;
    }

    public int divideInt(int a, int b) {
        answer = a / b;
        System.out.println(a + " / " + b + " = " + answer);
        return a / b;
    }

    public double addDouble(double a, double b) {
        answerB = a + b;
        System.out.println(a + " + " + b + " = " + answerB);
        return a + b;
    }

    public double subtractDouble(double a, double b) {
        answerB = a - b;
        System.out.println(a + " - " + b + " = " + answerB);
        return a - b;
    }

    public double multiplyDouble(double a, double b) {
        answerB = a * b;
        System.out.println(a + " * " + b + " = " + answerB);
        return a * b;
    }

    public double divideDouble(double a, double b) {
        answerB = a / b;
        System.out.println(a + " / " + b + " = " + answerB);
        return a / b;
    }
}
