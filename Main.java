import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        char operator = 0;
        double firstNum = 0;
        double secondNum = 0;
        System.out.println("Введи первое число: ");
        firstNum = scanner.nextDouble();
        System.out.println("Введи второе число: ");
        secondNum = scanner.nextDouble();
        System.out.println("Введи символ +, -, * или / ");
        operator = scanner.next().charAt(0);
        Calculator calculator = new Calculator(firstNum, secondNum, operator);
        System.out.println(calculator.makeCalculation());
    }
}
