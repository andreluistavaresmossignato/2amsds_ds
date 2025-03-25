import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // variaveis
        int num;

        Scanner scanner = new Scanner(System.in);

        // entrada
        System.out.println("Informe um número inteiro: ");
        num = scanner.nextInt();

        // condição
        if(num % 2 == 0 && num > 0) {
            // saída
            System.out.println("O número é par e positivo");
        }
    }
}