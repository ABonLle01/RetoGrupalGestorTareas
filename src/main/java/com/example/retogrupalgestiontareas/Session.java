package com.example.retogrupalgestiontareas;

import com.example.retogrupalgestiontareas.domain.Empresa;
import com.example.retogrupalgestiontareas.domain.Usuario;

import lombok.*;
public class Session {
    @Getter
    @Setter
    private static Usuario currentUser;

    @Getter
    @Setter
    private static Empresa currentCompany;
}
