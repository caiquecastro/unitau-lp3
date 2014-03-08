public class CirculoApp {
	public static void main(String[] args) {
		Circulo a = new Circulo(3, 5, 9);
		a.setX(10);
		a.setY(20);
		a.setR(3);
		a.mover(-5, 3);
		a.mudarTamanho(-1);
		//System.out.println("A = " + a);

		Circulo vetor[] = new Circulo[100];

		long start, end;

		start = System.currentTimeMillis();
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = new Circulo(i, i+5, i+1);
			System.out.println(vetor[i]);
		}
		end = System.currentTimeMillis();

		Circulo novoVetor[] = new Circulo[100];
		System.out.println(end-start);

		start = System.currentTimeMillis();

		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = new Circulo(i, i+5, i+1);
		}
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		end = System.currentTimeMillis();

		System.out.println(end-start);
	}
}