package ksi.efit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ksi.efit.models.niedziela;


@Repository
public interface niedzielaRepository extends JpaRepository<niedziela, Integer> {

}
