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
public class Sala {

    private String sala;
    private String descricao;
    private String capacidade;
    private String tipo;

    public String getSala() {
        return sala;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
