package municipalidad.dua.repository;

import municipalidad.dua.entities.RunnerInd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RunnerIndRepository extends JpaRepository<RunnerInd,Integer> {

    @Query("SELECT ri FROM RunnerInd ri WHERE ri.runner.dni = :dni")
    RunnerInd findByRunnerDni(@Param("dni") String dni);

}
