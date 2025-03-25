import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      double numero1, numero2, adicao, multiplicacao, divisao;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero1 = scanner.nextDouble();

        System.out.println("Digite outro número: ");
        numero2 = scanner.nextDouble();

        adicao = numero1 + numero2;
        multiplicacao = numero1 * numero2;
        divisao = numero1 / numero2;

        System.out.println("a adição dos numeros é de: " + adicao);
        System.out.println("a multipicação dos numeros é de: " + multiplicacao);
        System.out.println("a divisão dos numeros é de: " + divisao);


    }
}