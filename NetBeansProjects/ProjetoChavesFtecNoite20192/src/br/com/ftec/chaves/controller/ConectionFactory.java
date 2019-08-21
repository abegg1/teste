/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.chaves.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author bernadete.abegg
 */
public class ConectionFactory {
  private static String USERNAME="root";
  private static String PASSWORD="";
  private static String DATABASE_URL="jdbc:mysql://localhost:3306/projetochaves";
  
public static Connection createConnectionToMySQL() throws ClassNotFoundException, SQLException{
      
   Class.forName("com.mysql.jdbc.Driver");
   Connection connection = DriverManager.getConnection(DATABASE_URL,USERNAME,
           PASSWORD);
   return connection;
   
     //CRIA CONEXAO COM O BANCO DE DADOS     
}
}

