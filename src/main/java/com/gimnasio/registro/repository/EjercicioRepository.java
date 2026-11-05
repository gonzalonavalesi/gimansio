package com.gimnasio.registro.repository;

import com.gimnasio.registro.enums.GrupoMuscular;
import com.gimnasio.registro.model.Ejercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EjercicioRepository extends JpaRepository<Ejercicio,Long> {
    List<GrupoMuscular> findbyGrupoMuscular(GrupoMuscular grupoMuscular);
}
