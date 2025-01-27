/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class CursoAperturado {

    private int cod_curso_aperturado;
    private Docente docente;
    private Curso curso;
    private int anio_inicio;
    private int costo;

    public CursoAperturado(int cod_curso_aperturado, Docente docente, Curso curso, int anio_inicio, int costo) {        
        this.cod_curso_aperturado = cod_curso_aperturado;
        this.docente = docente;
        this.curso = curso;
        this.anio_inicio = anio_inicio;
        this.costo = costo;
    }

    public int getCod_curso_aperturado() {
        return cod_curso_aperturado;
    }

    public void setCod_curso_aperturado(int cod_curso_aperturado) {
        this.cod_curso_aperturado = cod_curso_aperturado;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getAnio_inicio() {
        return anio_inicio;
    }

    public void setAnio_inicio(int anio_inicio) {
        this.anio_inicio = anio_inicio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {        
        
        if (docente.getTiempoExperiencia() < curso.anio_experiencia) {
            System.out.println("El docente no cumple con la experiencia requerida para este curso.");
        } else {
            System.out.println("El docente cumple para dictar el curso!!");
        }
        return "codigo curso aperturado = " + cod_curso_aperturado + "\n " + "<<<<< DOCENTE >>>>> \n" + docente + "\n" + " <<<<< CURSO >>>>> \n" + curso + "\n anio_inicio = " + anio_inicio + "\n costo = " + costo;
    }

}
