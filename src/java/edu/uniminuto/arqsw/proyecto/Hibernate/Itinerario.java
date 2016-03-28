package edu.uniminuto.arqsw.proyecto.Hibernate;
// Generated 26/03/2016 11:41:57 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Itinerario generated by hbm2java
 */
public class Itinerario  implements java.io.Serializable {


     private Integer id;
     private Usuario usuario;
     private Date fechaInicio;
     private Date fechaFin;
     private Set ciudads = new HashSet(0);

    public Itinerario() {
    }

	
    public Itinerario(Usuario usuario, Date fechaInicio, Date fechaFin) {
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    public Itinerario(Usuario usuario, Date fechaInicio, Date fechaFin, Set ciudads) {
       this.usuario = usuario;
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
       this.ciudads = ciudads;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    public Set getCiudads() {
        return this.ciudads;
    }
    
    public void setCiudads(Set ciudads) {
        this.ciudads = ciudads;
    }




}


