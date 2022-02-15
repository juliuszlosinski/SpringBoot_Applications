package ksi.efit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ksi.efit.models.czwartek;

@Repository
public interface czwartekRepository extends JpaRepository<czwartek, Integer> {

}
