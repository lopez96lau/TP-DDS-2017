package db.model;
// Generated 24/10/2017 16:38:54 by Hibernate Tools 4.3.1



/**
 * Informatica generated by hbm2java
 */
public class Informatica extends Aula  implements java.io.Serializable {


     private String canion;
     private Integer cantidadPcs;

    public Informatica() {
    }
    
    public Informatica(String canion, Integer cantidadPcs) {
       this.canion = canion;
       this.cantidadPcs = cantidadPcs;
    }
    
    public void setIdAula(int idAula) {
        super.setIdAula(idAula);
    }
    public String getCanion() {
        return this.canion;
    }
    
    public void setCanion(String canion) {
        this.canion = canion;
    }
    public Integer getCantidadPcs() {
        return this.cantidadPcs;
    }
    
    public void setCantidadPcs(Integer cantidadPcs) {
        this.cantidadPcs = cantidadPcs;
    }




}


