package com.model.enums;

public enum Estados {
	 AC(1), // Acre
	 AL(2), // Alagoas
	 AP(3), // Amap�
	 AM(4), // Amazonas
	 BA(5), // Bahia
	 CE(6), // Cear�
	 DF(7), // Distrito Federal
	 ES(8), // Esp�rito Santo
	 GO(9), // Goi�s
	 MA(10), // Maranh�o
	 MT(11), // Mato Grosso
	 MS(12), // Mato Grosso do Sul
	 MG(13), // Minas Gerais
	 PA(14), // Par�
	 PB(15), // Para�ba
	 PR(16), // Paran�
	 PE(17), // Pernambuco
	 PI(18), // Piau�
	 RR(19), // Roraima
	 RO(20), // Rond�nia
	 RJ(20), // Rio de Janeiro
	 RN(21), // Rio Grande do Norte
	 RS(22), // Rio Grande do Sul
	 SC(23), // Santa Catarina
	 SP(24), // S�o Paulo
	 SE(25); // Sergipe
	
	private final int id;
	private Estados(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
}
