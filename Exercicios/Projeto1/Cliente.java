import java.util.*;

public class Cliente {
	private String nome;
	private String rg;
	private Data cadastro;
	private Data desligamento;

	public Cliente() {
		Calendar calendario	 = new GregorianCalendar();

		System.out.println("HOJE: " + calendario);

		nome = "";
		rg = "";

		//cadastro.dia = 	
		desligamento = null;
	}

	public void setNome(String n) {
		nome = n;
	}
	public void setRg(String r) {
		rg = r;
	}
	public void setDataCadastro(Data c) {
		cadastro = c;
	}
	public void setDataDesligamento(Data d) {
		desligamento = d;
	}
	public String getNome() {
		return this.nome;
	}
	public String getRg() {
		return this.rg;
	}
	public Data getDataCadastro() {
		return this.cadastro;
	}
	public Data getDataDesligamento() {
		return this.desligamento;
	}
}