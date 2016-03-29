/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniminuto.arqsw.proyecto.DAO;

import edu.uniminuto.arqsw.proyecto.Hibernate.Categoria;
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
public class CategoriaDAO {
    
    public void addCategoria(Categoria cat){
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            Transaction tx = session.beginTransaction();
            session.save(cat);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.close();
        }    
    }
    
    
    public List<Categoria> getAllCategorias(){
        List<Categoria> categorias = new ArrayList<Categoria>();
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try{
            Transaction tx = session.beginTransaction();
            categorias = session.createQuery("from Categoria").list();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        
        return categorias; 
    }
    
    
    public Categoria getCategoriaById(int id){
        Categoria categoria = null;
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try{
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("from Categoria where id = :id");
            query.setParameter("id", id);
            categoria = (Categoria) query.uniqueResult();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        
        return categoria;
    }
    
}
