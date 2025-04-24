import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num = 0, total = 0;
        boolean continua = true;

        do {

            num = Integer.parseInt(JOptionPane.showInputDialog("Qual o número?"));

            for (int i = 0; i <= 10; i++) {
                total = i * num;
                JOptionPane.showInternalMessageDialog(null, num + " X " + i + " = " + total);
            }
            int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Mensagem" , JOptionPane.YES_NO_OPTION);
            if(resp == 1) {
                break; // encerra o DO...WHILE
            }
        } while (continua == true);
    }
}