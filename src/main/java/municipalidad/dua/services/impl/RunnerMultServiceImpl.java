package municipalidad.dua.services.impl;

import municipalidad.dua.dtos.RunnerIndDTO;
import municipalidad.dua.dtos.RunnerMultDTO;
import municipalidad.dua.entities.*;
import municipalidad.dua.repository.RunnerMultRepository;
import municipalidad.dua.services.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RunnerMultServiceImpl implements RunnerMultService {

    private final RunnerService runnerService;
    private final KitService kitService;
    private final CategoryService categoryService;
    private final VehicleService vehicleService;
    private final TeamService teamService;
    private final RunnerMultRepository runnerMultRepository;

    public RunnerMultServiceImpl(RunnerService runnerService, KitService kitService, CategoryService categoryService, VehicleService vehicleService, TeamService teamService, RunnerMultRepository runnerMultRepository) {
        this.runnerService = runnerService;
        this.kitService = kitService;
        this.categoryService = categoryService;
        this.vehicleService = vehicleService;
        this.teamService = teamService;
        this.runnerMultRepository = runnerMultRepository;
    }

    @Override
    public RunnerMult create(RunnerMultDTO runnerMultDTO) throws Exception {

        List<Runner> runnerList = new ArrayList<>();

        RunnerIndDTO runnerIndDTO1 = new RunnerIndDTO();

        runnerIndDTO1.setName(runnerMultDTO.getName());
        runnerIndDTO1.setLastName(runnerMultDTO.getLastName());
        runnerIndDTO1.setEmail(runnerMultDTO.getEmail());
        runnerIndDTO1.setBirthdate(runnerMultDTO.getBirthdate());
        runnerIndDTO1.setDni(runnerMultDTO.getDni());
        runnerIndDTO1.setCity(runnerMultDTO.getCity());
        runnerIndDTO1.setPhoneNumber(runnerMultDTO.getPhoneNumber());
        runnerIndDTO1.setGenderId(runnerMultDTO.getGenderId());

        Runner runner1 = runnerService.create(runnerIndDTO1);

        RunnerIndDTO runnerIndDTO2 = new RunnerIndDTO();

        runnerIndDTO2.setName(runnerMultDTO.getName2());
        runnerIndDTO2.setLastName(runnerMultDTO.getLastName2());
        runnerIndDTO2.setEmail(runnerMultDTO.getEmail2());
        runnerIndDTO2.setBirthdate(runnerMultDTO.getBirthdate2());
        runnerIndDTO2.setDni(runnerMultDTO.getDni2());
        runnerIndDTO2.setCity(runnerMultDTO.getCity2());
        runnerIndDTO2.setPhoneNumber(runnerMultDTO.getPhoneNumber2());
        runnerIndDTO2.setGenderId(runnerMultDTO.getGender2Id());

        Runner runner2 = runnerService.create(runnerIndDTO2);

        RunnerMult runnerMult = new RunnerMult();

        runnerList.add(runner1);
        runnerList.add(runner2);

        runnerMult.setRunnerList(runnerList);
        Kit kit = kitService.createNumer(runnerMultDTO.getKitId());
        runnerMult.setKit(kit);

        if(runnerMultDTO.getCategoryName() != null){
            Category category = categoryService.findByName(runnerMultDTO.getCategoryName());
            runnerMult.setCategory(category);
        }

        if(runnerMultDTO.getVehicleId()!= null){
            Vehicle vehicle = vehicleService.findById(runnerMultDTO.getVehicleId());
            runnerMult.setVehicle(vehicle);
        }

        if(runnerMultDTO.getTeamId()!=null){
            Team team = teamService.findById(runnerMultDTO.getTeamId());
            runnerMult.setTeam(team);
        }

        runnerMultRepository.save(runnerMult);

        return runnerMult;
    }

    @Override
    public RunnerMult findByDni(String dni) throws Exception {
        RunnerMult runnerMult = runnerMultRepository.findByRunnerDniInRunnerMult(dni);

        if(runnerMult==null){
            throw new Exception("No hay una persona");
        }

        return runnerMult;
    }

    @Override
    public List<RunnerMult> createAll(List<RunnerMultDTO> runnerMultDTOList) throws Exception {
        List<RunnerMult> runnerMults = new ArrayList<>();

        for (RunnerMultDTO runnerMultDTO:runnerMultDTOList ) {
            RunnerMult runnerMult = create(runnerMultDTO);
            runnerMults.add(runnerMult);
        }

        return runnerMults;
    }

}
