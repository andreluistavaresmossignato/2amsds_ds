import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sal, imposto;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seu salário: ");
        sal = scanner.nextDouble();

        if (sal <= 1787.77) {
            imposto = 0;
            sal = sal;
        }
        else if (sal >= 1787.78 && sal <= 2679.29) {
            imposto = sal * 0.075;
            sal = sal - imposto;
        }
        else if (sal >= 2679.30 && sal <= 3572.43) {
            imposto = sal * 0.15;
            sal = sal - imposto;
        }
        else if (sal >= 3572.44 && sal <= 4463.81) {
            imposto = sal * 0.225;
            sal = sal - imposto;
        }
        else if (sal > 4463.81) {
            imposto = sal * 0.275;
            sal = sal - imposto;
        }

        System.out.println("Seu salário final é: " + sal);
        System.out.println("Você pagou: " + imposto);
    }
}
