package com.gimnasio.registro.repository;

import com.gimnasio.registro.model.SerieRegistro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SerieRegistroRepository extends JpaRepository<SerieRegistro,Long> {
    List<SerieRegistro> findByRegistroDiarioId(Long registroDiarioId);
}
