package edu.uniminuto.arqsw.proyecto.Hibernate;
// Generated 26/03/2016 11:41:57 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * ParticipacionForo generated by hbm2java
 */
public class ParticipacionForo  implements java.io.Serializable {


     private Integer id;
     private Foro foro;
     private Usuario usuario;
     private String participacion;
     private Date fecha;

    public ParticipacionForo() {
    }

    public ParticipacionForo(Foro foro, Usuario usuario, String participacion, Date fecha) {
       this.foro = foro;
       this.usuario = usuario;
       this.participacion = participacion;
       this.fecha = fecha;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Foro getForo() {
        return this.foro;
    }
    
    public void setForo(Foro foro) {
        this.foro = foro;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getParticipacion() {
        return this.participacion;
    }
    
    public void setParticipacion(String participacion) {
        this.participacion = participacion;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }




}


