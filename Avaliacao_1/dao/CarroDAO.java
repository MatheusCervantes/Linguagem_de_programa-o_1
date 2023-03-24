package br.com.avaliacao_1.dao;

import java.sql.*;
import br.com.avaliacao_1.dto.CarroDTO;

public class CarroDAO {
    public CarroDAO() {
    }
    
    private ResultSet rs = null;
    private Statement stmt = null;
    public boolean inserirCarro (CarroDTO carroDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "Insert into carro (renavam_car, modelo_car, chassi_car, "
                    + "ano_car, placa_car, cor_car, proprietario_car, endereco_car, cidade_car, estado_car, bairro_car, cpf_car, cnh_car) values ( "
                    + "'" + carroDTO.getRenavam_car()+ "', "
                    + "'" + carroDTO.getModelo_car()+ "', "
                    + "'" + carroDTO.getChassi_car() + "', "
                    + carroDTO.getAno_car() + ", "
                    + "'" + carroDTO.getPlaca_car() + "', "
                    + "'" + carroDTO.getCor_car() + "', "
                    + "'" + carroDTO.getProprietario_car() + "', "
                    + "'" + carroDTO.getEndereco_car() + "', "
                    + "'" + carroDTO.getCidade_car() + "', "
                    + "'" + carroDTO.getEstado_car() + "', "
                    + "'" + carroDTO.getBairro_car() + "', "
                    + "'" + carroDTO.getCpf_car() + "', "
                    + "'" + carroDTO.getCnh_car() + "') ";
            
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        }
        catch (Exception e) {
                System.out.println(e.getMessage());
                return false;
        }
        finally {
            ConexaoDAO.CloseDB();
        }
    }
    
    public ResultSet consultarCarro (CarroDTO carroDTO, int opcao) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "";
            switch (opcao) {
                case 1:
                    comando = "Select c.* "
                            + "from carro c "
                            + "where renavam_car like '" + carroDTO.getRenavam_car()+ "%' " 
                            + "order by c.renavam_car";
                break;
                case 2:
                    comando = "Select c.* "
                            + "from carro c "
                            + "where c.id_car = " + carroDTO.getId_car();
                break;
                case 3:
                    comando = "Select c.id_car, c.renavam_car "
                            + "from carro c ";
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
    
    public boolean alterarCarro (CarroDTO carroDTO) {
        try { 
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "Update carro set "
                    + "renavam_car = '" + carroDTO.getRenavam_car()+ "', "
                    + "modelo_car = '" + carroDTO.getModelo_car()+ "', "
                    + "chassi_car = '" + carroDTO.getChassi_car() + "', "
                    + "ano_car = '" + carroDTO.getAno_car() + "', "
                    + "placa_car = '" + carroDTO.getPlaca_car() + "', "
                    + "cor_car = '" + carroDTO.getCor_car() + "', "
                    + "proprietario_car = '" + carroDTO.getProprietario_car() + "', "
                    + "endereco_car = '" + carroDTO.getEndereco_car() + "', "
                    + "cidade_car = '" + carroDTO.getCidade_car() + "', "
                    + "estado_car = '" + carroDTO.getEstado_car() + "', "
                    + "bairro_car = '" + carroDTO.getBairro_car() + "', "
                    + "cpf_car = '" + carroDTO.getCpf_car() + "', "
                    + "cnh_car = '" + carroDTO.getCnh_car() + "' "
                    + "where id_car = " + carroDTO.getId_car();
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            return true;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        finally {
            ConexaoDAO.CloseDB();
        }
    }
    
    public boolean excluirCarro (CarroDTO carroDTO) {
        try {
        ConexaoDAO.ConectDB();
        stmt = ConexaoDAO.con.createStatement();
        String comando = "Delete from carro where id_car = " + carroDTO.getId_car();
        stmt.execute(comando);
        ConexaoDAO.con.commit();
        stmt.close();
        return true;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        finally {
            ConexaoDAO.CloseDB();
        }
    }
    
}
