package municipalidad.dua.controllers;

import municipalidad.dua.entities.Category;
import municipalidad.dua.services.impl.CategoryServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")

public class CategoryController {

    private final CategoryServiceImpl categoryService;

    public CategoryController(CategoryServiceImpl categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/create/{name}")
    public ResponseEntity<Category> create(@PathVariable(name = "name") String name){

        try {
            Category category = categoryService.createCategory(name);
            return ResponseEntity.ok(category);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }

    }

    @GetMapping("/{name}")
    public ResponseEntity<Category> findById(@RequestParam(name = "name") String name){
        try {
            Category category = categoryService.findByName(name);
            return ResponseEntity.ok(category);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }

    }

    @GetMapping("/all")
    public ResponseEntity<List<Category>> findAll(){
        return ResponseEntity.ok(categoryService.findAll());
    }

}
