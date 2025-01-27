/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Fecha;

public class Persona {

    private String DNI;
    private String nombres;
    private int anio_nac;
    private String email;

    public Persona(String DNI, String nombres, int anio_nac, String email) {
        this.DNI = DNI;
        this.nombres = nombres;
        this.anio_nac = anio_nac;
        this.email = email;
    }

    public int getEdad() {
        int anio_actual = 2025;
        return anio_actual - anio_nac;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getAnio_nac() {
        return anio_nac;
    }

    public void setAnio_nac(int anio_nac) {
        this.anio_nac = anio_nac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        System.out.println("------------------------------------------------------------------------------------");
        return "DNI = " + DNI + "\n Nombres = " + nombres + "\n Edad = " + getEdad() + "\n Email = " + email;

    }

}
