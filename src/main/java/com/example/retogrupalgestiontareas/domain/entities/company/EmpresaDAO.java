package com.example.retogrupalgestiontareas.domain.entities.company;

import com.example.retogrupalgestiontareas.domain.DAO;
import com.example.retogrupalgestiontareas.domain.entities.user.Usuario;

import java.util.ArrayList;

public class EmpresaDAO implements DAO<Empresa> {
    @Override
    public ArrayList<Empresa> getAllByUser(Usuario u) {
        return null;
    }

    @Override
    public Empresa get(Long id) {
        return null;
    }

    @Override
    public Empresa save(Empresa data) {
        return null;
    }

    @Override
    public void update(Empresa data) {

    }

    @Override
    public void delete(Empresa data) {

    }
}
