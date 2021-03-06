/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniminuto.arqsw.proyecto.DAO;

import edu.uniminuto.arqsw.proyecto.Hibernate.Evento;
import edu.uniminuto.arqsw.proyecto.Hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author GIOVANNY
 */
public class EventoDAO {

    //Session session = null;
    /*public EventoDAO() {
     //this.session = HibernateUtil.getSessionFactory().openSession();
     }*/
    public void addEvento(Evento evento, Set evCiu) {
        evento.setCiudads(evCiu);

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            Transaction tx = session.beginTransaction();
            session.save(evento);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public List<Evento> getAll() {
        List<Evento> eventos = new ArrayList<Evento>();

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            Transaction tx = session.beginTransaction();
            eventos = session.createQuery("from Evento").list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return eventos;
    }

}

