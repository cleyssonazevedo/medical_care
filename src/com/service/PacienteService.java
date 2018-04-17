/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

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
    final String URL = "jdbc:mysql://localhost:3306/bd_medical_care?autoReconnect=true&useSSL=false";

    public PacienteService() {

    }

    private Connection getConnection() throws Exception {
        Class.forName(this.DRIVER);
        return DriverManager.getConnection(this.URL, "root", "root");
    }

    public List<Paciente> getPacientes() {
        try {
            Connection con = this.getConnection();
            String sql = "SELECT * FROM paciente p INNER JOIN endereco e ON p.id_endereco = e.id";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet result = statement.executeQuery();

            List<Paciente> pacientes = new ArrayList<>();
            while (result.next()) {
                Paciente paciente = new Paciente.Builder()
                        .setId(result.getLong("id"))
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
            JOptionPane.showMessageDialog(null, "Falha ao tentar conectar com o Banco", "Falha", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void save(Identificacao iden) throws Exception {
        try {
            Connection con = this.getConnection();
            String sql = "INSERT INTO endereco(logradouro, numero, bairro, cidade, estado, cep) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(0, iden.getEndereco().getLogradouro());
            statement.setString(1, iden.getEndereco().getNumero());
            statement.setString(2, iden.getEndereco().getBairro());
            statement.setString(3, iden.getEndereco().getCidade());
            statement.setString(4, iden.getEndereco().getEstado());
            statement.setString(5, iden.getEndereco().getCep());
            
            int affect = statement.executeUpdate();
            if (affect == 0) {
                throw new Exception("Falha ao gravar dados");
            }
            
            try(ResultSet keys = statement.getGeneratedKeys()) {
                if(keys.next()) {
                    Long id = keys.getLong(1);
                    try {
                        sql = "INSERT INTO paciente (nome, naturalidade, sexo, cpf, id_endereco) VALUES (?, ?, ?, ?, ?)";
                        statement = con.prepareStatement(sql);
                        statement.setString(0, iden.getNome());
                        statement.setString(1, iden.getNaturalidade());
                        statement.setString(2, iden.getSexo());
                        statement.setString(3, iden.getCpf());
                        statement.setLong(4, id);

                        ResultSet result = statement.executeQuery();
                        
                        result.close();
                        statement.close();
                        con.close();
                        JOptionPane.showMessageDialog(null, "Dados Inseridos", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        throw  e;
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
