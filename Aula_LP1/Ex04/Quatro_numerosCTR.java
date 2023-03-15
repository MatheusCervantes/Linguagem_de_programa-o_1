/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex04;

/**
 *
 * @author aluno
 */
public class Quatro_numerosCTR {
    Quatro_numerosDAO quatro_numerosDAO = new Quatro_numerosDAO();
    
    public String ordenar_Numeros (Quatro_numerosDTO quatro_numerosDTO) {
        return quatro_numerosDAO.ordenar_Numeros(quatro_numerosDTO);
    }
}
