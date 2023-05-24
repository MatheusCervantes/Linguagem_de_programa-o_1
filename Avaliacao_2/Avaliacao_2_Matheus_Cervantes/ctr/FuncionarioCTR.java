package br.com.avaliacao_2.ctr;

import java.sql.ResultSet;
import br.com.avaliacao_2.dto.FuncionarioDTO;
import br.com.avaliacao_2.dao.FuncionarioDAO;
import br.com.avaliacao_2.dao.ConexaoDAO;


public class FuncionarioCTR {
    
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    public FuncionarioCTR() {
    }
    
    public String inserirFuncionario(FuncionarioDTO funcionarioDTO) {
        try {
            if (funcionarioDAO.inserirFuncionario(funcionarioDTO)) {
                return "Funcionário Cadastrado com Sucesso!!!";
            } else {
                return "Funcinário NÃO Cadastrado!!!";
            }
        } 		
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Funcionario NÃO Cadastrado";
        }
    }
    
    public String alterarFuncionario(FuncionarioDTO funcionarioDTO) {
        try {
            if (funcionarioDAO.alterarFuncionario(funcionarioDTO)) {
                return "Funcionário Alterado com Sucesso!!!";
            } else {
                return "Funcionário NÃO Alterado!!!";
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Funcionário NÃO Alterado!!!";
        }
    }

    public String excluirFuncionario(FuncionarioDTO funcionarioDTO) {
        try {
            if (funcionarioDAO.excluirFuncionario(funcionarioDTO)) {
                return "Funcionário Excluído com Sucesso!!!";
            } else {
                return "Funcionário NÃO Excluído!!!";
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Funcionário NÃO Excluído!!!";
        }
    }

    public ResultSet consultarFuncionario(FuncionarioDTO funcionarioDTO, int opcao) {
        ResultSet rs = null;
        rs = funcionarioDAO.consultarFuncionario(funcionarioDTO, opcao);
        return rs;
    }
    
    public String logarFuncionario(FuncionarioDTO funcionarioDTO) {  
        return funcionarioDAO.logarFuncionario(funcionarioDTO);
    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
}
