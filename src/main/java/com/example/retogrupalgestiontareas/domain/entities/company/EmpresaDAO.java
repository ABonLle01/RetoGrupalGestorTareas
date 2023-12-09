package com.example.retogrupalgestiontareas.domain.entities.company;

import com.example.retogrupalgestiontareas.domain.DAO;
import com.example.retogrupalgestiontareas.domain.HibernateUtil;
import com.example.retogrupalgestiontareas.domain.entities.alumn.Alumno;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class EmpresaDAO implements DAO<Empresa> {

    @Override
    public List<Empresa> getAllByAlumno(Alumno a) {
        return null;
    }

    @Override
    public Empresa get(Long id) {
        return null;
    }

    @Override
    public List<Empresa> getAll(Integer tutor) {
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
