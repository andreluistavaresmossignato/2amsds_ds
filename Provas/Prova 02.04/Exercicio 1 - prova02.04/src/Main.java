import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salBruto, salLiquido, desconto;

        System.out.println("Informe seu salário bruto: ");
        salBruto = scanner.nextDouble();

        if(salBruto <= 3000) {
            desconto = salBruto * 2 / 100;
        } else if (salBruto > 3000 && salBruto <= 4500) {
            desconto = salBruto * 5 / 100;
        } else if (salBruto > 4500 && salBruto <= 7500) {
            desconto = salBruto * 10 / 100;
        } else {
            desconto = salBruto * 15 / 100;
        }

        salLiquido = salBruto - desconto;
        System.out.println("Seu salário bruto é de: " + salBruto + " e seu salário líquido é de: " + salLiquido);
    }
}