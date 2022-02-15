package ksi.efit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ksi.efit.models.wtorek;

@Repository
public interface wtorekRepository extends JpaRepository<wtorek, Integer> {

}
