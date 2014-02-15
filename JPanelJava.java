import javax.swing.JOptionPane;
import java.util.Scanner;

public class JPanelJava {
	public static void main(String args[]) {
		int a;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a"));
		JOptionPane.showMessageDialog(null, "O valor que você digitou foi: " + a);
	}
}
