package com.springboot.satisfaccion.servicio.encuestas.moduloresultado.model.repository;

import com.springboot.satisfaccion.servicio.encuestas.moduloresultado.model.entities.EncuestaModuloResultado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EncuestaModuloResultadoRepository extends MongoRepository<EncuestaModuloResultado, Long>
{
}
