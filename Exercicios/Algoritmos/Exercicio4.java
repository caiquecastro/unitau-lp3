import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		int[] vetor;
		int tamanho, maior, soma, inicio=0, fim=0, step, i, j, k;
		Scanner in = new Scanner(System.in);

		System.out.print("Digite o tamanho do vetor: ");
		tamanho = in.nextInt();
		vetor = new int[tamanho];

		for(i = 0; i < tamanho; i++) {
			System.out.print("Digite o elemento do vetor: ");
			vetor[i] = in.nextInt();
		}

		maior = vetor[0];
		step = 0;

		for(i = 0; i < tamanho; i++) {
			for(j = 0; j < tamanho-step; j++) {
				soma = 0;
				for(k = j; k <= j+step; k++) {
					soma += vetor[k];
					//System.out.print(" + " + vetor[k]);
				}
				//System.out.println(" = " + soma);
				if(soma > maior) {
					inicio = j;
					fim = k-1;
					maior = soma;
					//System.out.println(maior);
				}
			}
			step++;
		}
		System.out.println("A maior sequencia é " + maior);
		System.out.println("A maior sequencia vai de " + vetor[inicio] + " até " + vetor[fim]);
	}
}