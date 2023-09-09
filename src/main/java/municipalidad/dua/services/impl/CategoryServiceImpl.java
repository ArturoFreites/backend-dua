package municipalidad.dua.services.impl;

import municipalidad.dua.entities.Category;
import municipalidad.dua.repository.CategoryRepository;
import municipalidad.dua.services.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl  implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category createCategory(String name) throws Exception {

        if (name.isEmpty() || name==null){
            throw new Exception("El nombre de la categoria es invalido");
        }

        Category category = new Category();
        category.setName(name);
        categoryRepository.save(category);
        return category;
    }

    @Override
    public Category findByName(String name) throws Exception {
        Category category = categoryRepository.findCategoriesByName(name);
        if (category==null){
            throw new Exception("La categoria no existe");
        }
        return category;
    }

    @Override
    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

}
