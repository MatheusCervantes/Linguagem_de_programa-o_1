package br.com.projeto_2.dao;
import java.sql.*;

public class ConexaoDAO {
    public static Connection con = null;
    
    public ConexaoDAO() {
    }
    
    public static void ConectDB() {
        try {
            String dsn = "projeto_2"; //nome do banco de dados
            String user = "postgres"; //nome do usuário utlizado para se conectar
            String senha = "postdba"; //senha do usuário acima
            
            DriverManager.registerDriver(new org.postgresql.Driver());
            
            String url = "jdbc:postgresql://localhost:5432/" + dsn;
            
            con = DriverManager.getConnection(url, user, senha);
            
            con.setAutoCommit(false);
            if (con == null) 
                System.out.println("erro ao abrir o banco");
            }
        catch (Exception e) {
            System.out.println("Problema ao abrir a base de dados! " + e.getMessage());
        }       
    }
    
    public static void CloseDB() {
        try {
            con.close();
        }
        catch (Exception e) {
            System.out.println("Problema ao fechar a base de dados! " + e.getMessage());
        }
    }
}
