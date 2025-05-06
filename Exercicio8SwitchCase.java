import javax.swing.*;

public class Exercicio8SwitchCase {
    public static void main(String[] args){
        String fase = JOptionPane.showInputDialog(null, "Informe o numero da fase concluida (1 a 5)");

        switch (fase){
            case "1":
                JOptionPane.showMessageDialog(null, "10 pontos");
                break;

            case "2":
                JOptionPane.showMessageDialog(null, "20 pontos");
                break;

            case "3":
                JOptionPane.showMessageDialog(null, "30 pontos");
                break;

            case "4":
                JOptionPane.showMessageDialog(null, "40 pontos");
                break;

            case "5":
                JOptionPane.showMessageDialog(null, "50 pontos");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opcao invalida");
        }
    }
}
