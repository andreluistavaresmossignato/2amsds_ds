import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //declarando as variáveis

        double raio, area;
        //criando o objeto da classe Scanner

        Scanner scanner = new Scanner(System.in);

        //entrada de dados

        System.out.println("Informe o valor do raio");
        raio = scanner.nextDouble();

        //Processamento
        area = Math.PI * Math.pow(raio,2);
        // area = PI * raio ao quadrado

        //Saída

        System.out.println("A área da circuferência: " + area);

    }
}