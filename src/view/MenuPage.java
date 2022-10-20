package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import main.CadConta;
import main.Conta;
import main.ContaEspecial;

public class MenuPage implements ActionListener{
	Color dangerColor = new Color(210,100,102);
	
	//helpers
	public boolean validaCampos(JTextField[] campos, JLabel mensagem) {
		boolean pass = true;
		
		for(int i = 0; i < campos.length; i++) {
			if(campos[i].getText().length() == 0) {
				campos[i].setBackground(dangerColor);
				pass = false;
			}else {
				campos[i].setBackground(Color.white);
			}
		}
		
		if(pass == true) {
			mensagem.setForeground(Color.black);
			return true;
		}else {
			mensagem.setForeground(dangerColor);
			return false;
		}
	}
	
	public int pesquisaConta(JTextField numeroConta) {
		int tam = arrConta.getTamanho();
		int num = Integer.parseInt(numeroConta.getText());
		
		for(int i=0; i < tam; i++) {
			if(num == arrConta.getConta(i).getNumero()) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	//vetor de contas
	CadConta arrConta = new CadConta();
	
	//cadastro
	JLabel labelNome = new JLabel("Nome*");
	JTextField cadNome = new JTextField();
	
	JLabel labelCPF = new JLabel("CPF*");
	JTextField cadCPF = new JTextField();
	
	JLabel labelNumero = new JLabel("Numero*");
	JTextField cadNumero = new JTextField();
	
	JLabel labelLimite = new JLabel("Limite:");
	JTextField cadLimite = new JTextField();
	
	JButton confirmCad = new JButton("Confirmar Cadastro");
	
	JLabel cadMensagem = new JLabel("*Campos obrigadorios");
	
	//saldo
	JLabel labelNumConta = new JLabel("Número da conta*");
	JTextField pesqNumConta = new JTextField();
	
	JButton consultSaldo = new JButton("Cosultar");
	
	JLabel foundMensage = new JLabel("*Campos obrigadorios");
	
	//saque
	JLabel sacNumConta = new JLabel("Número da conta*");
	JTextField sacPesqConta = new JTextField();
	
	JLabel sacValorLabel = new JLabel("Valor*");
	JTextField sacValor = new JTextField();
	
	JButton sacar = new JButton("Sacar");
	
	JLabel sacMensage = new JLabel("*Campos obrigadorios");
	
	//deposito
	JLabel depNumConta = new JLabel("Número da conta*");
	JTextField depPesqConta = new JTextField();
	
	JLabel depValorLabel = new JLabel("Valor*");
	JTextField depValor = new JTextField();
	
	JButton depositar = new JButton("Depositar");
	
	JLabel depMensage = new JLabel("*Campos obrigadorios");
	
	//transferir
	JLabel transfNumConta = new JLabel("Número da conta*");
	JTextField transfPesqConta = new JTextField();
	
	JLabel transfNumContaDestino = new JLabel("Número da conta destino*");
	JTextField transfPesqContaDestino = new JTextField();
	
	JLabel transfValorLabel = new JLabel("Valor*");
	JTextField transfValor = new JTextField();
	
	JButton transferir = new JButton("Transferir");
	
	JLabel transfMensage = new JLabel("*Campos obrigadorios");
	
	//rest
	JLabel restTitle = new JLabel("Trabalho POO");
	JLabel restName1 = new JLabel("- Lúcio Ewald do Nascimento");
	JLabel restName2 = new JLabel("- Gustavo Trovoada");
	JLabel restName3 = new JLabel("- Jhony Rodrigues");

	
	
	
	
	
	JPanel panelCadastro = new JPanel();
	JPanel panelSaldo = new JPanel();
	JPanel panelSaque = new JPanel();
	JPanel panelDeposito = new JPanel();
	JPanel panelTransferencia = new JPanel();
	JPanel panelRest = new JPanel();
	
	JFrame frame = new JFrame();
	JButton btnCadastro = new JButton("1. Cadastrar Conta");
	JButton btnSaldo = new JButton("2. Saldo");
	JButton btnSaque = new JButton("3. Saque");
	JButton btnDeposito = new JButton("4. Depósito");
	JButton btnTransf = new JButton("5. Transferência");
	JButton btnSair = new JButton("6. Sair");
	
	public MenuPage() {
		//cadastro
		labelNome.setBounds(90, 5, 100, 40);
		cadNome.setBounds(90, 35, 290, 30);
		
		labelCPF.setBounds(90, 75, 100, 40);
		cadCPF.setBounds(90, 105, 290, 30);
		
		labelNumero.setBounds(90, 145, 100, 40);
		cadNumero.setBounds(90, 175, 140, 30);
		
		labelLimite.setBounds(240, 145, 100, 40);
		cadLimite.setBounds(240, 175, 140, 30);
		
		confirmCad.setBounds(91, 250, 200, 40);
		confirmCad.setFocusable(false);
		confirmCad.addActionListener(this);
		
		cadMensagem.setBounds(90,290,300,40);
		
		//saldo
		labelNumConta.setBounds(90, 5, 200, 40);
		pesqNumConta.setBounds(90, 35, 200, 30);
		
		consultSaldo.setBounds(300, 35, 120, 30);
		consultSaldo.setFocusable(false);
		consultSaldo.addActionListener(this);
		
		foundMensage.setBounds(90,80,300,40);
		
		//saque
		sacNumConta.setBounds(90, 5, 200, 40);
		sacPesqConta.setBounds(90, 35, 290, 30);
		
		sacValorLabel.setBounds(90, 75, 100, 40);
		sacValor.setBounds(90, 105, 140, 30);
		
		sacar.setBounds(235, 105, 145, 30);
		sacar.setFocusable(false);
		sacar.addActionListener(this);
		
		sacMensage.setBounds(90,150,300,40);
		
		//deposito
		depNumConta.setBounds(90, 5, 200, 40);
		depPesqConta.setBounds(90, 35, 290, 30);
		
		depValorLabel.setBounds(90, 75, 100, 40);
		depValor.setBounds(90, 105, 140, 30);
		
		depositar.setBounds(235, 105, 145, 30);
		depositar.setFocusable(false);
		depositar.addActionListener(this);
		
		depMensage.setBounds(90,150,300,40);
		
		//transferir
		transfNumConta.setBounds(90, 5, 200, 40);
		transfPesqConta.setBounds(90, 35, 290, 30);
		
		transfNumContaDestino.setBounds(90, 75, 200, 40);
		transfPesqContaDestino.setBounds(90, 105, 290, 30);
		
		transfValorLabel.setBounds(90, 145, 100, 40);
		transfValor.setBounds(90, 175, 140, 30);
		
		transferir.setBounds(235, 175, 145, 30);
		transferir.setFocusable(false);
		transferir.addActionListener(this);
		
		transfMensage.setBounds(90,200,300,40);
		
		//rest
		restTitle.setBounds(90, 120, 260, 40);
		restName1.setBounds(90, 140, 260, 40);
		restName2.setBounds(90, 160, 260, 40);
		restName3.setBounds(90, 180, 260, 40);
		
		
		
		
		//botoes
		btnCadastro.setBounds(30, 30, 200, 40);
		btnCadastro.setFocusable(false);
		btnCadastro.addActionListener(this);
		
		btnSaldo.setBounds(30, 80, 200, 40);
		btnSaldo.setFocusable(false);
		btnSaldo.addActionListener(this);
		
		btnSaque.setBounds(30, 130, 200, 40);
		btnSaque.setFocusable(false);
		btnSaque.addActionListener(this);
		
		btnDeposito.setBounds(30, 180, 200, 40);
		btnDeposito.setFocusable(false);
		btnDeposito.addActionListener(this);
		
		btnTransf.setBounds(30, 230, 200, 40);
		btnTransf.setFocusable(false);
		btnTransf.addActionListener(this);
		
		btnSair.setBounds(30, 280, 200, 40);
		btnSair.setFocusable(false);
		btnSair.addActionListener(this);
		
		//panel cadastro
		panelCadastro.add(labelNome);
		panelCadastro.add(cadNome);
		
		panelCadastro.add(labelCPF);
		panelCadastro.add(cadCPF);
		
		panelCadastro.add(labelNumero);
		panelCadastro.add(cadNumero);
		
		panelCadastro.add(labelLimite);
		panelCadastro.add(cadLimite);
		
		panelCadastro.add(confirmCad);
		
		panelCadastro.add(cadMensagem);
		
		Color color = new Color(191, 191, 191);
	    panelCadastro.setBackground(color);
		panelCadastro.setBounds(260, 0, 440,420);
		panelCadastro.setVisible(false);
		panelCadastro.setLayout(null);
		
		
		//panel saldo
		panelSaldo.add(labelNumConta);
		panelSaldo.add(pesqNumConta);
		
		panelSaldo.add(consultSaldo);
		
		panelSaldo.add(foundMensage);
		
		panelSaldo.setBackground(color);
		panelSaldo.setBounds(260, 0, 440,420);
		panelSaldo.setVisible(false);
		panelSaldo.setLayout(null);
		
		
		//panel saque
		panelSaque.add(sacNumConta);
		panelSaque.add(sacPesqConta);
		
		panelSaque.add(sacValorLabel);
		panelSaque.add(sacValor);
		
		panelSaque.add(sacar);
		
		panelSaque.add(sacMensage);
		
		panelSaque.setBackground(color);
		panelSaque.setBounds(260, 0, 440,420);
		panelSaque.setVisible(false);
		panelSaque.setLayout(null);
		
		
		//panel deposito
		panelDeposito.add(depNumConta);
		panelDeposito.add(depPesqConta);
		
		panelDeposito.add(depValorLabel);
		panelDeposito.add(depValor);
		
		panelDeposito.add(depositar);
		
		panelDeposito.add(depMensage);
		
		panelDeposito.setBackground(color);
		panelDeposito.setBounds(260, 0, 440,420);
		panelDeposito.setVisible(false);
		panelDeposito.setLayout(null);
		
		
		//panel transferencia
		panelTransferencia.add(transfNumConta);
		panelTransferencia.add(transfPesqConta);
		
		panelTransferencia.add(transfNumContaDestino);
		panelTransferencia.add(transfPesqContaDestino);
		
		panelTransferencia.add(transfValorLabel);
		panelTransferencia.add(transfValor);
		
		panelTransferencia.add(transferir);
		
		panelTransferencia.add(transfMensage);
		
		panelTransferencia.setBackground(color);
		panelTransferencia.setBounds(260, 0, 440,420);
		panelTransferencia.setVisible(false);
		panelTransferencia.setLayout(null);
		
		
		//panelRest
		panelRest.add(restTitle);
		panelRest.add(restName1);
		panelRest.add(restName2);
		panelRest.add(restName3);
		
		panelRest.setBackground(color);
		panelRest.setBounds(260, 0, 440,420);
		panelRest.setLayout(null);
	
		
		//frame
		frame.add(panelCadastro);
		frame.add(panelSaldo);
		frame.add(panelSaque);
		frame.add(panelDeposito);
		frame.add(panelTransferencia);
		frame.add(panelRest);
		
		frame.add(btnCadastro);
		frame.add(btnSaldo);
		frame.add(btnSaque);
		frame.add(btnDeposito);
		frame.add(btnTransf);
		frame.add(btnSair);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//main menu
		if(e.getSource()==btnCadastro) {
			System.out.println("cadastro");
			panelCadastro.setVisible(true);
			panelSaldo.setVisible(false);
			panelSaque.setVisible(false);
			panelDeposito.setVisible(false);
			panelTransferencia.setVisible(false);
			panelRest.setVisible(false);
		}
		if(e.getSource()==btnSaldo) {
			System.out.println("saldo");
			panelCadastro.setVisible(false);
			panelSaldo.setVisible(true);
			panelSaque.setVisible(false);
			panelDeposito.setVisible(false);
			panelTransferencia.setVisible(false);
			panelRest.setVisible(false);
		}
		if(e.getSource()==btnSaque) {
			System.out.println("sacar");
			panelCadastro.setVisible(false);
			panelSaldo.setVisible(false);
			panelSaque.setVisible(true);
			panelDeposito.setVisible(false);
			panelTransferencia.setVisible(false);
			panelRest.setVisible(false);
		}
		if(e.getSource()==btnDeposito) {
			System.out.println("deposito");
			panelCadastro.setVisible(false);
			panelSaldo.setVisible(false);
			panelSaque.setVisible(false);
			panelDeposito.setVisible(true);
			panelTransferencia.setVisible(false);
			panelRest.setVisible(false);
		}
		if(e.getSource()==btnTransf) {
			System.out.println("transferir");
			panelCadastro.setVisible(false);
			panelSaldo.setVisible(false);
			panelSaque.setVisible(false);
			panelDeposito.setVisible(false);
			panelTransferencia.setVisible(true);
			panelRest.setVisible(false);
		}
		if(e.getSource()==btnSair) {
			System.out.println("sair");
			frame.dispose();
		}
		
		
		
		
		
		//cadastro
		if(e.getSource()==confirmCad) {
		
			String nome = cadNome.getText();
			String cpf = cadCPF.getText();
			String limite = cadLimite.getText();
			String numero = cadNumero.getText();
			
			//valida campos
			if(nome.length() == 0) {
				cadNome.setBackground(dangerColor);
			}else {
				cadNome.setBackground(Color.white);
			}
			
			if(cpf.length() == 0) {
				cadCPF.setBackground(dangerColor);
			}else {
				cadCPF.setBackground(Color.white);
			}
			
			if(numero.length() == 0) {
				cadNumero.setBackground(dangerColor);
			}else {
				cadNumero.setBackground(Color.white);
			}
			
			boolean difConta = true;
			
			if(arrConta.getTamanho() > 0) {
				for(int i=0; i < arrConta.getTamanho(); i++) {
					if(arrConta.getConta(i).getNumero() == Integer.parseInt(numero)) {
						difConta = false;
						cadMensagem.setText("*Já existe uma conta com esse número");
					}
				}
			}
			
			
			
			Conta conta;
			ContaEspecial contaEspecial;
			if(nome.length() != 0 && cpf.length() != 0 && numero.length() != 0 && difConta == true) {
				if(limite.length() == 0) {
					conta = new Conta(nome, cpf, Integer.parseInt(numero));
					arrConta.insere(conta);
				} else {
					contaEspecial = new ContaEspecial(nome, cpf, Integer.parseInt(numero), Double.parseDouble(limite));
					arrConta.insere(contaEspecial);
				}
				cadMensagem.setText("*Campos obrigadorios");
				
			}
			
			for(int i=0; i < arrConta.getTamanho(); i++) {
				System.out.println(arrConta.getConta(i).toString());
			}
			
			System.out.println(arrConta.getTamanho());
		
			//reset text fiels
			cadNome.setText("");
			cadCPF.setText("");
			cadNumero.setText("");
			cadLimite.setText("");			
		}
		
		//saldo
		if(e.getSource() == consultSaldo) {
			JTextField[] campos = new JTextField[]{pesqNumConta};
			int tam = arrConta.getTamanho();
			
			//valida campos
			boolean valida = validaCampos(campos,foundMensage);
			System.out.println(valida);
			
			if(valida == true) {
				//pesquisa conta
				int pesquisa = pesquisaConta(pesqNumConta);
				System.out.println(pesquisa);
				
				if(pesquisa != -1) {
					System.out.println(arrConta.getConta(pesquisa).saldo());
				}
			}
		}
		
		
		//saque
		if(e.getSource() == sacar) {
			JTextField[] campos = new JTextField[]{sacPesqConta,sacValor};
			int tam = arrConta.getTamanho();
			
			//valida campos
			boolean valida = validaCampos(campos,sacMensage);
			System.out.println(valida);
			
			if(valida == true) {
				//pesquisa conta
				int pesquisa = pesquisaConta(sacPesqConta);
				System.out.println(pesquisa);
				
				if(pesquisa != -1) {
					System.out.println(arrConta.getConta(pesquisa).saldo());
					System.out.println(arrConta.getConta(pesquisa).saque(Integer.parseInt(sacValor.getText())));
					System.out.println(arrConta.getConta(pesquisa).saldo());
				}
			}
		}
		
		
		//deposito
		if(e.getSource() == depositar) {
			JTextField[] campos = new JTextField[]{depPesqConta,depValor};
			int tam = arrConta.getTamanho();
			
			//valida campos
			boolean valida = validaCampos(campos,depMensage);
			System.out.println(valida);
			
			if(valida == true) {
				//pesquisa conta
				int pesquisa = pesquisaConta(depPesqConta);
				System.out.println(pesquisa);
				
				if(pesquisa != -1) {
					System.out.println(arrConta.getConta(pesquisa).saldo());
					arrConta.getConta(pesquisa).deposito(Double.parseDouble(depValor.getText()));
					System.out.println(arrConta.getConta(pesquisa).saldo());
				}
			}
		}
		
		//transferir
		if(e.getSource() == transferir) {
			JTextField[] campos = new JTextField[]{transfPesqConta, transfValor, transfPesqContaDestino};
			int tam = arrConta.getTamanho();
			
			//valida campos
			boolean valida = validaCampos(campos,transfMensage);
			System.out.println(valida);
			
			if(valida == true) {
				//pesquisa conta
				int pesquisa = pesquisaConta(transfPesqConta);
				int pesquisaDestino = pesquisaConta(transfPesqContaDestino);
				
				System.out.println(pesquisa);
				System.out.println(pesquisaDestino);
				
				if(pesquisa != -1 && pesquisaDestino != -1) {
					System.out.println(arrConta.getConta(pesquisa).saldo());
					System.out.println(arrConta.getConta(pesquisaDestino).saldo());
					
					arrConta.getConta(pesquisa).transferencia(Double.parseDouble(transfValor.getText()), arrConta.getConta(pesquisaDestino));
					
					System.out.println(arrConta.getConta(pesquisa).saldo());
					System.out.println(arrConta.getConta(pesquisaDestino).saldo());
				}
			}
		}
	}
}
