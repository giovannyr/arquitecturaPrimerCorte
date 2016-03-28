/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniminuto.arqsw.proyecto.DAO;

import edu.uniminuto.arqsw.proyecto.Hibernate.HibernateUtil;
import edu.uniminuto.arqsw.proyecto.Hibernate.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author GIOVANNY
 */
public class UsuarioDAO {

    Session session = null;

    public UsuarioDAO() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }

    public Usuario getUserByRol(String rol) {
        Usuario usuario = new Usuario();
        
        try {
            Transaction tx = session.beginTransaction();
            String queryString = "from Usuario u where u.rol = :rol";
            Query query = session.createQuery(queryString);
            query.setParameter("rol", rol);
            usuario = (Usuario) query.uniqueResult();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        
        return usuario;
    }

}
