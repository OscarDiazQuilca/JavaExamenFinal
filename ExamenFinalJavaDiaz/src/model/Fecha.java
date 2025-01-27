/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Fecha {

    private int dia_int;
    private int mes_int;
    private int anio_int;
    private int hora;
    private int min;
    private int seg;
    
    
    public Fecha(int dia_int, int mes_int, int anio_int,int hora, int min, int seg) {
        this.dia_int = dia_int;
        this.mes_int = mes_int;
        this.anio_int = anio_int;
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }
    
    // Recarga de constructor
    public Fecha(int dia_int, int mes_int, int anio_int) {
        this.dia_int = dia_int;
        this.mes_int = mes_int;
        this.anio_int = anio_int;
        this.hora = 0;
        this.min = 0;
        this.seg = 0;
    }    

    Fecha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public int getDia_int() {
        return dia_int;
    }

    public void setDia_int(int dia_int) {
        this.dia_int = dia_int;
    }

    public int getMes_int() {
        return mes_int;
    }

    public void setMes_int(int mes_int) {
        this.mes_int = mes_int;
    }

    public int getAnio_int() {
        return anio_int;
    }

    public void setAnio_int(int anio_int) {
        this.anio_int = anio_int;
    }

    @Override
    public String toString() {
        System.out.println("------------------------------------------------------------------------------------");
        return "Fecha " + dia_int + " - " + mes_int + " - " + anio_int + " , " + hora + " : " + min + " : " + seg;
    }

    
    
    
    
}
