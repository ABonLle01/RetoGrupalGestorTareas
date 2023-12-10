package com.example.retogrupalgestiontareas.domain.entities.teacher;

import com.example.retogrupalgestiontareas.domain.DAO;
import com.example.retogrupalgestiontareas.domain.HibernateUtil;
import com.example.retogrupalgestiontareas.domain.entities.alumn.Alumno;
import org.hibernate.Session;
import org.hibernate.query.Query;


import lombok.extern.java.Log;

import java.util.List;

@Log
public class ProfesorDAO implements DAO<Profesor> {

    /*@Override
    public List<Profesor> getAll( ) {
        List<Profesor> result = null;
        try( org.hibernate.Session s = HibernateUtil.getSessionFactory().openSession()) {
            Query<Profesor> q = s.createQuery( "from Profesor ", Profesor.class);
            result = q.getResultList();
        }
        catch ( Exception ignore ){
        }
        return result;
    }*/

    @Override
    public List<Profesor> getAllByAlumno(Alumno a) {
        return null;
    }

    @Override
    public Profesor get(Long id) {
        return null;
    }

    @Override
    public List<Profesor> getAll(Integer tutor) {
        return null;
    }


    @Override
    public Profesor save(Profesor data) {
        return null;
    }

    @Override
    public Alumno update(Profesor data) {

        return null;
    }

    @Override
    public void delete(Profesor data) {

    }

    public static Profesor validateTeacher(String email, String pass){
        Profesor result=null;

        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            Query<Profesor> q = session.createQuery("from Profesor where email=:e and password=:p", Profesor.class);
            q.setParameter("e",email);
            q.setParameter("p",pass);

            try{
                result = q.getSingleResult();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        return result;

    }
}
