package municipalidad.dua.controllers;

import municipalidad.dua.dtos.RunnerMultDTO;
import municipalidad.dua.entities.RunnerMult;
import municipalidad.dua.services.RunnerMultService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("runnerMult")
public class RunnerMultController {

    private final RunnerMultService runnerMultService;

    public RunnerMultController(RunnerMultService runnerMultService) {
        this.runnerMultService = runnerMultService;
    }

    @PostMapping("/create")
    public ResponseEntity<List<RunnerMult>> createAll(@RequestBody List<RunnerMultDTO> runnerMultDTOList){

        try {
            List<RunnerMult> runnerMults = runnerMultService.createAll(runnerMultDTOList);
            return ResponseEntity.ok(runnerMults);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/dni/{number}")
    public ResponseEntity<RunnerMult> findDni(@PathVariable String number){

        try {
            RunnerMult runnerMult = runnerMultService.findByDni(number);
            return ResponseEntity.ok(runnerMult);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

}
