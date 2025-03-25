import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double area,lado2,lado1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("informe o lado 1");
        lado1 = scanner.nextDouble();

        System.out.println("informe o lado 2");
        lado2 = scanner.nextDouble();

        area = lado1 * lado2;

        System.out.println("area "+area);

    }
}