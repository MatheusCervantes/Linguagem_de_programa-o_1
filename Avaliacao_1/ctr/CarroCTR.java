package br.com.avaliacao_1.ctr;

import java.sql.ResultSet;
import br.com.avaliacao_1.dto.CarroDTO;
import br.com.avaliacao_1.dao.CarroDAO;
import br.com.avaliacao_1.dao.ConexaoDAO;

public class CarroCTR {
    CarroDAO carroDAO = new CarroDAO();
    
    public CarroCTR() {
    }
    
    public String inserircarro (CarroDTO carroDTO) {
        try {
            if (carroDAO.inserirCarro(carroDTO))
                return "Carro Cadastrado com Sucesso!!!";
            else
                return "Carro NÃO Cadastrado!!!";
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Carro NÃO Cadastrado!!!";
        }
    }
    
    public ResultSet consultarcarro(CarroDTO carroDTO, int opcao) {
        ResultSet rs = null;
        rs = carroDAO.consultarCarro(carroDTO, opcao);
        return rs;
    }
    
    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
    
    public String alterarcarro (CarroDTO carroDTO) {
        try {
            if (carroDAO.alterarCarro(carroDTO))
                return "Carro Alterado com Sucesso!!!";
            else
                return "Carro NÃO Alterado!!!";
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Carro NÃO Alterado!!!";
        }
    }
    
    public String excluircarro (CarroDTO carroDTO) {
        try {
            if (carroDAO.excluirCarro(carroDTO))
                return "Carro Excluído com Sucesso!!!";
            else
                return "Carro NÃO Excluído!!!";
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Carro NÃO Excluído!!!";
        }
    }
}
