package app;

import main.Conta;
import main.ContaEspecial;

public class App {

	public static void main(String[] args) {
		Conta conta1 = new Conta("lucio ewald", "15900386732");
		Conta conta2 = new Conta("marcos ewald", "15900386732");
		ContaEspecial contaEsp = new ContaEspecial("danilo cardoso", "15900386732",50);

		System.out.println(conta1.getNome());
		System.out.println(conta2.getNome());
		System.out.println(contaEsp.getNome());
	
	
	}
}
