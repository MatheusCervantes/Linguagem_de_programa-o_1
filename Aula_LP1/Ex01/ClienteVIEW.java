/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class ClienteVIEW {
    public static void main(String[] args) {
        try {
            ClienteDTO clienteDTO = new ClienteDTO();
            ClienteCTR clienteCTR = new ClienteCTR();
            clienteDTO.setNome(JOptionPane.showInputDialog("Insira o nome: "));
            clienteDTO.setRg(JOptionPane.showInputDialog("Insira o RG: "));
            clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Insira a idade: ")));
            
            JOptionPane.showMessageDialog(null, clienteCTR.DadosIdade(clienteDTO));
            JOptionPane.showMessageDialog(null, clienteCTR.DadosRG(clienteDTO));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        } 
    }   
}
