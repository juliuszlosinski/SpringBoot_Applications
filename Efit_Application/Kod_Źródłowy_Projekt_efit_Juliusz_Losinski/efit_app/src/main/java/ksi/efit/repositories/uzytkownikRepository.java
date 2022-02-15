package ksi.efit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ksi.efit.models.uzytkownik;

@Repository
public interface uzytkownikRepository extends JpaRepository<uzytkownik, String> {

}
