package com.gimnasio.registro.repository;

import com.gimnasio.registro.model.RutinaEjercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface RutinaEjercicioRepository extends JpaRepository<RutinaEjercicio,Long> {
    List<RutinaEjercicio> findByRutinaIdOrderByOrdenAsc(Long rutinaId);
    void deleteByRutinaId(Long rutinaId);
}
