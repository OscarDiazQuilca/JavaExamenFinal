/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Curso {
    
    private int cod_curso;
    private String nombre;
    private boolean curso_vigente = true;
    int anio_experiencia;

    public Curso(int cod_curso, String nombre, boolean par1, int anio_experiencia) {
        this.cod_curso = cod_curso;
        this.nombre = nombre;
        this.anio_experiencia = anio_experiencia;
    }

    public int getCod_curso() {
        return cod_curso;
    }

    public void setCod_curso(int cod_curso) {
        this.cod_curso = cod_curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCurso_vigente() {
        return curso_vigente;
    }

    public void setCurso_vigente(boolean curso_vigente) {
        this.curso_vigente = curso_vigente;
    }

    public int getAnio_experiencia() {
        return anio_experiencia;
    }

    public void setAnio_experiencia(int anio_experiencia) {
        this.anio_experiencia = anio_experiencia;
    }

    @Override
    public String toString() {
        System.out.println("------------------------------------------------------------------------------------");
        return "cod_curso = " + cod_curso + "\n nombre del curso= " + nombre + "\n curso_vigente = " + curso_vigente + "\n anio experiencia para dictar = " + anio_experiencia;
    }
    
    
    
    
    
}
