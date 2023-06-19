package calculator;

public class Calculator {

    public Calculator() {
    }

    //metodi

    public float add(float num1, float num2) {
        return num1 + num2;
    }

    public float subtract(float num1, float num2) {
        return num1 - num2;
    }


    public float divide(float num1, float num2) throws IllegalArgumentException {
        if (num2 != 0) {
            return num1 / num2;
        }else {
            throw new IllegalArgumentException("Non puoi dividere per zero");
        }
    }


    public float multiply(float num1, float num2) {
        return num1 * num2;
    }



}

