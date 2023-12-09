package com.example.retogrupalgestiontareas.domain;

import lombok.extern.java.Log;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Log
public class HibernateUtil {

    private static SessionFactory sf = null;

    static {
        try {
            Configuration cfg = new Configuration();
            sf = cfg.configure().buildSessionFactory();
            log.info("SessionFactory creada con éxito!");
        } catch (Exception e) {
            log.severe("Error al crear SessionFactory: " + e.getMessage());
            e.printStackTrace();
        }
    }


//    private static final SessionFactory sf;
//
//    static{
//        Configuration cfg = new Configuration();
//        cfg.configure();
//        sf = cfg.buildSessionFactory();
//
//        System.out.println("Sesion factory");
//        System.out.println(sf);
//    }


    public static SessionFactory getSessionFactory(){
        return sf;
    }
}
