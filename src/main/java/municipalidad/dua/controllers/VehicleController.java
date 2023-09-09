package municipalidad.dua.controllers;

import municipalidad.dua.entities.Vehicle;
import municipalidad.dua.services.VehicleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping("/create/{name}")
    public ResponseEntity<Vehicle> create(@PathVariable(name = "name") String name){
        try {
            return ResponseEntity.ok(vehicleService.create(name));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vehicle> findById(@RequestParam(name = "id") Integer id){
        try {
            return ResponseEntity.ok(vehicleService.findById(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<Vehicle>> findById(){
        try {
            return ResponseEntity.ok(vehicleService.findByAll());
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

}
