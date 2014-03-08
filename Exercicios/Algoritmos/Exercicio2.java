import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int valor;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o valor para n inicial: ");
		valor = in.nextInt();
		System.out.println(valor);
		while(valor > 1) {
			if(valor%2 == 1) {
				valor = (3 * valor) + 1;
			} else {
				valor = valor / 2;
			}
			System.out.println(valor);
		}
		System.out.print("\n");
	}
}