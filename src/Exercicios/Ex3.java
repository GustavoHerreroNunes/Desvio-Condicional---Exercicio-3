package Exercicios;

import javax.swing.JOptionPane;

public class Ex3 {
	public static void main (String []args) {
		int D = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia da semana"));
		switch (D) {
		case 0 :JOptionPane.showMessageDialog(null, "Domingo");
		break;
		case 1 :JOptionPane.showMessageDialog(null, "Segunda-feira");
		break;
		case 2 :JOptionPane.showMessageDialog(null, "Terça-feira");
		break;
		case 3 :JOptionPane.showMessageDialog(null, "Quarta-feira");
		break;
		case 4 :JOptionPane.showMessageDialog(null, "Quinta-feira");
		break;
		case 5 :JOptionPane.showMessageDialog(null, "Sexta-feira");
		break;
		case 6 :JOptionPane.showMessageDialog(null, "Sábado");
		break;
		default : JOptionPane.showMessageDialog(null, "Número inválido!!!");
		}
	}

}
