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
public class FuncionarioDAO {
    public String gravarFuncionario (FuncionarioDTO funcionarioDTO) {
        return "O dados gravados são: " +
                "\nNome: " + funcionarioDTO.getNome() +
                "\nLogradouro: " + funcionarioDTO.getLogradouro()+
                "\nBairro: " + funcionarioDTO.getBairro()+
                "\nCidade: " + funcionarioDTO.getCidade() +
                "\nEstado: " + funcionarioDTO.getEstado() +
                "\nCEP: " + funcionarioDTO.getCep() +
                "\nCPF: " + funcionarioDTO.getCpf() +
                "\nRG: " + funcionarioDTO.getRg() +
                "\nNúmero: " + funcionarioDTO.getNumero();       
    }
}
