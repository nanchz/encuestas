package com.springboot.satisfaccion.servicio.encuestas.moduloexpectativa.service;

import com.springboot.satisfaccion.servicio.encuestas.commons.GenericServiceImpl;
import com.springboot.satisfaccion.servicio.encuestas.moduloexpectativa.model.entities.EncuestaModuloExpectativa;
import com.springboot.satisfaccion.servicio.encuestas.moduloexpectativa.model.repository.EncuestaModuloExpectativaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EncuestaModuloExpectativaServiceImpl extends GenericServiceImpl <EncuestaModuloExpectativa, Long> implements EncuestaModuloExpectativaService
{
    @Autowired
    private EncuestaModuloExpectativaRepository encuestaModuloExpectativaRepository;

    @Override
    public CrudRepository<EncuestaModuloExpectativa, Long> getDao()
    {
        return encuestaModuloExpectativaRepository;
    }
}
