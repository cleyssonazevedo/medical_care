/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.Endereco;
import com.model.Ficha;
import com.model.Identificacao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import com.model.Paciente;

/**
 *
 * @author cleys
 */
public class PacienteService {

    final String DRIVER = "com.mysql.jdbc.Driver";
    final String URL = "jdbc:mysql://localhost:3306/medical?autoReconnect=true&useSSL=false";

    public PacienteService() { }

    private Connection getConnection() throws Exception {
        Class.forName(this.DRIVER);
        return DriverManager.getConnection(this.URL, "root", "root");
    }

    public List<Paciente> getPacientes() {
        try {
            Connection con = this.getConnection();
            String sql = "SELECT ident, nome, cpf, sexo FROM paciente";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet result = statement.executeQuery();

            List<Paciente> pacientes = new ArrayList<Paciente>();
            while (result.next()) {
                Paciente paciente = new Paciente.Builder()
                        .setId(result.getLong("ident"))
                        .setNome(result.getNString("nome"))
                        .setCPF(result.getNString("cpf"))
                        .setSexo(result.getNString("sexo"))
                        .build();
                
                pacientes.add(paciente);
            }
            
            result.close();
            statement.close();
            con.close();
            
            return pacientes;
        } catch (Exception e) {
        	e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha ao tentar conectar com o Banco", "Falha", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    /**
     * 
     * @param iden
     * @param opcao 0 para salvar e 1 para editar
     * @return
     * @throws Exception
     */
    public boolean save(Identificacao iden, int opcao) throws Exception {
        try {
			Connection con = this.getConnection();
			String sql = "{CALL sp_inserirPaciente (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
			CallableStatement statement = con.prepareCall(sql);
			statement.setString(1, iden.getNome());
			statement.setString(2, iden.getNaturalidade());
			statement.setString(3, iden.getSexo());
			statement.setString(4, iden.getCpf());
			statement.setString(5, iden.getEndereco().getLogradouro());
			statement.setString(6, iden.getEndereco().getNumero());
			statement.setString(7, iden.getEndereco().getBairro());
			statement.setString(8, iden.getEndereco().getCidade());
			statement.setString(9, iden.getEndereco().getEstado());
			statement.setString(10, iden.getEndereco().getCep());
			statement.setLong(12, iden.getId());
			
			statement.setInt(11, opcao);
			
			statement.executeQuery();
			JOptionPane.showMessageDialog(null, "Dados Salvos", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Falha ao salvar dados", "Erro", JOptionPane.ERROR_MESSAGE);
			return false;
		}
    }

    public Identificacao getPaciente(Long id) throws Exception {
    	try {
			Connection con = this.getConnection();
			String sql = "SELECT * FROM paciente p INNER JOIN endereco e ON p.id_endereco = e.id WHERE ident = ?";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setLong(1, id);
			
			ResultSet result = statement.executeQuery();
    		try {
    			if (result.next()) {
            		return new Identificacao.Builder()
            				.setId(result.getLong("ident"))
            				.setNome(result.getString("nome"))
            				.setNaturalidade(result.getString("naturalidade"))
            				.setCPF(result.getString("cpf"))
            				.setSexo(result.getString("sexo"))
            				.setEndereco(new Endereco.Builder()
            						.setId(result.getLong("id"))
            						.setLogradouro(result.getString("logradouro"))
            						.setNumero(result.getString("numero"))
            						.setBairro(result.getString("bairro"))
            						.setCidade(result.getString("cidade"))
            						.setEstado(result.getString("estado"))
            						.setCep(result.getString("cep"))
            							.build()
            				)
            				.build();
        		} else {
        			throw new Exception("Não Encontrado Registro");
        		}
			} finally {
				// : handle finally clause
				result.close();
				statement.close();
				con.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Falha ao busca Paciente", "Falha", JOptionPane.ERROR_MESSAGE);
			throw e;
		}
    }

    public List<Ficha> getFichas(Long id) throws Exception {
    	Connection con = this.getConnection();
    	String sql = "SELECT * FROM ficha WHERE id_paciente_ficha = ?";
    	PreparedStatement statement = con.prepareStatement(sql);
    	statement.setLong(1, id);
    	
    	ResultSet result = statement.executeQuery();
    	List<Ficha> fichas = new ArrayList<>();
    	
    	try {
    		while(result.next()) {
        		fichas.add(
        			new Ficha(
        					result.getDate("data_atendimento"),
        					result.getString("atestado"),
        					result.getDate("data_retorno")
        			)
        				
        		);
        	}
        	
        	return fichas;
		} finally {
			// TODO: handle finally clause
			result.close();
			statement.close();
			con.close();
		}
    }

}
