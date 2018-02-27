class Conta {
	int numero;
	Pessoa titular;
	double saldo;
	int agencia;

	void deposita(double valorASerDepositado) {
		this.saldo += valorASerDepositado;
	}

	void saca(double valorASerSacado) {
		if(this.saldo >= valorASerSacado){
			this.saldo -= valorASerSacado;
		} else {
			System.out.println("Operacao negada!");
		}
	}

	void transfere(double valor, Conta destino) {
		this.saldo -= valor;
		destino.saldo += valor;
	}
}

class Pessoa {
	String nome;
	String cpf;
	String dataNascimento;
}

class Programa {
	public static void main(String[] args) {
		Conta mauricio = new Conta();
		mauricio.titular = new Pessoa();
		Conta guilherme = new Conta();

		mauricio.titular.nome = "Mauricio Aniche";
		mauricio.titular.cpf =  "123456789";
		mauricio.titular.dataNascimento = "10/10/1975";

		System.out.println(mauricio.titular.nome);

		
		mauricio.deposita(100.0);
		mauricio.saca(150.0);
		mauricio.transfere(200.0, guilherme);

		guilherme.deposita(200.0);
		
		System.out.println(mauricio.saldo);
	}
}