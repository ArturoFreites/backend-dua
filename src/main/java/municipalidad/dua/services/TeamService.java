package municipalidad.dua.services;

import municipalidad.dua.entities.Team;

import java.util.List;

public interface TeamService {

    Team create(String name) throws Exception;

    Team findById(Integer id) throws Exception;

    List<Team> findAll();
}
