package com.example.retogrupalgestiontareas.domain.entities.alumno;

import com.example.retogrupalgestiontareas.domain.DAO;
import com.example.retogrupalgestiontareas.domain.HibernateUtil;
import lombok.extern.java.Log;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

@Log
public class AlumnoDAO implements DAO<Alumno> {
//    @Override
//    public ArrayList<Usuario> getAll() {
//        return null;
//    }

    @Override
    public Alumno get(Long id) {
        return null;
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
    @Override
    public List<Alumno> getAll( ) {
        List<Alumno> result = null;
        try( Session s = HibernateUtil.getSessionFactory().openSession()) {
            Query<Alumno> q = s.createQuery( "from Alumno ", Alumno.class);
            result = q.getResultList();
        }
        catch ( Exception ignore ){
        }
        return result;
    }

    public Alumno validateUser(String email, String pass){
        Alumno result=null;

        //Test de sesion
        System.out.println("AQui");
        System.out.println(HibernateUtil.getSessionFactory());

        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            Query<Alumno> q = session.createQuery("from Alumno where email=:e and password=:p", Alumno.class);
            q.setParameter("e",email);
            q.setParameter("p",pass);
//            var resultado = q.getResultList();
//            if(!resultado.isEmpty()) result = resultado.get(0);

            try{
                result = q.getSingleResult();
            } catch (Exception e) {
//                System.out.println(e.getMessage());
            }

        }
        return result;

    }
}
