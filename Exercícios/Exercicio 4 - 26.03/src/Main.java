import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,n3,n4;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º número inteiro: ");
        n1 = scanner.nextInt();
        System.out.println("Digite o 2º número inteiro: ");
        n2 = scanner.nextInt();
        System.out.println("Digite o 3º número inteiro: ");
        n3 = scanner.nextInt();
        System.out.println("Digite o 4º número inteiro: ");
        n4 = scanner.nextInt();

        if (n1 % 2 == 0 && n1 % 3 == 0){
            System.out.println("O 1º número é "+n1+" ele é divisível por 2 e 3");
        }
        if (n2 % 2 == 0 && n2 % 3 == 0){
            System.out.println("O 2º número "+n2+" ele é divisível por 2 e 3");
        }
        if (n3 % 2 == 0 && n3 % 3 == 0){
            System.out.println("O 3º número "+n3+" ele é divisível por 2 e 3");
        }
        if (n4 % 2 == 0 && n4 % 3 == 0){
            System.out.println("O 4º número "+n4+" ele é divisível por 2 e 3");
        }
    }
}