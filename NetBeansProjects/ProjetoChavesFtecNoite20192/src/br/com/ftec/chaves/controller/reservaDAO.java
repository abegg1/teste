/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.chaves.controller;

import br.com.ftec.chaves.model.Reserva;
import br.com.ftec.chaves.model.Sala;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bernadete.abegg
 */
public class reservaDAO {
    
    
    
    public void salvar(Reserva reserva) throws ClassNotFoundException, SQLException {

        //criação do SQL para salvar valores da sala no banco
        //cada ? representa os valores que serão colocados para cada campo
        //em ordem.
        String sql = "insert into reserva(id_sala, id_colaborador, turno, dia)"
                + " VALUES(?,?,?,?,'noite','tera-feira')";

        Connection conn = null;
        PreparedStatement pstm = null;

    
            conn =  ConectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, reserva.getSala().getId()); //cada pstm.set coloca valor em uma das? na ordem
            pstm.setInt(2, reserva.getColaborador().getId());
            pstm.setString(3, reserva.getTurno());
            pstm.setString(4,reserva.getDia());
            pstm.execute(); // executa o sql

    
    
    
}
}
    

