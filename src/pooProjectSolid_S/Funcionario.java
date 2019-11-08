package pooProjectSolid_S;

public class Funcionario {

	private String nome;
	private Cargo cargo;
	private double salarioBase;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String nome, Cargo cargo, double salarioBase) {
		this.nome = nome;
		this.cargo = cargo;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}


}
