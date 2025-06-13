package it.epicode.u5w2d5pratica.repository;

import it.epicode.u5w2d5pratica.model.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DipendenteRepository extends JpaRepository<Dipendente,Integer> {
}
