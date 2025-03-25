import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double c, k, re, ra, f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em celcius");
        c = scanner.nextDouble();

        //process

        f = c * 1.8 + 32;
        k = c + 273.15;
        re = c * 0.8;
        ra = c * 1.8 + 32 + 459.67;

        System.out.println(f + " Fahreheit");
        System.out.println(k + " Kelvin");
        System.out.println(re + " Réaumur");
        System.out.println(ra + " Rankine");

    }
}