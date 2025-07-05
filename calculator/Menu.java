import java.util.Scanner;

public class Menu {

    private final Scanner scanner = new Scanner(System.in);
    private final Calculator calculator = new Calculator();

    public void menu(){
        do {
            var option = options(this.scanner);
            if (option == 99) break;

            var a = inputParams(this.scanner,'a');
            var b = inputParams(this.scanner,'b');
            String operation;

            switch (option){
                case 1:
                    operation = "sum";
                    result(operation, calculator.sum(a, b));
                    break;
                case 2:
                    operation = "subtration";
                    result(operation, calculator.subtract(a, b));
                    break;
                case 3:
                    operation = "multiplication";
                    result(operation, calculator.multiply(a, b));
                    break;
                case 4:
                    operation = "division";
                    result(operation, calculator.divide(a, b));
                    break;
                default:
                    System.out.println("Invalid option");
            }

        } while (true);
        end();
        this.scanner.close();
    }

    private int options(Scanner scanner){
        System.out.println("+-------------------------------------------------+");
        System.out.println("|                  CALCULATOR                     |");
        System.out.println("+-------------------------------------------------+");
        System.out.println("|    1) Sum                                       |");
        System.out.println("|    2) subtract                                  |");
        System.out.println("|    3) multiply                                  |");
        System.out.println("|    4) divide                                    |");
        System.out.println("|    99) quit                                     |");
        System.out.println("+-------------------------------------------------+");
        System.out.print("Enter the selected option:");
        return scanner.nextInt();

    }

    private int inputParams(Scanner scanner, char param){
        System.out.printf("Enter the value of number %c:%n", param);
        return scanner.nextInt();
    }

    private void result(String operation, double result){
        System.out.printf("The %s result is %.4f\n\n\n", operation, result);
    }

    private void end(){
        System.out.println("+-------------------------------------------------+");
        System.out.println("|                    THE END                      |");
        System.out.println("+-------------------------------------------------+");
    }
}
