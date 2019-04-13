package calculator;

public class CalculatorMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int addResult = calculator.add(54, 16);
        int subResult = calculator.subtract(145, 125);

        if ((addResult == 70) && (subResult == 20))
        {
            System.out.println("Calculator test OK");
        }
        else {
            System.out.println("Calculator has error!");
        }
    }
}
