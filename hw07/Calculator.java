import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorLogger logger = new CalculatorLogger(new ViewLogger());
        String operation;
        String yesNo;
        while (true) {
            System.out.print("\nВведите действительную часть числа 1: ");
            double real1 = scanner.nextDouble();
            System.out.print("Введите мнимую часть числа 1: ");
            double imag1 = scanner.nextDouble();
            ComplexNumber num1 = new ComplexNumber(real1, imag1);

            System.out.print("\nВведите действительную часть числа2: ");
            double real2 = scanner.nextDouble();
            System.out.print("Введите мнимую часть числа2: ");
            double imag2 = scanner.nextDouble();
            ComplexNumber num2 = new ComplexNumber(real2, imag2);


            System.out.println("Доступные операции:\n1 - сложение\n2 - вычитание\n3 - умножение\n4 - деление");
            System.out.print("Выберите операцию: ");
            operation = scanner.next();
            switch (operation) {
                case "1":
                    ComplexNumber sum = num1.add(num2);
                    logger.logAddition(num1, num2, sum);
                    break;
                case "2":
                    ComplexNumber difference = num1.subtract(num2);
                    logger.logSubtraction(num1, num2, difference);
                    break;
                case "3":
                    ComplexNumber product = num1.multiply(num2);
                    logger.logMultiplication(num1, num2, product);
                    break;
                case "4":
                    ComplexNumber quotient = num1.divide(num2);
                    logger.logDivision(num1, num2, quotient);
                    break;
                default:
                    System.out.println("Недопустимая операция!");
            }

            System.out.print("\nЖелаете продолжить вычисления (y/n): ");
            yesNo = scanner.next();
            if (yesNo.equals("n")) {
                break;
            }
        }
    }
}
