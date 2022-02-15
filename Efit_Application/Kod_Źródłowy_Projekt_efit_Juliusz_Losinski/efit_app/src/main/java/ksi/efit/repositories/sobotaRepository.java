package ksi.efit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ksi.efit.models.sobota;

@Repository
public interface sobotaRepository extends JpaRepository<sobota, Integer> {

}
