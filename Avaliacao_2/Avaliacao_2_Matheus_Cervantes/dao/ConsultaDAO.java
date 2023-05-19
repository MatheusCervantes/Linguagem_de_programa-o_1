package br.com.avaliacao_2.dao;

import br.com.avaliacao_2.dto.AnimalDTO;
import br.com.avaliacao_2.dto.ConsultaDTO;
import br.com.avaliacao_2.dto.VeterinarioDTO;
import java.sql.*;
import java.text.SimpleDateFormat;

public class ConsultaDAO {

    public ConsultaDAO() {
    }

    SimpleDateFormat data_format = new SimpleDateFormat("dd/mm/yyyy");
    SimpleDateFormat hora_format = new SimpleDateFormat("hh:mm:ss");
    private ResultSet rs = null;
    private Statement stmt = null;

    public boolean inserirConsulta(ConsultaDTO consultaDTO, AnimalDTO animalDTO, VeterinarioDTO veterinarioDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "Insert into consulta (descricao_consulta, data_consulta, "
                    + "hora_consulta, id_vet, id_animal ) values ( "
                    + "'" + consultaDTO.getDescricao() + "', "
                    + "to_date('" + data_format.format(consultaDTO.getData_consulta()) + "','dd/mm/yyyy'),"
                    + "cast('" + hora_format.format(consultaDTO.getHora_consultada()) + "' as TIME),"
                    + veterinarioDTO.getId_vet() + ", "
                    + animalDTO.getId_animal() + " ) ";

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    public boolean alterarConsulta(ConsultaDTO consultaDTO, AnimalDTO animalDTO, VeterinarioDTO veterinarioDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "Update consulta set "
                    + "descricao_consulta = '" + consultaDTO.getDescricao() + "', "
                    + "data_consulta = to_date('" + data_format.format(consultaDTO.getData_consulta()) + "','dd/mm/yyyy'), "
                    + "hora_consulta = cast('" + hora_format.format(consultaDTO.getHora_consultada()) + "' as TIME),"
                    + "id_vet = " + veterinarioDTO.getId_vet() + ", "
                    + "id_animal = " + animalDTO.getId_animal() + " "
                    + "where id_consulta = " + consultaDTO.getId_consulta();

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    public boolean excluirConsulta(ConsultaDTO consultaDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "Delete from consulta where id_consulta = "
                    + consultaDTO.getId_consulta();

            stmt.execute(comando);
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    public ResultSet consultarConsulta(ConsultaDTO consultaDTO, VeterinarioDTO veterinarioDTO, AnimalDTO animalDTO, int opcao) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "";
            switch (opcao) {
                case 1:
                    comando = "Select c.*, v.*, a.* "
                            + "from consulta c "
                            + "join veterinario v on c.id_vet = v.id_vet "
                            + "join animal a on c.id_animal = a.id_animal "
                            + "where v.nome_vet ilike '" + veterinarioDTO.getNome_vet() + "%' "
                            + "order by v.nome_vet";
                    break;
                case 2:
                    comando = "Select c.*, v.*, a.* "
                            + "from consulta c "
                            + "join veterinario v on c.id_vet = v.id_vet "
                            + "join animal a on c.id_animal = a.id_animal "
                            + "where a.nome_animal ilike '" + animalDTO.getNome_animal()+ "%' "
                            + "order by a.nome_animal";
                    break;
                case 3:
                    comando = "Select c.*, v.*, a.*, p.*, "
                            + "to_char(c.data_consulta, 'dd/mm/yyyy') as datConsulta, "
                            + "to_char(c.hora_consulta, 'HH:mi:ss') as horaConsulta "
                            + "from consulta c "
                            + "join veterinario v on c.id_vet = v.id_vet "
                            + "join animal a on c.id_animal = a.id_animal "
                            + "join pessoa p on a.id_pessoa = p.id_pessoa "
                            + "where c.id_consulta = " + consultaDTO.getId_consulta();
                    break;

            }
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }

    public ResultSet consultarAnimal(AnimalDTO animalDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "";
            comando = "Select a.*, p.* "
                    + "from animal a "
                    + "join pessoa p on a.id_pessoa = p.id_pessoa "
                    + "where a.nome_animal ilike '" + animalDTO.getNome_animal() + "%' "
                    + "order by a.nome_animal";

            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }
}