package com.springboot.satisfaccion.servicio.encuestas.moduloexpectativa.model.repository;

import com.springboot.satisfaccion.servicio.encuestas.moduloexpectativa.model.entities.EncuestaModuloExpectativa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EncuestaModuloExpectativaRepository extends MongoRepository<EncuestaModuloExpectativa, Long>
{
}
