/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author cleys
 */
public class Endereco {
	private Long id;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;

	public Endereco() {
	}

	public Endereco(Builder builder) {
		this.id = builder.id;
		this.logradouro = builder.logradouro;
		this.numero = builder.numero;
		this.bairro = builder.bairro;
		this.cidade = builder.cidade;
		this.estado = builder.estado;
		this.cep = builder.cep;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public static class Builder {
		private Long id;
		private String logradouro;
		private String numero;
		private String bairro;
		private String cidade;
		private String estado;
		private String cep;

		public Builder setId(Long id) {
			this.id = id;
			return this;
		}
		
		public Builder setLogradouro(String logradouro) {
			this.logradouro = logradouro;
			return this;
		}

		public Builder setNumero(String numero) {
			this.numero = numero;
			return this;
		}

		public Builder setBairro(String bairro) {
			this.bairro = bairro;
			return this;
		}

		public Builder setCidade(String cidade) {
			this.cidade = cidade;
			return this;
		}

		public Builder setEstado(String estado) {
			this.estado = estado;
			return this;
		}

		public Builder setCep(String cep) {
			this.cep = cep;
			return this;
		}

		public Endereco build() {
			return new Endereco(this);
		}

	}
}
