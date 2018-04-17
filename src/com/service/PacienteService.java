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
    final String URL = "jdbc:mysql://localhost:3306/medical?autoReconnect=true&useSSL=false";

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

            List<Paciente> pacientes = new ArrayList<Paciente>();
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
        	e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha ao tentar conectar com o Banco", "Falha", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void save(Identificacao iden) throws Exception {
       
    }
}
