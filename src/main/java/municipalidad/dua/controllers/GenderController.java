package municipalidad.dua.controllers;


import municipalidad.dua.entities.Gender;
import municipalidad.dua.services.GenderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gender")
public class GenderController {

    private final GenderService genderService;

    public GenderController(GenderService genderService) {
        this.genderService = genderService;
    }

    @PostMapping("/create/{name}")
    public ResponseEntity<Gender> create(@PathVariable(name = "name") String name){

        try {
            return ResponseEntity.ok(genderService.create(name));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
