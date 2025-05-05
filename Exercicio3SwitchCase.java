import javax.swing.*;

public class Exercicio3SwitchCase {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Digite o numero do mes (de 1 a 12): ");

        switch (num){
            case "1":
                JOptionPane.showMessageDialog(null, "Verao");
                break;

            case "2":
                JOptionPane.showMessageDialog(null, "Verao");
                break;

            case "3":
                JOptionPane.showMessageDialog(null, "Verao ate o dia 20, depois e Outono");
                break;

            case "4":
                JOptionPane.showMessageDialog(null, "Outono");
                break;

            case "5":
                JOptionPane.showMessageDialog(null, "Outono");
                break;

            case "6":
                JOptionPane.showMessageDialog(null, "Outono até o dia 20, depois e Inverno");
                break;

            case "7":
                JOptionPane.showMessageDialog(null, "Inverno");
                break;

            case "8":
                JOptionPane.showMessageDialog(null, "Inverno");
                break;

            case "9":
                JOptionPane.showMessageDialog(null, "Inverno até o dia 20, depois Primavera");
                break;

            case "10":
                JOptionPane.showMessageDialog(null, "Primavera");
                break;

            case "11":
                JOptionPane.showMessageDialog(null, "Primavera");
                break;

            case "12":
                JOptionPane.showMessageDialog(null, "Primavera ate o dia 20, depois Verao");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opçao invaçida");
        }
    }
}
