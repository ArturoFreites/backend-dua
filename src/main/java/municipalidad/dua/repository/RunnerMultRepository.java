package municipalidad.dua.repository;

import municipalidad.dua.entities.RunnerMult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RunnerMultRepository extends JpaRepository<RunnerMult,Integer> {

    @Query("SELECT rm FROM RunnerMult rm JOIN rm.runnerList r WHERE r.dni = :dni")
    RunnerMult findByRunnerDniInRunnerMult(@Param("dni") String dni);

}
