/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniminuto.arqsw.proyecto.DAO;

import edu.uniminuto.arqsw.proyecto.Hibernate.Ciudad;
import edu.uniminuto.arqsw.proyecto.Hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author GIOVANNY
 */
public class CiudadDAO {
    
    
    public Ciudad getCiudadById(int id){
        Ciudad ciudad = null;
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try{
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("from Ciudad where id = :id");
            query.setParameter("id", id);
            ciudad = (Ciudad) query.uniqueResult();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        
        return ciudad;        
    }
    
    
    public List<Ciudad> getAllCities(){
        List<Ciudad> ciudades = new ArrayList<Ciudad>();
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try{
            Transaction tx = session.beginTransaction();
            ciudades = session.createQuery("from Ciudad").list();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        
        return ciudades;        
    }
}
