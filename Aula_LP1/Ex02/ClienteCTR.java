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
public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();
    public String DadosRG (ClienteDTO clienteDTO) {
        return clienteDAO.DadosRG(clienteDTO);
    }
    public String DadosIdade (ClienteDTO clienteDTO) {
        return clienteDAO.DadosIdade(clienteDTO);
    }
}
