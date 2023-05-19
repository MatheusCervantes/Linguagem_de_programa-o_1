package br.com.avaliacao_2.dao;
import java.sql.*;
import br.com.avaliacao_2.dto.AnimalDTO;
import br.com.avaliacao_2.dto.PessoaDTO;
import java.text.SimpleDateFormat;

public class AnimalDAO {
    
    public AnimalDAO(){
    }
    
    SimpleDateFormat data_format= new SimpleDateFormat("dd/mm/yyyy");
    private ResultSet rs = null;
    private Statement stmt = null;
    
    public boolean inserirAnimal(AnimalDTO animalDTO, PessoaDTO pessoaDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "Insert into animal (nome_animal, tipo_animal, "
                    + "dtanasc_animal, id_pessoa ) values ( "
                    + "'" + animalDTO.getNome_animal()+ "', "
                    + "'" + animalDTO.getTipo_animal()+ "', "
                    + "to_date('" + data_format.format(animalDTO.getDatanasc_animal())+"','dd/mm/yyyy'), "
                    + pessoaDTO.getId_pessoa() + ") ";
            
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } 
        finally {
            ConexaoDAO.CloseDB();
        }
    }
    
    public boolean alterarAnimal(AnimalDTO animalDTO, PessoaDTO pessoaDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "Update animal set "
                    + "nome_animal = '" + animalDTO.getNome_animal()+ "', "
                    + "tipo_animal = '" + animalDTO.getTipo_animal()+ "', "
                    + "dtanasc_animal = to_date('" + data_format.format(animalDTO.getDatanasc_animal())+"','dd/mm/yyyy'),"
                    + "id_pessoa = " + pessoaDTO.getId_pessoa() + " "
                    + "where id_animal = " + animalDTO.getId_animal();
            
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } 
        finally {
            ConexaoDAO.CloseDB();
        }
    }
    
    public boolean excluirAnimal(AnimalDTO animalDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "Delete from animal where id_animal = " 
                             + animalDTO.getId_animal();

            stmt.execute(comando);
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } 
        finally {
            ConexaoDAO.CloseDB();
        }
    }
    
    public ResultSet consultarAnimal(AnimalDTO animalDTO, int opcao) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "";
            switch (opcao){
                case 1:
                    comando = "Select a.* "+
                              "from animal a "+
                              "where a.nome_animal ilike '" + animalDTO.getNome_animal()+ "%' " +
                              "order by a.nome_animal";    
                break;
                case 2:
                    comando = "Select p. *, f.nome_pessoa, f.id_pessoa, " +
                              "to_char(p.dtanasc_animal, 'dd/mm/yyyy') as nasc_animal "+
                              "from animal p, pessoa f " +
                              "where p.id_pessoa = f.id_pessoa and " +
                              "p.id_animal = " + animalDTO.getId_animal();
                break;
                
            }
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }
}