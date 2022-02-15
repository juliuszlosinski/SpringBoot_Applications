package ksi.efit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ksi.efit.models.sroda;

@Repository
public interface srodaRepository extends JpaRepository<sroda, Integer> {

}
