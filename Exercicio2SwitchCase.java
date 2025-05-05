import javax.swing.*;

public class Exercicio2SwitchCase {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        double num1 = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
        double num2 = Double.parseDouble(input2);

        String operacao = JOptionPane.showInputDialog("Digite a operação (+, -, *, /):");

        double resultado;
        String mensagem;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            case "/":
                if (num2 == 0) {
                   JOptionPane.showMessageDialog(null, "Erro, divisao por zero");
                } else {
                    resultado = num1 / num2;
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação invalida");
        }
    }
}
