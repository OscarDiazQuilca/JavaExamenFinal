/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Alumno {

    Persona persona;

    private int anio_registro;
    private boolean alumno_vigente = true;
    private String telefono;

    public Alumno(Persona persona, int anio_registro, boolean alumno_vigente, String telefono) {
        this.anio_registro = anio_registro;
        this.alumno_vigente = alumno_vigente;;
        this.persona = persona;
        this.telefono = telefono;
    }

    public int getAntiguedad() {
        int anio_actual = 2025;
        return anio_actual - anio_registro;
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

    public boolean isAlumno_vigente() {
        return alumno_vigente;
    }

    public void setAlumno_vigente(boolean alumno_vigente) {
        this.alumno_vigente = alumno_vigente;
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
        return  persona + "\n anio antiguedad = " + getAntiguedad() + "\n alumno_vigente = " + alumno_vigente + "\n telefono = " + telefono;
    }
    
    

    

}
