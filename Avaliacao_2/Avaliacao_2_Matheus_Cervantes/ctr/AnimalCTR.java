package br.com.avaliacao_2.ctr;
import java.sql.ResultSet;
import br.com.avaliacao_2.dto.PessoaDTO;
import br.com.avaliacao_2.dto.AnimalDTO;
import br.com.avaliacao_2.dao.AnimalDAO;
import br.com.avaliacao_2.dao.ConexaoDAO;


public class AnimalCTR {
    AnimalDAO animalDAO = new AnimalDAO();
    
    public AnimalCTR(){
    }
    
    public String inserirAnimal(AnimalDTO animalDTO, PessoaDTO pessoaDTO) {
        try {
            if (animalDAO.inserirAnimal(animalDTO, pessoaDTO)) {
                return "Animal Cadastrado com Sucesso!!!";
            } else {
                return "Animal NÃO Cadastrado!!!";
            }
        } 	
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Animal NÃO Cadastrado";
        }
    }
    
    public String alterarAnimal(AnimalDTO animalDTO, PessoaDTO pessoaDTO) {
        try {
            if (animalDAO.alterarAnimal(animalDTO, pessoaDTO)) {
                return "Animal Alterado com Sucesso!!!";
            } else {
                return "Animal NÃO Alterado!!!";
            }
        } 	
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Animal NÃO Alterado";
        }
    }
    
    public String excluirAnimal(AnimalDTO animalDTO) {
        try {
            if (animalDAO.excluirAnimal(animalDTO)) {
                return "Animal Excluído com Sucesso!!!";
            } else {
                return "Animal NÃO Excluído!!!";
            }
        } 	
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Animal NÃO Excluído";
        }
    }
    
    public ResultSet consultarAnimal(AnimalDTO animalDTO, int opcao) {
        ResultSet rs = null;
        rs = animalDAO.consultarAnimal(animalDTO, opcao);
        return rs;
    }
    
    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
}