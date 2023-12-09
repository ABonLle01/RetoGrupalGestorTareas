package com.example.retogrupalgestiontareas;

import com.example.retogrupalgestiontareas.domain.entities.activity.Actividad;
import com.example.retogrupalgestiontareas.domain.entities.company.Empresa;
import com.example.retogrupalgestiontareas.domain.entities.alumno.Alumno;
import com.example.retogrupalgestiontareas.domain.entities.profesor.Profesor;

import lombok.*;
public class Session {
    @Getter
    @Setter
    private static Alumno alumnoLogged;

    @Getter
    @Setter
    private static Empresa currentCompany;

    @Getter
    @Setter
    private static Actividad currentActivity;

    @Setter
    @Getter
    private static Profesor teacherLogged;

    public static void logOut(){
        teacherLogged = null;
        alumnoLogged = null;
    }


}
