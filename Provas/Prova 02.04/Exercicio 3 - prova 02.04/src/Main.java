import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;

        System.out.println("Sua nota de 0 a 100: ");
        nota = scanner.nextDouble();

        if(nota < 60 && nota >= 0) {
            System.out.println("Seu conceito final é: E");
        } else if (nota >= 60 && nota <= 69) {
            System.out.println("Seu conceito final é: D");
        } else if (nota >= 70 && nota <= 79) {
            System.out.println("Seu conceito final é: C");
        } else if (nota >= 80 && nota <= 89) {
            System.out.println("Seu conceito final é: B");
        } else if (nota >= 90 && nota <= 100) {
            System.out.println("Seu conceito final é: A");
        } else {
            System.out.println("Coloque uma nota válida");
        }

        System.out.println();
    }
}