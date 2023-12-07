package com.example.retogrupalgestiontareas.domain.entities.user;

import com.example.retogrupalgestiontareas.domain.DAO;
import com.example.retogrupalgestiontareas.domain.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;

public class UsuarioDAO implements DAO<Usuario> {
    @Override
    public ArrayList<Usuario> getAll() {
        return null;
    }

    @Override
    public Usuario get(Long id) {
        return null;
    }

    @Override
    public Usuario save(Usuario data) {
        return null;
    }

    @Override
    public void update(Usuario data) {
    }

    @Override
    public void delete(Usuario data) {

    }

    public Usuario validateUser(String email, String pass){
        Usuario result=null;

        //por algun motivo, la sesion es null
        //todo: arreglar hibernate para que no sea null
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            Query<Usuario> q = session.createQuery("from Usuario where email=:e and password=:p", Usuario.class);
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
