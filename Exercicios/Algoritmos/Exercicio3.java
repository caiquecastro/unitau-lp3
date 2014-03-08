import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		int n, i, j, valor = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite um valor para n: ");
		n = in.nextInt();
		for(i=1;i<=n;i++) {
			valor += i;
			//System.out.println("T" + i + " = " + valor);
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}