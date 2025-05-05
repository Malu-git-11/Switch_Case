import javax.swing.*;

public class Exercicio6SwitchCase {
    public static void main(String[] args) {
        String opcao = JOptionPane.showInputDialog(null, "Escreva o nome do planeta:");

        switch (opcao){
            case "mercurio":
                JOptionPane.showMessageDialog(null, "Rochoso");
                break;

            case "venus":
                JOptionPane.showMessageDialog(null, "Rochoso");
                break;

            case "terra":
                JOptionPane.showMessageDialog(null, "Rochoso");
                break;

            case "marte":
                JOptionPane.showMessageDialog(null, "Rochoso");
                break;

            case "jupiter":
                JOptionPane.showMessageDialog(null, "Gasoso");
                break;

            case "saturno":
                JOptionPane.showMessageDialog(null, "Gasoso");
                break;

            case "urano":
                JOptionPane.showMessageDialog(null, "Gasoso");
                break;

            case "netuno":
                JOptionPane.showMessageDialog(null, "Gasoso");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opcao invalida");
        }
    }
}
