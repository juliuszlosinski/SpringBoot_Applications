package ksi.efit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ksi.efit.models.piatek;

@Repository
public interface piatekRepository extends JpaRepository<piatek, Integer> {

}
