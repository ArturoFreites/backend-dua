package municipalidad.dua.repository;


import municipalidad.dua.entities.Runner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RunnerRepository extends JpaRepository<Runner,Integer> {

}
