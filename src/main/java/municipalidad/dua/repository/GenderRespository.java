package municipalidad.dua.repository;

import municipalidad.dua.entities.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderRespository extends JpaRepository<Gender, Integer> {
}
