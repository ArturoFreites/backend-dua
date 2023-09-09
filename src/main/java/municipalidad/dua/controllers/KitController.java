package municipalidad.dua.controllers;

import municipalidad.dua.entities.Kit;
import municipalidad.dua.services.KitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kit")
public class KitController {

    private final KitService kitService;

    public KitController(KitService kitService) {
        this.kitService = kitService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Kit> findById(@RequestParam(name = "id") Integer id){
        try {
            return ResponseEntity.ok(kitService.findById(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<Kit>> findAll(){
        try {
            return ResponseEntity.ok(kitService.findAll());
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

}
