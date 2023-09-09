package municipalidad.dua.services;

import municipalidad.dua.entities.Gender;

import java.util.List;

public interface GenderService {

    Gender create(String name) throws Exception;

    Gender findById(Integer id) throws Exception;

    List<Gender> findAll();
}
