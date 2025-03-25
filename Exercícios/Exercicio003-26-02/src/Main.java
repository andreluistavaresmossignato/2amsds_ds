import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double raio1,volume,altura;

        System.out.println("informe o raio1");
        raio1 = scanner.nextDouble();

        System.out.println("informe a altura");
        altura = scanner.nextDouble();

        volume = 3.14159 * raio1 * raio1 * altura;

        System.out.println("o volume é "+volume);

    }
}