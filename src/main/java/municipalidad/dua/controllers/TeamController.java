package municipalidad.dua.controllers;
import municipalidad.dua.entities.Team;
import municipalidad.dua.services.TeamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping("/create/{name}")
    public ResponseEntity<Team> create(@PathVariable(name = "name") String name){

        try {
            Team team = teamService.create(name);
            return ResponseEntity.ok(team);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Team> findById(@RequestParam(name = "id") Integer id){
        try {
            return ResponseEntity.ok(teamService.findById(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<Team>> findAll(){
        try {
            return ResponseEntity.ok(teamService.findAll());
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

}
