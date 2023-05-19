package br.com.avaliacao_2.dto;

public class PessoaDTO {
    private int numero_pessoa, id_pessoa;
    private String logradouro_pessoa, bairro_pessoa, cidade_pessoa, estado_pessoa, cep_pessoa, nome_pessoa, cpf_pessoa, rg_pessoa;

    public int getNumero_pessoa() {
        return numero_pessoa;
    }

    public void setNumero_pessoa(int numero_pessoa) {
        this.numero_pessoa = numero_pessoa;
    }

    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getLogradouro_pessoa() {
        return logradouro_pessoa;
    }

    public void setLogradouro_pessoa(String logradouro_pessoa) {
        this.logradouro_pessoa = logradouro_pessoa;
    }

    public String getBairro_pessoa() {
        return bairro_pessoa;
    }

    public void setBairro_pessoa(String bairro_pessoa) {
        this.bairro_pessoa = bairro_pessoa;
    }

    public String getCidade_pessoa() {
        return cidade_pessoa;
    }

    public void setCidade_pessoa(String cidade_pessoa) {
        this.cidade_pessoa = cidade_pessoa;
    }

    public String getEstado_pessoa() {
        return estado_pessoa;
    }

    public void setEstado_pessoa(String estado_pessoa) {
        this.estado_pessoa = estado_pessoa;
    }

    public String getCep_pessoa() {
        return cep_pessoa;
    }

    public void setCep_pessoa(String cep_pessoa) {
        this.cep_pessoa = cep_pessoa;
    }

    public String getNome_pessoa() {
        return nome_pessoa;
    }

    public void setNome_pessoa(String nome_pessoa) {
        this.nome_pessoa = nome_pessoa;
    }

    public String getCpf_pessoa() {
        return cpf_pessoa;
    }

    public void setCpf_pessoa(String cpf_pessoa) {
        this.cpf_pessoa = cpf_pessoa;
    }

    public String getRg_pessoa() {
        return rg_pessoa;
    }

    public void setRg_pessoa(String rg_pessoa) {
        this.rg_pessoa = rg_pessoa;
    }
}
