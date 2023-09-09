package municipalidad.dua.services.impl;

import municipalidad.dua.dtos.RunnerIndDTO;
import municipalidad.dua.entities.Runner;
import municipalidad.dua.repository.RunnerRepository;
import municipalidad.dua.services.GenderService;
import municipalidad.dua.services.RunnerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RunnerServiceImpl implements RunnerService {

    private final GenderService genderService;
    private final RunnerRepository runnerRepository;

    public RunnerServiceImpl(GenderService genderService, RunnerRepository runnerRepository) {
        this.genderService = genderService;
        this.runnerRepository = runnerRepository;
    }

    @Override
    public Runner create(RunnerIndDTO runnerIndDTO) throws Exception {

        Runner runner = new Runner();

        runner.setName(runnerIndDTO.getName());
        runner.setLastName(runnerIndDTO.getLastName());
        runner.setEmail(runnerIndDTO.getEmail());
        runner.setCity(runnerIndDTO.getCity());
        runner.setDni(runnerIndDTO.getDni());
        runner.setPhoneNumber(runnerIndDTO.getPhoneNumber());
        runner.setBirthdate(runnerIndDTO.getBirthdate());
        if(runnerIndDTO.getGenderId()!=null){
            runner.setGender(genderService.findById(runnerIndDTO.getGenderId()));
        }


        runnerRepository.save(runner);

        return runner;
    }

    @Override
    public Runner findById(Integer id) throws Exception {
        Optional<Runner> runner = runnerRepository.findById(id);
        if (runner.isEmpty()){
            throw new Exception("El corredor no existe");
        }
        return runner.get();
    }

    @Override
    public List<Runner> findAll() {
        return runnerRepository.findAll();
    }

    @Override
    public Long countAll(){
        return runnerRepository.count();
    }

}
