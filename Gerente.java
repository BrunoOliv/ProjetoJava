class Gerente extends Funcionario implements Autenticavel {
	public double getBonus (){
		return this.salario * 0.3;
	}

	public void cobraEntrega() {
		System.out.println("Está pronto?");
	}

	public boolean autentica(int senha) {
		// implementamos a regra aqui
		return false;
	}
}