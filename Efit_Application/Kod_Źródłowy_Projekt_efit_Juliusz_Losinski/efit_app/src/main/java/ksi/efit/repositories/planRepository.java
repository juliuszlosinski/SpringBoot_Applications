package ksi.efit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ksi.efit.models.plan;

@Repository
public interface planRepository extends JpaRepository<plan, Integer> {

}
