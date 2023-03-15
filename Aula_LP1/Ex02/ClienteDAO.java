/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex02;

/**
 *
 * @author aluno
 */
public class ClienteDAO {
    ClienteDTO clienteDTO = new ClienteDTO();
    public String DadosRG (ClienteDTO clienteDTO) {
        return "Nome: " + clienteDTO.getNome() + 
               "\nRG: " + clienteDTO.getRg();               
    }
    public String DadosIdade (ClienteDTO clienteDTO) {
        return "Nome: " + clienteDTO.getNome() + 
               "\nIdade: " + clienteDTO.getIdade();
    }
}
