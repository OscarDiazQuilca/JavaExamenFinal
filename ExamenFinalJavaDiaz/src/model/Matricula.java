/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Matricula {

    private CursoAperturado cursoMatriculado;
    private Alumno alumno;
    private boolean pagado;
    private int anio_pago;

    public Matricula(CursoAperturado cursoMatriculado, Alumno alumno, boolean pagado, int anio_pago) {        
        this.cursoMatriculado = cursoMatriculado;
        this.alumno = alumno;
        this.pagado = pagado;
        this.anio_pago = anio_pago;
    }

    public CursoAperturado getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(CursoAperturado cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public int getAnio_pago() {
        return anio_pago;
    }

    public void setAnio_pago(int anio_pago) {
        this.anio_pago = anio_pago;
    }
    
    

    @Override
    public String toString() {
        if (alumno.persona.getEdad() < 18) {
            System.out.println("El alumno debe ser mayor de 18 años para matricularse.");
        } else{
            System.out.println("Alumno matriculado con exito!!!");
        }
        return "curso Matriculado=" + cursoMatriculado + "\n<<<<< ALUMNO >>>>> \n" + alumno + "\n pagado = " + pagado + "\n anio_pago = " + anio_pago;
    }

}
