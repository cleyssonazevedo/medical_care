package com.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ficha {
	private Date data_atendimento;
	private String atestado;
	private Date data_retorno;

	private final SimpleDateFormat format;
	public Ficha(Date data_atendimento, String atestado, Date data_retorno) {
		// TODO Auto-generated constructor stub
		this.data_atendimento = data_atendimento;
		this.atestado = atestado;
		this.data_retorno = data_retorno;
		
		format = new SimpleDateFormat("dd/MM/yyyy");
	}
	
	public String getData_atendimento() {
		return format.format(data_atendimento);
	}

	public void setData_atendimento(Date data_atendimento) {
		this.data_atendimento = data_atendimento;
	}

	public String getAtestado() {
		return atestado;
	}

	public void setAtestado(String atestado) {
		this.atestado = atestado;
	}

	public String getData_retorno() {
		return format.format(data_retorno);
	}

	public void setData_retorno(Date data_retorno) {
		this.data_retorno = data_retorno;
	}

}
