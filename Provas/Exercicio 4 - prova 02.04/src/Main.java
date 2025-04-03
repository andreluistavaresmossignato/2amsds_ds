import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double consumo, exc, fin;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o consumo de litros de água em metros cúbicos");
        consumo = scanner.nextDouble();

        if (consumo <= 10 && consumo >= 0) {
            System.out.println("Você vai pagar R$15,00");
        } else if (consumo >= 11 && consumo <= 20) {
            exc = (consumo - 10) * 2;
            fin = exc + 15;
            System.out.println("Você vai pagar R$" + fin);
        } else if (consumo >= 21 && consumo <= 30) {
            exc = (consumo - 10) * 3;
            fin = exc + 35;
            System.out.println("Você vai pagar R$" + fin);
        } else if (consumo > 30) {
            exc = (consumo - 10) * 5;
            fin = exc + 65;
            System.out.println("Você vai pagar R$" + fin);
        } else {
            System.out.println("Resultado inválido-");
        }
    }
}