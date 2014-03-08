import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		int tamanho, maior, soma, inicio=0, fim=0;
		Scanner in = new Scanner(System.in);

		System.out.print("Digite o tamanho da sequencia: ");
		tamanho = in.nextInt();

		int[] vetor = new int[tamanho];

		for(int i = 0; i < tamanho; i++) {
			System.out.print("Digite elemento #" + (i+1) + " da sequencia: ");
			vetor[i] = in.nextInt();
		}

		maior = vetor[0];

		for(int i = 0; i < tamanho; i++) {
			soma = 0;
			for(int j = i; j < tamanho; j++) {
				soma += vetor[j];
				if(soma > maior) {
					inicio = i;
					fim = j;
					maior = soma;
				}
			}
		}
		System.out.println("A maior sequencia é " + maior);
		System.out.println("A maior sequencia vai de " + vetor[inicio] + " até " + vetor[fim]);
	}
}