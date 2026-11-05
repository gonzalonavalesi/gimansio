package com.gimnasio.registro.repository;

import com.gimnasio.registro.model.RegistroDiario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface RegistroDiarioRepository extends JpaRepository<RegistroDiario,Long> {
    List<RegistroDiario> findByUsuarioIdOrderByFechaDesc(Long usuarioId);
    List<RegistroDiario> findByUsuarioIdAndFechaBetween(Long usuarioId, LocalDate desde, LocalDate hasta);
    Optional<RegistroDiario> findFirstByUsuarioIdAndRutinaIdOrderByFechaDesc(Long usuarioId, Long rutinaId);
}
