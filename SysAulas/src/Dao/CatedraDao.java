/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import db.model.Catedra;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author luciano
 */
public class CatedraDao {
    private static Session sesion;
    

    public static Session getSesion() {
        return sesion;
    }

    public static void setSesion(Session sesion) {
        CatedraDao.sesion = sesion;
    }

    public static Catedra find(String nombreCatedra) {
        Transaction tx = null;
        List catedras = new ArrayList<>();
        try {
            tx = sesion.beginTransaction();
            catedras = sesion.createQuery("FROM Catedra c WHERE c.nombreCatedra ='" + nombreCatedra+"'").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        
        if (catedras.size() == 1) {
            return (Catedra) catedras.get(0);
        } else {
            return null;
        }
    }
}
