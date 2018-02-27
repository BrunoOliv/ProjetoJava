class Programa {
	public static void main(String[] args) {
		/*
		----------------------------------------------------
		int idadeJoao = 18;
		int idadeMaria = 21;

		int somaDasIdades = idadeJoao + idadeMaria;
		System.out.println(somaDasIdades);

		double pi = 3.1415;
		double dobroDoPi = pi * 2;

		System.out.println(dobroDoPi);

		boolean amigo = true;
		boolean inimigo = !amigo;

		boolean maiorDeIdade = idadeJoao == 18;
		System.out.println(maiorDeIdade);

		char letra = 'M';

		String nomeCompleto = "Joao da Silva";
		System.out.println(nomeCompleto);

		long numeroGrande = 99999999L;
		float outroPi = 31;

		int numero = 10;
		long copiaDeNumero = numero;
		System.out.println(copiaDeNumero);*/

		/*
		----------------------------------------------------
		int idadeVisitante = 60;
		boolean amigoDoDono = true;

		if(idadeVisitante > 60){
			System.out.println("Aproveite a melhor idade!");
		}
		else if(idadeVisitante >= 18  && amigoDoDono){
			System.out.println("Entre na festa!");
		} else {
			System.out.println("Volte pra casa!");
		}*/

		/*for(int i = 1; i <= 100; i++){
			System.out.println("Parabens pelo aniversario no." + i);
		}

		int j = 1;
		while(j <= 100){
			System.out.println("Parabens pelo aniversario no." + j);
			j++;
		}

		int multiplicador = 3;
		for(int i = 0; i < 10; i++){

			if(i % 2 == 0){
				int numeroQualquer = 10;
				System.out.println(i * multiplicador);
				System.out.println(numeroQualquer);
			}
		}*/

		int num = 3;

		switch(num){
			case 1:
				System.out.println("um");
				break;
			case 2:
				System.out.println("dois");
				break;
			default:
				System.out.println("numero grande");
		}
		
	}
} 