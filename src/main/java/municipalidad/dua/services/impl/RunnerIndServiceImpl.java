package municipalidad.dua.services.impl;

import municipalidad.dua.dtos.RunnerIndDTO;
import municipalidad.dua.entities.*;
import municipalidad.dua.repository.RunnerIndRepository;
import municipalidad.dua.services.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RunnerIndServiceImpl implements RunnerIndService{

    private final RunnerIndRepository runnerIndRepository;
    private final RunnerService runnerService;
    private final CategoryService categoryService;
    private final VehicleService vehicleService;
    private final TeamService teamService;
    private final KitService kitService;

    public RunnerIndServiceImpl(RunnerIndRepository runnerIndRepository, RunnerService runnerService, CategoryService categoryService, VehicleService vehicleService, TeamService teamService, KitService kitService) {
        this.runnerIndRepository = runnerIndRepository;
        this.runnerService = runnerService;
        this.categoryService = categoryService;
        this.vehicleService = vehicleService;
        this.teamService = teamService;
        this.kitService = kitService;
    }

    @Override
    public RunnerInd create(RunnerIndDTO runnerIndDTO) throws Exception {

        validate(runnerIndDTO);

        RunnerInd runnerInd = new RunnerInd();
        runnerInd.setRunner(runnerService.create(runnerIndDTO));
        runnerInd.setKit(kitService.createNumer(runnerIndDTO.getKitId()));

        if(runnerIndDTO.getCategoryName() != null){
            Category category = categoryService.findByName(runnerIndDTO.getCategoryName());
            runnerInd.setCategory(category);
        }

        if(runnerIndDTO.getVehicleId()!= null){
            Vehicle vehicle = vehicleService.findById(runnerIndDTO.getVehicleId());
            runnerInd.setVehicle(vehicle);
        }

        if(runnerIndDTO.getTeamId()!=null){
            Team team = teamService.findById(runnerIndDTO.getTeamId());
            runnerInd.setTeam(team);
        }

        runnerIndRepository.save(runnerInd);

        return runnerInd;
    }

    @Override
    public RunnerInd findById(Integer id) throws Exception {

        Optional<RunnerInd> runnerInd = runnerIndRepository.findById(id);
        if(runnerInd.isEmpty()){
            throw new Exception("El corredor no es valido");
        }
        return runnerInd.get();
    }

    @Override
    public List<RunnerInd> findAll(){
        return runnerIndRepository.findAll();
    }

    @Override
    public RunnerInd findByDni(String dni) throws Exception {
        RunnerInd runnerInd = runnerIndRepository.findByRunnerDni(dni);
        if (runnerInd==null){
            throw new Exception("El corredor no existe");
        }
        return runnerInd;
    }

    @Override
    public List<RunnerInd> createAll(List<RunnerIndDTO> runnerIndDTOS) throws Exception {

        List<RunnerInd> runnerInds = new ArrayList<>();

        System.out.println("entra");

        for (RunnerIndDTO runnerIndDTO:runnerIndDTOS) {
            RunnerInd runnerInd = create(runnerIndDTO);
            runnerInds.add(runnerInd);
        }

        return runnerInds;
    }

    private void validate(RunnerIndDTO runnerIndDTO) throws Exception {

        if(runnerIndDTO.getName().isEmpty() || runnerIndDTO.getName() == null){
            throw new Exception("Nombre invalido");
        }

        if(runnerIndDTO.getLastName().isEmpty() || runnerIndDTO.getLastName() == null){
            throw new Exception("Apellido invalido");
        }

        if(runnerIndDTO.getDni().isEmpty() || runnerIndDTO.getDni() == null){
            throw new Exception("Dni invalido");
        }

        if(runnerIndDTO.getBirthdate() == null){
            throw new Exception("Fecha invalida");
        }

        if(runnerIndDTO.getCategoryName() == null){
            throw new Exception("Categoria invalido");
        }

        if(runnerIndDTO.getGenderId() == null){
            throw new Exception("Genero invalido");
        }

        if(runnerIndDTO.getVehicleId() == null){
            throw new Exception("Vehiculo invalido");
        }

    }

}
