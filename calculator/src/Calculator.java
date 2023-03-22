import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    private final ArrayList<String> operations;

    public Calculator(){
        this.operations = new ArrayList<String>(Arrays.asList("+", "-", "*", "/"));
    }

    public double evaluateTwoNumbersExpression(String expression) throws Exception {
        String[] splittedExpression = expression.split(" ");
        String operation = splittedExpression[1];

        if (!operations.contains(operation)){
            throw new Exception("Invalid Expression");
        }

        ScriptEngine engine = new ScriptEngineManager(null).getEngineByName("js");

        Object result = engine.eval(expression);

        return (double) result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma expressao de dois numeros");

        String expression = scanner.nextLine();

        try {
            System.out.println(calculator.evaluateTwoNumbersExpression(expression));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
