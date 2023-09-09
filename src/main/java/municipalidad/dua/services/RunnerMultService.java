package municipalidad.dua.services;

import municipalidad.dua.dtos.RunnerMultDTO;
import municipalidad.dua.entities.RunnerMult;

import java.util.List;

public interface RunnerMultService {
    RunnerMult create(RunnerMultDTO runnerMultDTO) throws Exception;

    RunnerMult findByDni(String dni) throws Exception;

    List<RunnerMult> createAll(List<RunnerMultDTO> runnerMultDTOList) throws Exception;
}
