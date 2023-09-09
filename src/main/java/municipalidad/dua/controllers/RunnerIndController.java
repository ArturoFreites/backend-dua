package municipalidad.dua.controllers;

import municipalidad.dua.dtos.RunnerIndDTO;
import municipalidad.dua.entities.RunnerInd;
import municipalidad.dua.services.RunnerIndService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/runnerInd")
public class RunnerIndController {

    private final RunnerIndService runnerIndService;

    public RunnerIndController(RunnerIndService runnerIndService) {
        this.runnerIndService = runnerIndService;
    }


    @PostMapping("/create")
    public ResponseEntity<RunnerInd> create(RunnerIndDTO runnerIndDTO){

        try {
            RunnerInd runnerInd = runnerIndService.create(runnerIndDTO);
            return ResponseEntity.ok(runnerInd);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/createAll")
    public ResponseEntity<List<RunnerInd>> createAll(@RequestBody List<RunnerIndDTO> runnerIndDTOList){

        try {
            List<RunnerInd> runnerIndList = runnerIndService.createAll(runnerIndDTOList);
            return ResponseEntity.ok(runnerIndList);
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/dni/{number}")
    public ResponseEntity<RunnerInd> findByDni(@PathVariable(name = "number") String number){

        try {
            return ResponseEntity.ok(runnerIndService.findByDni(number));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }

    }
    @GetMapping("/all")
    public ResponseEntity<List<RunnerInd>> findAll(){

        try {
            return ResponseEntity.ok(runnerIndService.findAll());
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }

    }

}
