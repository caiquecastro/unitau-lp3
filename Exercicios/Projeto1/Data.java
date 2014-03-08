public class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data() {
		this.dia = 1;
		this.mes = 1;
		this.ano = 1970;
	}

	public void setDia(int d) {
		dia = d;
	}
	public void setMes(int m) {
		mes = m;
	}
	public void setAno(int a) {
		ano = a;
	}
	public int getDia() {
		return this.dia;
	}
	public int getMes() {
		return this.mes;
	}
	public int getAno() {
		return this.ano;
	}
}