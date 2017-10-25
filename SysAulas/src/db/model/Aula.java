package db.model;
// Generated 24/10/2017 16:38:54 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Aula generated by hbm2java
 */
public class Aula  implements java.io.Serializable {


     private Integer idAula;
     private Reserva reserva;
     private Integer ubicacion;
     private Integer capacidad;
     private String estado;
     private String tipoPizarron;
     private String aireAcondicionado;
     private SinRecursos sinRecursos;
     private Set aulaAsociaFechas = new HashSet(0);
     private Informatica informatica;
     private Multimedios multimedios;

    public Aula() {
    }

	
    public Aula(Reserva reserva) {
        this.reserva = reserva;
    }
    public Aula(Reserva reserva, Integer ubicacion, Integer capacidad, String estado, String tipoPizarron, String aireAcondicionado, SinRecursos sinRecursos, Set aulaAsociaFechas, Informatica informatica, Multimedios multimedios) {
       this.reserva = reserva;
       this.ubicacion = ubicacion;
       this.capacidad = capacidad;
       this.estado = estado;
       this.tipoPizarron = tipoPizarron;
       this.aireAcondicionado = aireAcondicionado;
       this.sinRecursos = sinRecursos;
       this.aulaAsociaFechas = aulaAsociaFechas;
       this.informatica = informatica;
       this.multimedios = multimedios;
    }
   
    public Integer getIdAula() {
        return this.idAula;
    }
    
    public void setIdAula(Integer idAula) {
        this.idAula = idAula;
    }
    public Reserva getReserva() {
        return this.reserva;
    }
    
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    public Integer getUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }
    public Integer getCapacidad() {
        return this.capacidad;
    }
    
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getTipoPizarron() {
        return this.tipoPizarron;
    }
    
    public void setTipoPizarron(String tipoPizarron) {
        this.tipoPizarron = tipoPizarron;
    }
    public String getAireAcondicionado() {
        return this.aireAcondicionado;
    }
    
    public void setAireAcondicionado(String aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
    public SinRecursos getSinRecursos() {
        return this.sinRecursos;
    }
    
    public void setSinRecursos(SinRecursos sinRecursos) {
        this.sinRecursos = sinRecursos;
    }
    public Set getAulaAsociaFechas() {
        return this.aulaAsociaFechas;
    }
    
    public void setAulaAsociaFechas(Set aulaAsociaFechas) {
        this.aulaAsociaFechas = aulaAsociaFechas;
    }
    public Informatica getInformatica() {
        return this.informatica;
    }
    
    public void setInformatica(Informatica informatica) {
        this.informatica = informatica;
    }
    public Multimedios getMultimedios() {
        return this.multimedios;
    }
    
    public void setMultimedios(Multimedios multimedios) {
        this.multimedios = multimedios;
    }




}

