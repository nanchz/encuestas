package com.springboot.satisfaccion.servicio.encuestas.modulodesempenoproceso.repository;

import com.springboot.satisfaccion.servicio.encuestas.modulodesempenoproceso.entities.EncuestaModuloDesempenoProceso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EncuestaModuloDesempenoProcesoRepository extends MongoRepository<EncuestaModuloDesempenoProceso, Long>
{
}
