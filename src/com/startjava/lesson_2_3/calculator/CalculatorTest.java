import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
        Scanner input = new Scanner(System.in);
        char answer = 'y';
        while (answer != 'n') {   
            System.out.print("Ведите первое число:");
            calculatorOne.setNumber1(input.nextInt());
            System.out.print("Введите знак математической операции:");
            calculatorOne.setOperator(input.next().charAt(0));
            System.out.print("Ведите второе число:"); 
            calculatorOne.setNumber2(input.nextInt());
            calculatorOne.calculate();
            do {
                System.out.println("Хотите продолжить вычисления? [y/n]");
                answer = input.next().charAt(0);
            } while (answer != 'y' && answer != 'n'); 
        }
    }
}