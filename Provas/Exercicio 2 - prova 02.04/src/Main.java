import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        num = scanner.nextDouble();

        if(num % 5 == 0 && num > 0) {
            System.out.println("O número é positivo e múltiplo de 5");
        }
    }
}