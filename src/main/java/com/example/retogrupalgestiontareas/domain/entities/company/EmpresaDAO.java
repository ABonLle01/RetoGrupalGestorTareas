package com.example.retogrupalgestiontareas.domain.entities.company;

import com.example.retogrupalgestiontareas.domain.DAO;
import com.example.retogrupalgestiontareas.domain.HibernateUtil;
import com.example.retogrupalgestiontareas.domain.entities.activity.Actividad;
import com.example.retogrupalgestiontareas.domain.entities.alumn.Alumno;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
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
        ArrayList<Empresa> results;

        try(Session s = HibernateUtil.getSessionFactory().openSession()){
            Query<Empresa> q = s.createQuery("select distinct e from Empresa e join e.alumno a where a.profesor.id = :idTutor",Empresa.class);
            q.setParameter("idTutor",tutor);
            results = (ArrayList<Empresa>) q.getResultList();
        }

        return results;
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
