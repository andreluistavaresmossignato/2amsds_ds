import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double a , r, resultado;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do raio positivo ");
        r = scanner.nextDouble();

        resultado = Math.PI * (r * r);

        if(r<=0){
            System.out.println("O raio não pode ser nulo ou negativo");
        }
        else{
            System.out.println("O valor da área é " + resultado);
        }




    }
}