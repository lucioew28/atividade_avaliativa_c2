package main;

public class ContaEspecial extends Conta {
	
	private double limite;
	
	public ContaEspecial(String nome, String cpf, int numero, double limite) {
		super(nome, cpf, numero);
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
	

	@Override
	public String toString() {
		return "Conta Especial " + 
				"nome: " + super.getNome() + 
				"cpf: " + super.getCpf() + 
				"saldo: " + this.saldo() + 
				"numero: " + super.getNumero() +
				"limite: " + this.getLIminte();
	}

}
