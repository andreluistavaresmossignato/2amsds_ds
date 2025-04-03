import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int idade;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade");
        idade = scanner.nextInt();

        if(idade <= 12 && idade >= 0) {
            System.out.println("Recomenda-se natação, futebol ou dança infantil");
        } else if (idade >= 13 && idade <= 18) {
            System.out.println("Recomenda-se musculação leve, corrida ou esportes coletivos");
        } else if (idade >= 19 && idade <= 40) {
            System.out.println("Recomenda-se musculação, crossfit, corrida ou ciclismo");
        } else if (idade >= 41 && idade <= 60) {
            System.out.println("Recomenda-se caminhada, yoga ou pilates");
        } else if(idade >= 61){
            System.out.println("Recomenda-se hidroginástica, alongamento ou caminhada leve");
        } else {
            System.out.println("Idade inválida");
        }

    }
}