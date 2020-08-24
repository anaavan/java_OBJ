package core;

public class funcionario {
	private int numFuncional;
	private String Nome;
	private String cargo;
	private double valorHora;
	private int numHoras;
	
	public funcionario(int numFuncional, String nome, String cargo, double valorHora, int numHoras) {
		super();
		this.numFuncional = numFuncional;
		this.Nome = nome;
		this.cargo = cargo;
		this.valorHora = valorHora;
		this.numHoras = numHoras;
	}
	
	public int getNumFuncional() {
		return numFuncional;
	}
	public void setNumFuncional(int numFuncional) {
		this.numFuncional = numFuncional;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public int getNumHoras() {
		return numHoras;
	}
	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}
	
	

}
