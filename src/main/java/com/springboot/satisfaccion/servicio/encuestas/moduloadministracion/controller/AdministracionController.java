package com.springboot.satisfaccion.servicio.encuestas.moduloadministracion.controller;

import com.springboot.satisfaccion.servicio.encuestas.moduloexpectativa.model.entities.EncuestaModuloExpectativa;
import com.springboot.satisfaccion.servicio.encuestas.moduloexpectativa.service.EncuestaModuloExpectativaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="*")
public class AdministracionController
{
    @Autowired
    private EncuestaModuloExpectativaService encuestaModuloExpectativaService;


    public List<EncuestaModuloExpectativa> totalEncuestasModuloExpectativa()
    {
        return encuestaModuloExpectativaService.getAll();
    }
    //Crear el mismo metodo de arriba para todos los services

    public List totalEncuestas()
    {
        List allList = new ArrayList();
        allList.addAll(totalEncuestasModuloExpectativa());
        //de aqui para abajo llamo a todos los service
        return allList;
    }

/*    La entidad deberá tener acceso a las respuestas del usuario mediante una base de datos
    que almacenará la totalidad de las respuestas las cuales se podrán agrupar por promedios mensuales,
    semestrales y anuales respecto a las calificaciones realizadas.*/
}
