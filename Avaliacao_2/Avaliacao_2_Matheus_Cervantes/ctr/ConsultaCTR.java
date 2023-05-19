package br.com.avaliacao_2.ctr;

import br.com.avaliacao_2.dao.ConexaoDAO;
import br.com.avaliacao_2.dto.AnimalDTO;
import br.com.avaliacao_2.dao.ConsultaDAO;
import br.com.avaliacao_2.dto.ConsultaDTO;
import br.com.avaliacao_2.dto.VeterinarioDTO;
import java.sql.ResultSet;

public class ConsultaCTR {
    ConsultaDAO consultaDAO = new ConsultaDAO();
    
    public String inserirConsulta(ConsultaDTO consultaDTO, AnimalDTO animalDTO, VeterinarioDTO veterinarioDTO) {
        try {
            if (consultaDAO.inserirConsulta(consultaDTO, animalDTO, veterinarioDTO)) {
                return "Consulta Cadastrada com Sucesso!!!";
            } else {
                return "Consulta NÃO Cadastrada!!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Consulta NÃO Cadastrada";
        }
    }

    public String alterarConsulta(ConsultaDTO consultaDTO, AnimalDTO animalDTO, VeterinarioDTO veterinarioDTO) {
        try {
            if (consultaDAO.alterarConsulta(consultaDTO, animalDTO, veterinarioDTO)) {
                return "Consulta Alterada com Sucesso!!!";
            } else {
                return "Consulta NÃO Alterada!!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Consulta NÃO Alterada";
        }
    }

    public String excluirConsulta(ConsultaDTO consultaDTO) {
        try {
            if (consultaDAO.excluirConsulta(consultaDTO)) {
                return "Consulta Excluída com Sucesso!!!";
            } else {
                return "Consulta NÃO Excluída!!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Consulta NÃO Excluída";
        }
    }

    public ResultSet consultarAnimal(AnimalDTO animalDTO) {
        ResultSet rs = null;
        rs = consultaDAO.consultarAnimal(animalDTO);
        return rs;
    }
    
    public ResultSet consultarConsulta(ConsultaDTO consultaDTO, VeterinarioDTO veterinarioDTO, AnimalDTO animalDTO, int opcao) {
        ResultSet rs = null;
        rs = consultaDAO.consultarConsulta(consultaDTO, veterinarioDTO, animalDTO, opcao);
        return rs;
    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
    
}