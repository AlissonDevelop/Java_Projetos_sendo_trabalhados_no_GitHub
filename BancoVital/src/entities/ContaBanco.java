package entities;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String titular;
	private double saldo;
	private boolean status;
	
	public void extrato() {
		System.out.println("==================EXTRATO==================");		
		System.out.println("Conta  " + this.getNumConta());
		System.out.println("Tipo   " + this.getTipo());
		System.out.println("Tiular " + this.getTitular());
		System.out.println("Saldo  " + this.getSaldo());
		System.out.println("Status " + this.getStatus());
		System.out.println("===========================================");
	}	

	public void abrirConta(String tip) {
		this.setTipo(tip);
		this.setStatus(true);
		if ("CC".equals(tip)) {
			this.setSaldo(50);
		}
		else if ("CP".equals(tip)) {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!!!");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0 ) {
			System.out.println("A conta não pode ser fechada porque ainda tem saldo!!!");
		}
		else if (this.getSaldo() < 0) {
			System.out.println("A conta não pode ser fechada porque o saldo esta negativo!!!");
		}
		else {
			this.setStatus(false);
			System.out.println("Conta fechada com Sucesso!!!");
		}
	}

	public void depositar(double val) {
		if (this.getStatus()) {
			//this.saldo = this.saldo + val;
			this.setSaldo(this.getSaldo() + val);
			System.out.println("Deposito realizado na conta de " + this.getTitular());
		}
		else {
			System.out.println("Impossivel depositar em uma conta inexistente!");
		}
	}

	public void sacar(double val) {
		if (this.getStatus()) {
			if (this.getSaldo() >= val) {
				this.setSaldo(this.getSaldo() - val);
				System.out.println("Saque realizado com sucesso na comta de " + this.getTitular());
			}
		}
		else {
			System.out.println("Impossivel sacar em uma conta fechada!!");
		}
	}

	public void pagarMensal() {
		double val = 0;
		if (this.getTipo() == "CC") {
			val = 12;			
		}
		else if (this.getTipo() == "CC") {
			val = 10;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - val);
			System.out.println("Mensalidade paga com sucesso por " + this.getTitular());
		}
		else {
			System.out.println("Impossivel pagar uma conta fechada!!!");
		}
	}
	
	
	
	//METODO CONSTTRUTOR
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}	
	
	
	
	
	
	
	
}
