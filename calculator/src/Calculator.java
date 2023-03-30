import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.*;

public class Calculator {
    private final ArrayList<String> operations;

    public Calculator(){
        this.operations = new ArrayList<String>(Arrays.asList("+", "-", "*", "/"));
    }


    private double resolveExpression(String operator, List<String> factors){
        if (operator.equals("+")){
            return (double) Integer.parseInt(factors.get(0)) + Integer.parseInt(factors.get(1));
        }

        if (operator.equals("-")){
            return (double) Integer.parseInt(factors.get(0)) - Integer.parseInt(factors.get(1));
        }

        if (operator.equals("/")){
            return (double) Integer.parseInt(factors.get(0)) / Integer.parseInt(factors.get(1));
        }

        if (operator.equals("*")){
            return (double) Integer.parseInt(factors.get(0)) * Integer.parseInt(factors.get(1));
        }
        
        return -1.1;    
    }

    public double evaluateTwoNumbersExpression(String expression) throws Exception {
        String[] splittedExpression = expression.trim().split("(?!^)");
        String operation = splittedExpression[1];
        List<String> factors = new ArrayList<>();
        factors.add(splittedExpression[0]);
        factors.add(splittedExpression[2]);

        if (!operations.contains(operation)){
            throw new Exception("Invalid Expression");
        }

        return this.resolveExpression(operation, factors);
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
