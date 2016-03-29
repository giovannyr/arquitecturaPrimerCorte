/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniminuto.arqsw.proyecto.DAO;

import edu.uniminuto.arqsw.proyecto.Hibernate.HibernateUtil;
import edu.uniminuto.arqsw.proyecto.Hibernate.Hotel;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author GIOVANNY
 */
public class HotelDAO {
    
    
    public void addHotel(Hotel hotel){  
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            Transaction tx = session.beginTransaction();
            session.save(hotel);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.close();
        }    
    }
    
    
}
