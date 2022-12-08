package com.springboot.satisfaccion.servicio.encuestas.moduloresultado.service;

import com.springboot.satisfaccion.servicio.encuestas.commons.GenericServiceImpl;
import com.springboot.satisfaccion.servicio.encuestas.moduloresultado.model.entities.EncuestaModuloResultado;
import com.springboot.satisfaccion.servicio.encuestas.moduloresultado.model.repository.EncuestaModuloResultadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EncuestaModuloResultadoServiceImpl extends GenericServiceImpl <EncuestaModuloResultado, Long> implements EncuestaModuloResultadoService
{
    @Autowired
    private EncuestaModuloResultadoRepository encuestaModuloResultadoRepository;

    @Override
    public CrudRepository<EncuestaModuloResultado, Long> getDao()
    {
        return encuestaModuloResultadoRepository;
    }
}
