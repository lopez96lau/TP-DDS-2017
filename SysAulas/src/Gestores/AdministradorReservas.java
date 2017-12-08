/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.AulaDao;
import Dao.DiaDao;
import Dao.PeriodoDao;
import db.model.Aula;
import db.model.Dia;
import db.model.Fecha;
import db.model.InfoAulasDisponibles;
import db.model.InformacionSolicitante;
import db.model.Informatica;
import db.model.Multimedios;
import db.model.Periodica;
import db.model.Periodo;
import db.model.SinRecursos;
import java.sql.Time;
import java.util.ArrayList;
import java.util.HashSet;
import org.hibernate.Hibernate;

/**
 *
 * @author luciano
 */
public class AdministradorReservas {
    public static Periodo buscarPeriodo(Integer periodoID) {
        return PeriodoDao.find(periodoID);
    }

    public static Dia buscarDia(String nombre, String horaInicio) {
        return DiaDao.find(nombre, horaInicio);
    }

    /*public static ArrayList<Aula> obtenerAulas(Periodica nuevaReserva, InformacionSolicitante infoSo) {
        
        ArrayList<Fecha> fechas = new ArrayList<>();
        for (Object o : nuevaReserva.getDias()) {
            Dia d = (Dia) o;
            fechas.addAll(d.getFechas());
        }
        
        HashSet<Integer> rechazadas = new HashSet<>();
        
        
        for(Fecha f : fechas) {
            rechazadas.addAll(AulaDao.findBetween((java.sql.Date) f.getFecha(), (Time) f.getHoraInicio(), f.getDuracion()));
        }
        
        ArrayList<Integer> rechazadasAux = new ArrayList<>();
        rechazadasAux.addAll(rechazadas);
        
        ArrayList<Aula> aulas = AulaDao.findComplemento(rechazadasAux);
        return aulas;
    }*/
    
    public static ArrayList<InfoAulasDisponibles> obtenerAulas(Periodica nuevaReserva, InformacionSolicitante infoSo) {
        
        ArrayList<InfoAulasDisponibles> opciones = new ArrayList<>();
        
        ArrayList<Fecha> fechas = new ArrayList<>();
        for (Object o : nuevaReserva.getDias()) {
            Dia d = (Dia) o;
            fechas.addAll(d.getFechas());
            
            for (Fecha f : fechas) {
                HashSet<Integer> rechazadas = new HashSet<>();
                System.out.println("-------------------------------------------------------------------------");
                System.out.println((java.sql.Date) f.getFecha());
                System.out.println("-------------------------------------------------------------------------");
                rechazadas.addAll(AulaDao.findBetween((java.sql.Date) f.getFecha(), (Time) f.getHoraInicio(), f.getDuracion()));
                System.out.println(rechazadas);

                ArrayList<Integer> rechazadasAux = new ArrayList<>();
                rechazadasAux.addAll(rechazadas);
                
                ArrayList<Aula> aulas = AulaDao.findComplemento(rechazadasAux);
                System.out.println(aulas);
                
                ArrayList<Aula> quitar = new ArrayList<>();
                for(Aula a : aulas) {
                    System.out.print(a.getIdAula());
                    if (a.getCapacidad() < nuevaReserva.getCantidadAlumnos()) {
                        quitar.add(a);
                        System.out.println(" borrado(1)");
                    }
                    switch(infoSo.getTipoAula()) {
                        case "multi":
                            if (!(Hibernate.getClass(a) == Multimedios.class)) {
                                quitar.add(a);System.out.println(" borrado(2)");
                            }
                            break;
                        case "info":
                            if (!(Hibernate.getClass(a) == Informatica.class)) {
                                quitar.add(a);System.out.println(" borrado(3)");
                            }
                            break;
                        case "sinrec":
                            if (!(Hibernate.getClass(a) == SinRecursos.class)) {
                                quitar.add(a);System.out.println(" borrado(4)");
                            }
                            break;
                    }
                }
                for(Aula a : quitar) {
                    aulas.remove(a);
                }
                
                InfoAulasDisponibles iAD = new InfoAulasDisponibles(f);
                iAD.setOpcionesAulas(aulas);
                opciones.add(iAD);
            }
            fechas = new ArrayList<>();
        }
        
        return opciones;
    }
    
    
}
