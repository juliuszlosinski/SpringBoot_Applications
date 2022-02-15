package ksi.efit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ksi.efit.models.rodzajcwiczenia;

@Repository
public interface rodzajcwiczeniaRepository extends JpaRepository<rodzajcwiczenia, String>{

}
