import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n = scanner.nextDouble();

        if(n <= 10) {
            System.out.println("F1");
        }

        else if(n > 10 && n <= 100) {
            System.out.println("F2");
        }

        else if(n > 100) {
            System.out.println("F3");
        }
    }
}