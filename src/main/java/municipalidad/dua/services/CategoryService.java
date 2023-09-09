package municipalidad.dua.services;

import municipalidad.dua.entities.Category;

import java.util.List;

public interface CategoryService {
    Category createCategory(String name) throws Exception;

    Category findByName(String name) throws Exception;

    List<Category> findAll();
}
