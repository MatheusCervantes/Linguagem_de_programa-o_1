package br.com.avaliacao_2.dao;

import java.sql.*;
import br.com.avaliacao_2.dto.PessoaDTO;

public class PessoaDAO {

    public PessoaDAO() {
    }

    private ResultSet rs = null;
    private Statement stmt = null;

    public boolean inseriPessoa(PessoaDTO pessoaDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "Insert into pessoa (nome_pessoa, logradouro_pessoa, numero_pessoa, "
                    + "bairro_pessoa, cidade_pessoa, estado_pessoa, cep_pessoa, cpf_pessoa, rg_pessoa) values ( "
                    + "'" + pessoaDTO.getNome_pessoa() + "', "
                    + "'" + pessoaDTO.getLogradouro_pessoa() + "', "
                    + pessoaDTO.getNumero_pessoa() + ", "
                    + "'" + pessoaDTO.getBairro_pessoa() + "', "
                    + "'" + pessoaDTO.getCidade_pessoa() + "', "
                    + "'" + pessoaDTO.getEstado_pessoa() + "', "
                    + "'" + pessoaDTO.getCep_pessoa() + "', "
                    + "'" + pessoaDTO.getCpf_pessoa() + "', "
                    + "'" + pessoaDTO.getRg_pessoa() + "') ";

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    public boolean alterarPessoa(PessoaDTO pessoaDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "Update pessoa set "
                    + "nome_pessoa = '" + pessoaDTO.getNome_pessoa() + "', "
                    + "logradouro_pessoa = '" + pessoaDTO.getLogradouro_pessoa() + "', "
                    + "numero_pessoa = " + pessoaDTO.getNumero_pessoa() + ", "
                    + "bairro_pessoa = '" + pessoaDTO.getBairro_pessoa() + "', "
                    + "cidade_pessoa = '" + pessoaDTO.getCidade_pessoa() + "', "
                    + "estado_pessoa = '" + pessoaDTO.getEstado_pessoa() + "', "
                    + "cep_pessoa = '" + pessoaDTO.getCep_pessoa() + "', "
                    + "cpf_pessoa = '" + pessoaDTO.getCpf_pessoa() + "', "
                    + "rg_pessoa = '" + pessoaDTO.getRg_pessoa() + "' "
                    + "where id_pessoa = " + pessoaDTO.getId_pessoa();

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    public boolean excluirPessoa(PessoaDTO pessoaDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "Delete from pessoa where id_pessoa = "
                    + pessoaDTO.getId_pessoa();

            stmt.execute(comando);
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    public ResultSet consultarPessoa(PessoaDTO pessoaDTO, int opcao) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "";
            switch (opcao) {
                case 1:
                    comando = "Select p.* "
                            + "from pessoa p "
                            + "where nome_pessoa like '" + pessoaDTO.getNome_pessoa()+ "%' "
                            + "order by p.nome_pessoa";
                    break;
                case 2:
                    comando = "Select p.* "
                            + "from pessoa p "
                            + "where p.id_pessoa = " + pessoaDTO.getId_pessoa();
                    break;
                case 3:
                    comando = "Select p.id_pessoa, p.nome_pessoa "
                            + "from pessoa p ";
                    break;

            }
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }
}