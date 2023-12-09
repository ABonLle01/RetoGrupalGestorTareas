package com.example.retogrupalgestiontareas.domain.entities.alumn;

import com.example.retogrupalgestiontareas.domain.DAO;
import com.example.retogrupalgestiontareas.domain.HibernateUtil;
import lombok.extern.java.Log;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

@Log
public class AlumnoDAO implements DAO<Alumno> {
    @Override
    public List<Alumno> getAllByAlumno(Alumno a) {
        return null;
    }

    @Override
    public Alumno get(Long id) {
        return null;
    }

    @Override
    public List<Alumno> getAll(Integer tutor) {
        List<Alumno> resultList = new ArrayList<>();

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Alumno> q = session.createQuery("from Alumno where profesor.id=:t", Alumno.class);
            q.setParameter("t", tutor);

            try {
                resultList = q.getResultList();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return resultList;
    }



    @Override
    public Alumno save(Alumno data) {
        return null;
    }

    @Override
    public void update(Alumno data) {
    }

    @Override
    public void delete(Alumno data) {

    }

    public Alumno validateUser(String email, String pass){
        Alumno result=null;

        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            Query<Alumno> q = session.createQuery("from Alumno where email=:e and password=:p", Alumno.class);
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
