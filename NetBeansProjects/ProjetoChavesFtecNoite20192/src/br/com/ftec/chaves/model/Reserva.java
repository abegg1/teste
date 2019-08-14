/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.chaves.model;

/**
 *
 * @author bernadete.abegg
 */
public class Reserva {
    private String sala;
    private String turno;
    private String dia;

    public String getSala() {
        return sala;
    }

    public String getTurno() {
        return turno;
    }

    public String getDia() {
        return dia;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    
}
