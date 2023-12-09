package com.example.retogrupalgestiontareas;

import com.example.retogrupalgestiontareas.domain.entities.activity.Actividad;
import com.example.retogrupalgestiontareas.domain.entities.company.Empresa;
import com.example.retogrupalgestiontareas.domain.entities.alumn.Alumno;
import com.example.retogrupalgestiontareas.domain.entities.teacher.Profesor;

import lombok.*;
public class Session {
    @Getter
    @Setter
    private static Alumno currentAlumn;

    @Getter
    @Setter
    private static Empresa currentCompany;

    @Getter
    @Setter
    private static Actividad currentActivity;

    @Setter
    @Getter
    private static Profesor currentTeacher;

    public static void logOut(){
        currentAlumn = null;
        currentTeacher = null;
    }



}
