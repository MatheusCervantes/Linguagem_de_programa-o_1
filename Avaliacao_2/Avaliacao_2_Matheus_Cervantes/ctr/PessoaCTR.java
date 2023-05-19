package br.com.avaliacao_2.ctr;
import java.sql.ResultSet;
import br.com.avaliacao_2.dto.PessoaDTO;
import br.com.avaliacao_2.dao.PessoaDAO;
import br.com.avaliacao_2.dao.ConexaoDAO;

public class PessoaCTR {
    PessoaDAO pessoaDAO = new PessoaDAO();

    public PessoaCTR() {
    }
    
    public String inserirPessoa(PessoaDTO pessoaDTO) {
        try {
            if (pessoaDAO.inseriPessoa(pessoaDTO)) {
                return "Pessoa Cadastrado com Sucesso!!!";
            } else {
                return "Pessoa NÃO Cadastrado!!!";
            }
        } 	
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Pessoa NÃO Cadastrado";
        }
    }
    
    public String alterarPessoa(PessoaDTO pessoaDTO) {
        try {
            if (pessoaDAO.alterarPessoa(pessoaDTO)) {
                return "Pessoa Alterada com Sucesso!!!";
            } else {
                return "Pessoa NÃO Alterada!!!";
            }
        } 	
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Pessoa NÃO Alterada";
        }
    }
    
    public String excluirPessoa(PessoaDTO pessoaDTO) {
        try {
            if (pessoaDAO.excluirPessoa(pessoaDTO)) {
                return "Pessoa Excluído com Sucesso!!!";
            } else {
                return "Pessoa NÃO Excluída!!!";
            }
        } 	
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Pessoa NÃO Excluída";
        }
    }
    
    public ResultSet consultarPessoa(PessoaDTO pessoaDTO, int opcao) {
        ResultSet rs = null;
        rs = pessoaDAO.consultarPessoa(pessoaDTO, opcao);
        return rs;
    }
    
    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
    
}