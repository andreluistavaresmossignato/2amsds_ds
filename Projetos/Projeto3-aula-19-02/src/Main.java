import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double peso, altura, imc;
        String nome;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome da pessoa: ");
        nome = scanner.next();
        System.out.println("Informe seu peso: ");
        peso = scanner.nextDouble();
        System.out.println("Informe sua altura: ");
        altura = scanner.nextDouble();

        imc = peso / (Math.pow(altura,2));
        System.out.println("Nome da pessoa: "+nome);
        System.out.println("IMC: "+imc);


    }
}