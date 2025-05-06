import javax.swing.*;

public class Exercicio7SwitchCase {
    public static void main(String[] args){
        String saque = JOptionPane.showInputDialog("Opcoes de Saque (R$10; R$20; R$50; R$100)");

        switch (saque){
            case "10":
                JOptionPane.showMessageDialog(null, "R$10 Sacados");
                break;

            case "20":
                JOptionPane.showMessageDialog(null, "R$20 Sacados");
                break;

            case "50":
                JOptionPane.showMessageDialog(null, "R$50 Sacados");
                break;

            case "100":
                JOptionPane.showMessageDialog(null, "R$100 Sacados");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opcao invalida");
        }
    }
}
