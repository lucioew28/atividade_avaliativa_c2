package main;

public class ContaEspecial extends Conta {
	
	private double limite;

	public ContaEspecial(String nome, String cpf) {
		super(nome, cpf);
		this.limite = 0;
	}
	
	public ContaEspecial(String nome, String cpf, double limite) {
		super(nome, cpf);
		this.limite = limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getLIminte() {
		return this.limite;
	}
	
	@Override
	public double saldo() {
		double valor = super.saldo();
		return valor + this.limite;
	}
}
