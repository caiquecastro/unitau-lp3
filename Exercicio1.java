import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String args[]) {
		int quantidade;
		float media=0, numeros[], maior=0, menor=0, diff=0, menor_diff=0;
		StringBuilder proximos = new StringBuilder();
		
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números: "));
		numeros = new float[quantidade];
		for(int i = 0; i < quantidade; i++) {
			numeros[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero #" + i));
			if(i == 0) {
				maior = menor = numeros[0];
			}
			media += numeros[i];
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
			if(numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		media /= quantidade;
		for(int i=0;i < quantidade; i++) {
			if(i==0) {
				diff = media-numeros[0];
				if(diff<0) {
					diff *= -1;
				}
				menor_diff = diff;
				proximos.append(numeros[i]);
			} else {
				diff = numeros[i]-media;
				if(diff<0) {
					diff *= -1;
				}
				if(diff < menor_diff) {
					menor_diff = diff;
					proximos.setLength(0);
					proximos.append(numeros[i]);
				} else if(diff == menor_diff) {
					proximos.append(", " + numeros[i]);
				}
			}
		}
		JOptionPane.showMessageDialog(null, "O valor médio é: " + media);
		JOptionPane.showMessageDialog(null, "O maior valor é: " + maior);
		JOptionPane.showMessageDialog(null, "O menor valor é: " + menor);
		JOptionPane.showMessageDialog(null, "Os números mais próximos da média são: " + proximos);
	}
}
