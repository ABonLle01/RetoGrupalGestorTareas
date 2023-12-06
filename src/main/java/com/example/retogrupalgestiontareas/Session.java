package com.example.retogrupalgestiontareas;

import com.example.retogrupalgestiontareas.domain.entities.Empresa;
import com.example.retogrupalgestiontareas.domain.entities.Usuario;

import lombok.*;
public class Session {
    @Getter
    @Setter
    private static Usuario currentUser;

    @Getter
    @Setter
    private static Empresa currentCompany;
}
