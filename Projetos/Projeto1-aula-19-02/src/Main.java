import java.util.Scanner;

public  class Main {
    public static void main(String [] args){
        //metodo ponto de epartida do projeto
        //declarando as variáveis
        String nome;
        double nota1, nota2, media;
        int rm;

        //criando o objeto da classe Scanner
        //entrada de dados
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe o rm do aluno:");
        rm = scanner.nextInt();
        System.out.println("informe o nome:");
        nome = scanner.next();
        System.out.println("informe a nota 1:");
        nota1 = scanner.nextDouble();
        System.out.println("infomer a nota 2:");
        nota2 = scanner.nextDouble();

        //Processamento
        media = (nota1 + nota2) / 2;

        //
        System.out.println("RM do aluno: "+rm);
        System.out.println("Nome: "+nome);
        System.out.println("Nota1: "+nota1);
        System.out.println("Nota2: "+nota2);
        System.out.println("Média: "+media);

    }




}