import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declarando as variáveis
        int a,c,b;

        //criando o objeto do tipo Scanner
        Scanner scanner = new Scanner(System.in);

        //entrada de dados
        System.out.println("Informe o 1º número inteiro: ");
        a = scanner.nextInt();
        System.out.println("Informe o 2º número inteiro: ");
        b = scanner.nextInt();
        System.out.println("Informe o 3º número inteiro: ");
        c = scanner.nextInt();

        if (a<=b && b<=c){
            System.out.println(a+" "+b+" "+c);
        }else if (a<=b && c<=b){
            System.out.println(a+" "+c+" "+b);
        }else if(b<=a && a<=c){
            System.out.println(b+" "+a+" "+c);
        }else if(b<=a && c<=a){
            System.out.println(b+" "+c+" "+a);
        }else if(c<=a && a<=b){
            System.out.println(c+" "+a+" "+b);
        }
        else{
            System.out.println(c+" "+b+" "+a);
        }
    }
}