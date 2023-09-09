package municipalidad.dua.services;

import municipalidad.dua.dtos.RunnerIndDTO;
import municipalidad.dua.entities.Runner;
import municipalidad.dua.repository.RunnerRepository;

import java.util.List;

public interface RunnerService {


    Runner create(RunnerIndDTO runnerIndDTO) throws Exception;

    Runner findById(Integer id) throws Exception;

    List<Runner> findAll();

    Long countAll();
}
