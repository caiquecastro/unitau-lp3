import java.util.Scanner;

public class ScannerPrint {
	public static void main(String args[]) {
		int valor;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite um número: ");
		valor = in.nextInt();
		System.out.println("O valor que você digitou foi: ");
		System.out.printf("%d\n", valor);
	}
}
