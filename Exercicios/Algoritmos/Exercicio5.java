import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		int maior, atual = 0, fim = 0, inicio = 0, i, j, n;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o número de elementos: ");
		n = in.nextInt();
		int[] vetor = new int[n];
		for(i = 0; i < n; i++) {
			System.out.print("Digite o elemento #" + (i+1) + ": ");
			vetor[i] = in.nextInt();
		}
		

		maior = vetor[0];

		for(i = 0; i < vetor.length; i++) {
			atual += vetor[i];
			if(atual > maior) {
				maior = atual;
			}
			if(atual < 0) {
				atual = 0;
			}
		}
		System.out.println("A soma da maior subsequencia é " + maior);
	}
}