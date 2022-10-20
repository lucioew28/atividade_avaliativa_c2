package main;

public class Conta implements Transacao{
	private String nome;
	private String cpf;
	private int numero = 0;
	private double valor_na_conta;
	
	public Conta(String nome, String cpf, int numero) {
		this.nome = nome;
		this.cpf = cpf;
		this.numero = numero;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setCpf(String novoCpf) {
		this.cpf = novoCpf;
	}

	@Override
	public void deposito(double valor) {
		if(valor > 0) {
			this.valor_na_conta += valor;
		}
	}

	@Override
	public boolean saque(double valor) {
		if(valor > this.valor_na_conta) {
			return false;
		}
		this.valor_na_conta -= valor;
		return true;
	}

	@Override
	public double saldo() {
		return this.valor_na_conta;
	}

	@Override
	public boolean transferencia(double valor, Conta outraConta) {
		if(valor > this.valor_na_conta) {
			return false;
		}
		this.saque(valor);
		outraConta.deposito(valor);
		
		return true;
	}
	
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", cpf=" + cpf + ", valor_na_conta=" + valor_na_conta + ", numero=" + numero + "]";
	}

}
