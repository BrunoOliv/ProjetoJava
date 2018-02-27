class TesteStatic {
	public static void main(String[] args) {
		Conta joao = new Conta();
		System.out.println(joao.getNumero());

		Conta jose = new Conta();
		System.out.println(jose.getNumero());

		System.out.println(Conta.x());
	}
}