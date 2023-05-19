package br.com.avaliacao_2.ctr;
import java.sql.ResultSet;
import br.com.avaliacao_2.dto.VeterinarioDTO;
import br.com.avaliacao_2.dao.VeterinarioDAO;
import br.com.avaliacao_2.dao.ConexaoDAO;

public class VeterinarioCTR {
    VeterinarioDAO veterinarioDAO = new VeterinarioDAO();

    public VeterinarioCTR() {
    }
    
    public String inserirVeterinario(VeterinarioDTO veterinarioDTO) {
        try {
            if (veterinarioDAO.inseriPessoa(veterinarioDTO)) {
                return "Veterinário Cadastrado com Sucesso!!!";
            } else {
                return "Veterinário NÃO Cadastrado!!!";
            }
        } 	
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Veterinário NÃO Cadastrado";
        }
    }
    
    public String alterarVeterinario(VeterinarioDTO veterinarioDTO) {
        try {
            if (veterinarioDAO.alterarPessoa(veterinarioDTO)) {
                return "Veterinário Alterada com Sucesso!!!";
            } else {
                return "Veterinário NÃO Alterada!!!";
            }
        } 	
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Pessoa NÃO Alterada";
        }
    }
    
    public String excluirVeterinario(VeterinarioDTO veterinarioDTO) {
        try {
            if (veterinarioDAO.excluirPessoa(veterinarioDTO)) {
                return "Veterinário Excluído com Sucesso!!!";
            } else {
                return "Veterinário NÃO Excluída!!!";
            }
        } 	
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Veterinário NÃO Excluída";
        }
    }
    
    public ResultSet consultarVeterinario(VeterinarioDTO veterinarioDTO, int opcao) {
        ResultSet rs = null;
        rs = veterinarioDAO.consultarVeterinario(veterinarioDTO, opcao);
        return rs;
    }
    
    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
}