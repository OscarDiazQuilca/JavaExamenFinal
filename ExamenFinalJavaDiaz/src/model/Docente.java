/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Docente {

    private Persona persona;
    private int anio_registro;
    private int anio_titulacion;
    private boolean docente_vigente = true;
    private String telefono;

    public Docente(Persona persona, int anio_registro, int anio_titulacion, boolean par2, String telefono) {
        this.persona = persona;
        this.anio_registro = anio_registro;
        this.anio_titulacion = anio_titulacion;
        this.telefono = telefono;
    }
    
    
    public int getAntiguedad() {
        int anio_actual = 2025;
        return anio_actual - anio_registro;
    }
    
    public int getTiempoExperiencia() {
        int anio_actual = 2025;
        return anio_actual - anio_titulacion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getAnio_registro() {
        return anio_registro;
    }

    public void setAnio_registro(int anio_registro) {
        this.anio_registro = anio_registro;
    }

    public int getAnio_titulacion() {
        return anio_titulacion;
    }

    public void setAnio_titulacion(int anio_titulacion) {
        this.anio_titulacion = anio_titulacion;
    }

    public boolean isDocente_vigente() {
        return docente_vigente;
    }

    public void setDocente_vigente(boolean docente_vigente) {
        this.docente_vigente = docente_vigente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        System.out.println("------------------------------------------------------------------------------------");
        return persona + "\n anio de antiguedad = " + getAntiguedad() + "\n anio de experiencia = " + getTiempoExperiencia() + "\n docente_vigente = " + docente_vigente + "\n telefono = " + telefono;
    }
    
    
    
    
}
