package municipalidad.dua.services.impl;

import municipalidad.dua.entities.Team;
import municipalidad.dua.repository.TeamRepository;
import municipalidad.dua.services.TeamService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public Team create(String name) throws Exception {

        if(name.isEmpty() || name==null){
            throw new Exception("El nombre de team no es valido");
        }

        Team team = new Team();
        team.setName(name);
        teamRepository.save(team);
        return team;
    }

    @Override
    public Team findById(Integer id) throws Exception {

        Optional<Team> team = teamRepository.findById(id);
        if(team.isEmpty()){
            throw new Exception("No se encuentra Team");
        }

        return team.get();
    }

    @Override
    public List<Team> findAll(){
        return teamRepository.findAll();
    }

}
