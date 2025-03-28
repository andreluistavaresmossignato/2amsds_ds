import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double sal, result, vend;
        int carVend;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o sálario minímo");
        sal = sc.nextDouble();


        System.out.println("Informe a quantidade de carros vendidos");
        carVend = sc.nextInt();


        System.out.println("Informe a quantidade de lucros de carros vendidos");
        vend = sc.nextDouble();


        result = sal * 2  + carVend*50 + 5/100*sal;
        System.out.println("Seu salário final é de: R$"+result);
    }
}