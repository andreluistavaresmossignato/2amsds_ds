import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double nota = 0.0;
        double total = 0.0, media  = 0.0;
        int qtd = 0;

        while (nota >= 0){
            nota  = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota: "));
            if (nota >= 0) {
                total += nota;
                qtd++;
            }
        }

        media = total / qtd;
        JOptionPane.showMessageDialog(null,"A média é: "+media);
    }
}