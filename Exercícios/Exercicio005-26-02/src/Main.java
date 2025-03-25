import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double anos,meses;

        Scanner scanner = new Scanner(System.in);

        System.out.println("informe os anos");
        anos = scanner.nextDouble();

        meses = anos / 12;
        System.out.println("os meses são " + meses);

    }
}