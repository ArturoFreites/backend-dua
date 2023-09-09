package municipalidad.dua.services;

import municipalidad.dua.entities.Vehicle;

import java.util.List;

public interface VehicleService {
    Vehicle create(String name) throws Exception;

    Vehicle findById(Integer id) throws Exception;

    List<Vehicle> findByAll();
}
