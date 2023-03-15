/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex05;

/**
 *
 * @author aluno
 */
public class FuncionarioCTR {
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    public String gravarFuncionario (FuncionarioDTO funcionarioDTO) {
        return funcionarioDAO.gravarFuncionario(funcionarioDTO);
    }
}
