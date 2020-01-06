import java.util.Scanner;

public class InteractRunner {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter action (+-*/): ");
                String action = reader.next();
                System.out.println("Enter first argument");
                String first = reader.next();
                System.out.println("Enter second argument");
                String second = reader.next();
                calc.action(action, Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Result = " + calc.getResult());
                System.out.println("Clean result: clean/not:" );
                String cleanResult = reader.next();
                calc.cleanResult(cleanResult);
                System.out.println("Exit? Yes|No");
                exit = reader.next();
            }
        } finally {
            reader.close();
        }
    }
}