package municipalidad.dua.services;

import municipalidad.dua.dtos.RunnerIndDTO;
import municipalidad.dua.entities.RunnerInd;

import java.util.List;

public interface RunnerIndService {
    RunnerInd create(RunnerIndDTO runnerIndDTO) throws Exception;

    RunnerInd findById(Integer id) throws Exception;

    List<RunnerInd> findAll();

    RunnerInd findByDni(String dni) throws Exception;

    List<RunnerInd> createAll(List<RunnerIndDTO> runnerIndDTOS) throws Exception;
}
