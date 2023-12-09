package com.example.retogrupalgestiontareas.domain.entities;

import com.example.retogrupalgestiontareas.domain.HibernateUtil;
import com.example.retogrupalgestiontareas.domain.entities.alumn.Alumno;
import com.example.retogrupalgestiontareas.domain.entities.teacher.Profesor;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class Usuario {

    public static Alumno validateAlumn(String email, String pass){
        Alumno result=null;

        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            Query<Alumno> q = session.createQuery("from Alumno where email=:e and password=:p", Alumno.class);
            q.setParameter("e",email);
            q.setParameter("p",pass);


            try{
                result = q.getSingleResult();
            } catch (Exception e) {
                //System.out.println(e.getMessage());
            }

        }
        return result;

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
                //System.out.println(e.getMessage());
            }

        }
        return result;

    }



}
