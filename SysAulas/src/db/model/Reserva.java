package db.model;
// Generated 24/10/2017 16:38:54 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Reserva generated by hbm2java
 */
public class Reserva  implements java.io.Serializable {


     private Integer idReserva;
     private Bedel bedel;
     private Catedra catedra;
     private Docente docente;
     private Integer cantidadAlumnos;
     private Set aulas = new HashSet(0);

    public Reserva() {
    }

	
    public Reserva(Bedel bedel, Catedra catedra, Docente docente) {
        this.bedel = bedel;
        this.catedra = catedra;
        this.docente = docente;
    }
    public Reserva(Bedel bedel, Catedra catedra, Docente docente, Integer cantidadAlumnos, Set aulas) {
       this.bedel = bedel;
       this.catedra = catedra;
       this.docente = docente;
       this.cantidadAlumnos = cantidadAlumnos;
       this.aulas = aulas;

    }
   
    public Integer getIdReserva() {
        return this.idReserva;
    }
    
    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }
    public Bedel getBedel() {
        return this.bedel;
    }
    
    public void setBedel(Bedel bedel) {
        this.bedel = bedel;
    }
    public Catedra getCatedra() {
        return this.catedra;
    }
    
    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }
    public Docente getDocente() {
        return this.docente;
    }
    
    public void setDocente(Docente docente) {
        this.docente = docente;
    }
    public Integer getCantidadAlumnos() {
        return this.cantidadAlumnos;
    }
    
    public void setCantidadAlumnos(Integer cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public Set getAulas() {
        return this.aulas;
    }
    
    public void setAulas(Set aulas) {
        this.aulas = aulas;
    }





}


