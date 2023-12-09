package com.example.retogrupalgestiontareas.domain.entities.activity;

import com.example.retogrupalgestiontareas.domain.DAO;
import com.example.retogrupalgestiontareas.domain.HibernateUtil;
//import com.example.retogrupalgestiontareas.domain.entities.user.Usuario;

import com.example.retogrupalgestiontareas.domain.entities.alumn.Alumno;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class ActividadDAO implements DAO<Actividad> {
    @Override
    public ArrayList<Actividad> getAllByAlumno(Alumno a) {
        ArrayList<Actividad> results;

        try(Session s = HibernateUtil.getSessionFactory().openSession()){
            Query<Actividad> q = s.createQuery("from Actividad where alumno.id=:userId",Actividad.class);
            q.setParameter("userId",a.getId());
            results = (ArrayList<Actividad>) q.getResultList();
        }

        return results;
    }


    @Override
    public Actividad get(Long id) {
        return null;
    }

    @Override
    public List<Actividad> getAll(Integer tutor) {
        return null;
    }


    @Override
    public Actividad save(Actividad data) {
        return null;
    }

    @Override
    public void update(Actividad data) {

    }

    @Override
    public void delete(Actividad data) {

    }
}
