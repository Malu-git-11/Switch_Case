import javax.swing.*;

public class Exercicio5SwitchCase {
    public static void main(String[] args){
        String opcao = JOptionPane.showInputDialog(null, "Digite a letra representando o tipo de combustivel:");

        switch (opcao){
            case "A":
                JOptionPane.showMessageDialog(null, "Alcool");
                break;

            case "G":
                JOptionPane.showMessageDialog(null, "Gasolina");
                break;

            case "D":
                JOptionPane.showMessageDialog(null, "Disel");
                break;

            case "E":
                JOptionPane.showMessageDialog(null, "Eletrico");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opçao invalida");
        }
    }
}
