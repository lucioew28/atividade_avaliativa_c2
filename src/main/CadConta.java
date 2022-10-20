package main;

import java.util.ArrayList;



public class CadConta implements Vetor{
	
	private ArrayList<Conta> vetConta;
	
	public CadConta() {
		vetConta = new ArrayList<Conta>();
	}
	
	@Override
	public int getTamanho() {
		return vetConta.size();
	}

	@Override
	public Conta getConta(int pos) {
		return vetConta.get(pos);
	}

	@Override
	public boolean insere(Conta conta) {
		if(vetConta.add(conta)) {
			return true;
		}
		return false;
	}
}
