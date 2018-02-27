class TesteModificador {
	public static void main(String[] args) {
		Conta joao = new Conta();
		joao.numero = 123;
		joao.setLimite(100.0);

		joao.deposita(500.0);

		double valorASerSacado = 600;
		joao.saca(valorASerSacado);

		System.out.println(joao.getSaldo());
	}
}