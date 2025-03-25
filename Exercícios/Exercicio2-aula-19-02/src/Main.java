import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       String nome;
       double p1, p2, p3, q1, q2, q3, r;

        Scanner scanner = new Scanner(System.in);

        System.out.println("informe o nome: ");
         nome = scanner.next();
        System.out.println("informe o valor do produto 1: ");
        p1 = scanner.nextDouble();
        System.out.println("informe a quantidade de produto 1: ");
        q1 = scanner.nextDouble();
        System.out.println("informe o valor do produto 2: ");
        p2 = scanner.nextDouble();
        System.out.println("informe a quantidade de produto 2: ");
        q2 = scanner.nextDouble();
        System.out.println("informe o valor do produto 3: ");
        p3 = scanner.nextDouble();
        System.out.println("informe a quantidade de produto 3: ");
        q3 = scanner.nextDouble();


    }
}