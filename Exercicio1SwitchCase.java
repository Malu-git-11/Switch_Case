import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio1SwitchCase {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Digite um numero de 1 a 7");

        switch (num){
            case "1":
                JOptionPane.showMessageDialog(null, "Domingo");
                break;

            case "2":
                JOptionPane.showMessageDialog(null," Segunda");
                break;

            case "3":
                JOptionPane.showMessageDialog(null, "Terça");
                break;

            case "4":
                JOptionPane.showMessageDialog(null, "Quarta");
                break;

            case "5":
                JOptionPane.showMessageDialog(null, "Quinta");
                break;

            case "6":
                JOptionPane.showMessageDialog(null, "Sexta");
                break;

            case "7":
                JOptionPane.showMessageDialog(null, "Sabado");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opçao invaçida");
        }
    }
}