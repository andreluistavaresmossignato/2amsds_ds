import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double atual,nasceu,idade;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Em que ano você nasceu?");
        nasceu = scanner.nextDouble();

        System.out.println("Em que ano estamos?");
        atual = scanner.nextDouble();

        idade = atual - nasceu;

        System.out.println("Você tem " + idade + " anos de idade.");

    }
}