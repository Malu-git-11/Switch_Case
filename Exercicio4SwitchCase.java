import javax.swing.*;

public class Exercicio4SwitchCase {
    public static void main(String[] args){
        String num = JOptionPane.showInputDialog("Digite a nota de 0 a 10:");

        switch (num){
            case "0":
                JOptionPane.showMessageDialog(null, "F");
                break;

            case "1":
                JOptionPane.showMessageDialog(null, "F");
                break;

            case "2":
                JOptionPane.showMessageDialog(null, "F");
                break;

            case "3":
                JOptionPane.showMessageDialog(null, "D");
                break;

            case "4":
                JOptionPane.showMessageDialog(null, "D");
                break;

            case "5":
                JOptionPane.showMessageDialog(null, "C");
                break;

            case "6":
                JOptionPane.showMessageDialog(null, "C");
                break;

            case "7":
                JOptionPane.showMessageDialog(null, "B");
                break;

            case "8":
                JOptionPane.showMessageDialog(null, "B");
                break;

            case "9":
                JOptionPane.showMessageDialog(null, "A");
                break;

            case "10":
                JOptionPane.showMessageDialog(null, "A");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Nota invalida.");
        }
    }
}
