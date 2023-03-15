package br.com.projeto_1.ctr;

import java.sql.ResultSet;
import br.com.projeto_1.dto.ClienteDTO;
import br.com.projeto_1.dao.ClienteDAO;

public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public ClienteCTR() {
    }
    
    public String inserirCliente (ClienteDTO clienteDTO) {
        try {
            if (clienteDAO.inserirCliente(clienteDTO))
                return "Cliente Cadastrado com Sucesso!!!";
            else
                return "Cliente NÃO Cadastrado!!!";
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Cliente NÃO Cadastrado";
        }
    }
}
