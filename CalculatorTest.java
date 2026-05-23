class Calculator {

    public int add(int a, int b){
        return a + b;
    }
}




public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("Addition is :- " + calculator.add(12, 17));
        
    }
}