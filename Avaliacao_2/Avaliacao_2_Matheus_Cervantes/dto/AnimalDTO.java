package br.com.avaliacao_2.dto;

import java.util.Date;

public class AnimalDTO {
    private int id_animal, id_pessoa;
    private String nome_animal, tipo_animal;
    private Date datanasc_animal;

    public int getId_animal() {
        return id_animal;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getNome_animal() {
        return nome_animal;
    }

    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    public String getTipo_animal() {
        return tipo_animal;
    }

    public void setTipo_animal(String tipo_animal) {
        this.tipo_animal = tipo_animal;
    }

    public Date getDatanasc_animal() {
        return datanasc_animal;
    }

    public void setDatanasc_animal(Date datanasc_animal) {
        this.datanasc_animal = datanasc_animal;
    }
    
}
