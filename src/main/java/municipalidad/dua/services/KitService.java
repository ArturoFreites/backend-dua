package municipalidad.dua.services;

import municipalidad.dua.entities.Kit;

import java.util.List;

public interface KitService {


    Kit create() throws Exception;

    Kit createNumer(Integer id) throws Exception;

    Kit findById(Integer numerKit) throws Exception;

    List<Kit> findAll();
}
