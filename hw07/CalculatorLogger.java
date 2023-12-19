// Логирование операций
public class CalculatorLogger implements Logger {
    private Logger logger;

    public CalculatorLogger(Logger logger) {
        this.logger = logger;
    }

    private void logOperation(String operation, ComplexNumber operand1, ComplexNumber operand2, ComplexNumber result) {
        String message = "Логирование и результат: " + operand1 + " " + operation + " " + operand2 + " = " + result;
        logger.log(message);
    }

    @Override
    public void log(String message) {
        logger.log(message);
    }

    public void logAddition(ComplexNumber operand1, ComplexNumber operand2, ComplexNumber result) {
        logOperation("+", operand1, operand2, result);
    }

    public void logSubtraction(ComplexNumber operand1, ComplexNumber operand2, ComplexNumber result) {
        logOperation("-", operand1, operand2, result);
    }

    public void logMultiplication(ComplexNumber operand1, ComplexNumber operand2, ComplexNumber result) {
        logOperation("*", operand1, operand2, result);
    }

    public void logDivision(ComplexNumber operand1, ComplexNumber operand2, ComplexNumber result) {
        logOperation("/", operand1, operand2, result);
    }
}

