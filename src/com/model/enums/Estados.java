package com.model.enums;

public enum Estados {
	 AC(1), // Acre
	 AL(2), // Alagoas
	 AP(3), // Amapá
	 AM(4), // Amazonas
	 BA(5), // Bahia
	 CE(6), // Ceará
	 DF(7), // Distrito Federal
	 ES(8), // Espírito Santo
	 GO(9), // Goiás
	 MA(10), // Maranhão
	 MT(11), // Mato Grosso
	 MS(12), // Mato Grosso do Sul
	 MG(13), // Minas Gerais
	 PA(14), // Pará
	 PB(15), // Paraíba
	 PR(16), // Paraná
	 PE(17), // Pernambuco
	 PI(18), // Piauí
	 RR(19), // Roraima
	 RO(20), // Rondônia
	 RJ(20), // Rio de Janeiro
	 RN(21), // Rio Grande do Norte
	 RS(22), // Rio Grande do Sul
	 SC(23), // Santa Catarina
	 SP(24), // São Paulo
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
