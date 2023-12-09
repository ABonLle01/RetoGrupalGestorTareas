package com.example.retogrupalgestiontareas.domain.entities.company;

import com.example.retogrupalgestiontareas.domain.DAO;
import com.example.retogrupalgestiontareas.domain.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class EmpresaDAO implements DAO<Empresa> {

    @Override
    public List<Empresa> getAll( ) {
        List<Empresa> result = null;
        try( Session s = HibernateUtil.getSessionFactory().openSession()) {
            Query<Empresa> q = s.createQuery( "from Empresa", Empresa.class);
            result = q.getResultList();
        }
        catch ( Exception ignore ){
        }
        return result;
    }
//    @Override
//    public ArrayList<Empresa> getAll() {
//        return null;
//    }

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
