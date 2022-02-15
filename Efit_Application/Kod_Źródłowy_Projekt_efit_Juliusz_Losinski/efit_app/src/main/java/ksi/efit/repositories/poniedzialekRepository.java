package ksi.efit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ksi.efit.models.poniedzialek;

@Repository
public interface poniedzialekRepository extends JpaRepository<poniedzialek, Integer> {

}
