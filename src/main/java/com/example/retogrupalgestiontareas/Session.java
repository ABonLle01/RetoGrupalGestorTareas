package com.example.retogrupalgestiontareas;

import com.example.retogrupalgestiontareas.domain.entities.Actividad;
import com.example.retogrupalgestiontareas.domain.entities.Empresa;
import com.example.retogrupalgestiontareas.domain.entities.user.Usuario;

import lombok.*;
public class Session {
    @Getter
    @Setter
    private static Usuario currentUser;

    @Getter
    @Setter
    private static Empresa currentCompany;

    @Getter
    @Setter
    private static Actividad currentActivity;
}
