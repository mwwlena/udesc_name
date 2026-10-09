package calculadora;

import javax.swing.*;

public class testaCalculadora {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();

        System.out.println("Soma: "+calc.somar(50, 100));
        System.out.println("Subtração: "+calc.subtrair(100, 50));
        System.out.println("Produto: "+calc.multiplicar(50, 100));
        System.out.println("Quociente: "+calc.dividir(100, 50));

        do {
            String numero1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
            String numero2 = JOptionPane.showInputDialog("Digite o segundo número: ");

            if (numero1 == null || numero2 == null) {
                System.exit(0);
            } else if (numero1.equals("") || numero2.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Erro na entrada dos dados. Digite novamente: ");
            } else {
                double num1 = Double.parseDouble(numero1);
                double num2 = Double.parseDouble(numero2);
                double total = calc.somar(num1, num2);

                JOptionPane.showMessageDialog(null, "Resultado: " + total);
            }
        }while(true);
        //JOptionPane.showMessageDialog(null,total);

    }
}