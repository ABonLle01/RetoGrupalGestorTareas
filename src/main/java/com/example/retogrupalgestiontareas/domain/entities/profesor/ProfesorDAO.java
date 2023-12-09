package com.example.retogrupalgestiontareas.domain.entities.profesor;

import com.example.retogrupalgestiontareas.domain.DAO;
import com.example.retogrupalgestiontareas.domain.HibernateUtil;
import com.example.retogrupalgestiontareas.domain.entities.company.Empresa;
import com.example.retogrupalgestiontareas.domain.entities.activity.Actividad;
import com.example.retogrupalgestiontareas.domain.entities.alumno.Alumno;
import com.example.retogrupalgestiontareas.domain.entities.profesor.Profesor;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import lombok.extern.java.Log;

import java.util.List;
import java.util.ArrayList;

@Log
public class ProfesorDAO implements DAO<Profesor> {

    @Override
    public List<Profesor> getAll( ) {
        List<Profesor> result = null;
        try( org.hibernate.Session s = HibernateUtil.getSessionFactory().openSession()) {
            Query<Profesor> q = s.createQuery( "from Profesor ", Profesor.class);
            result = q.getResultList();
        }
        catch ( Exception ignore ){
        }
        return result;
    }

    @Override
    public Profesor get(Long id) {
        return null;
    }

    @Override
    public Profesor save(Profesor data) {
        return null;
    }

    @Override
    public void update(Profesor data) {

    }

    @Override
    public void delete(Profesor data) {

    }

    public Profesor loadLogin(String user, String pass) {
        Profesor result = null;

        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            Query<Profesor> q = session.createQuery("from Profesor where email=:email and password=:password", Profesor.class);
            q.setParameter("email",user);
            q.setParameter("password",pass);

            try {
                result = q.getSingleResult();
            }catch (Exception e){

            }
        }
        return result;


    }
}
