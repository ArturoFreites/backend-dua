package municipalidad.dua.services.impl;

import municipalidad.dua.entities.Vehicle;
import municipalidad.dua.repository.VehicleRepository;
import municipalidad.dua.services.VehicleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle create(String name) throws Exception {

        if(name.isEmpty() || name==null){
            throw new Exception("El nombre del vehiculo es invalido");
        }

        Vehicle vehicle = new Vehicle();
        vehicle.setName(name);
        vehicleRepository.save(vehicle);

        return vehicle;

    }

    @Override
    public Vehicle findById(Integer id) throws Exception {
        Optional<Vehicle> vehicle = vehicleRepository.findById(id);
        if (vehicle.isEmpty()){
            throw new Exception("El vehiculo no existe");
        }
        return vehicle.get();
    }

    @Override
    public List<Vehicle> findByAll(){
        return vehicleRepository.findAll();
    }
}
