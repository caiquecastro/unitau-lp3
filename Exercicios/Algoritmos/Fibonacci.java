import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String args[]) {
		int n, v1=0, v2=1, v, i;
		String nome;

		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		n = Integer.parseInt(JOptionPane.showInputDialog("Olá, " + nome + ". Digite n: "));
		for(i=0;i<n;i++) {
            v = v1;
            v1 = v2;
            v2 += v;
            System.out.println("- " + v1);
        }
        if(JOptionPane.showConfirmDialog(null, "O valor da sequencia de Fibonacci é: " + v1 + ". Está certo?", "Resposta", JOptionPane.YES_NO_OPTION) == 0) {
        	System.out.println("Você clicou em Sim");
        } else {
        	System.out.println("Você clicou em Não");
        }
	}
}
