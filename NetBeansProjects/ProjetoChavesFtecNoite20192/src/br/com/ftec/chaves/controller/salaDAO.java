/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.chaves.controller;

import java.sql.PreparedStatement;

/**
 *
 * @author bernadete.abegg
 */
public class salaDAO {
    
    String sql = "INSERT INTO sala(sala,descricao,capacidade,tipo)+VALUES(?,?,?,?)";
    Connetion conn = null;
    PreparedStatement pstm = null;
    
    
}