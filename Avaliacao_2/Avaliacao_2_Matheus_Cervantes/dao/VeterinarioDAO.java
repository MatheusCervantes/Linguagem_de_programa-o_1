package br.com.avaliacao_2.dao;

import java.sql.*;
import br.com.avaliacao_2.dto.VeterinarioDTO;

public class VeterinarioDAO {

    public VeterinarioDAO() {
    }

    private ResultSet rs = null;
    private Statement stmt = null;

    public boolean inseriPessoa(VeterinarioDTO veterinarioDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "Insert into veterinario (nome_vet, logradouro_vet, numero_vet, "
                    + "bairro_vet, cidade_vet, estado_vet, cep_vet, crmv_vet, rg_vet) values ( "
                    + "'" + veterinarioDTO.getNome_vet()+ "', "
                    + "'" + veterinarioDTO.getLogradouro_vet()+ "', "
                    + veterinarioDTO.getNumero_vet()+ ", "
                    + "'" + veterinarioDTO.getBairro_vet()+ "', "
                    + "'" + veterinarioDTO.getCidade_vet()+ "', "
                    + "'" + veterinarioDTO.getEstado_vet()+ "', "
                    + "'" + veterinarioDTO.getCep_vet()+ "', "
                    + "'" + veterinarioDTO.getCrmv_vet()+ "', "
                    + "'" + veterinarioDTO.getRg_vet() + "') ";

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

    public boolean alterarPessoa(VeterinarioDTO veterinarioDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "Update veterinario set "
                    + "nome_vet = '" + veterinarioDTO.getNome_vet()+ "', "
                    + "logradouro_vet = '" + veterinarioDTO.getLogradouro_vet()+ "', "
                    + "numero_vet = " + veterinarioDTO.getNumero_vet()+ ", "
                    + "bairro_vet = '" + veterinarioDTO.getBairro_vet()+ "', "
                    + "cidade_vet = '" + veterinarioDTO.getCidade_vet()+ "', "
                    + "estado_vet = '" + veterinarioDTO.getEstado_vet()+ "', "
                    + "cep_vet = '" + veterinarioDTO.getCep_vet()+ "', "
                    + "crmv_vet = '" + veterinarioDTO.getCrmv_vet()+ "', "
                    + "rg_vet = '" + veterinarioDTO.getRg_vet()+ "' "
                    + "where id_vet = " + veterinarioDTO.getId_vet();

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

    public boolean excluirPessoa(VeterinarioDTO veterinarioDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "Delete from veterinario where id_vet = "
                    + veterinarioDTO.getId_vet();

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

    public ResultSet consultarVeterinario(VeterinarioDTO veterinarioDTO, int opcao) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "";
            switch (opcao) {
                case 1:
                    comando = "Select v.* "
                            + "from veterinario v "
                            + "where nome_vet like '" + veterinarioDTO.getNome_vet()+ "%' "
                            + "order by v.nome_vet";
                    break;
                case 2:
                    comando = "Select v.* "
                            + "from veterinario v "
                            + "where v.id_vet = " + veterinarioDTO.getId_vet();
                    break;
                case 3:
                    comando = "Select v.id_vet, v.nome_vet "
                            + "from veterinario v ";
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