package com.tallercmovil.ejercicio.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Alumno implements Serializable
{
    private String nombre;
    private String apellidos;
    private String noCuenta;
    private String fechaNacimiento;
    private String carrera;
    //private SimpleDateFormat fechaNacimiento = new SimpleDateFormat("dd/mm/yyyy") ;

    public Alumno(String nombre, String apellidos, String noCuenta, String fechaNacimiento, String carrera)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.noCuenta = noCuenta;
        this.fechaNacimiento = fechaNacimiento;
        this.carrera = carrera;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellidos()
    {
        return apellidos;
    }

    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta)
    {
        this.noCuenta = noCuenta;
    }

    public String getFechaNacimiento()
    {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento)
    {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCarrera()
    {
        return carrera;
    }

    public void setCarrera(String carrera)
    {
        this.carrera = carrera;
    }
}
