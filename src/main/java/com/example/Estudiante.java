package com.example;

public class Estudiante {

    private String nombre;
    private int edad;
    private double promedio;


    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.promedio = 0.0;
    }

    public Estudiante(String nombre, int edad, double promedio){
        this.nombre = nombre;
        setEdad(edad);
        this.promedio = promedio;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        if (edad > 0)
        {
            this.edad = edad;
        }
    }

    public double getPromedio(){
        return promedio;
    }

    public void setPromedio(double promedio){
        this.promedio = promedio;
    }

    public boolean haAprobado() {
        return promedio >= 3.0;
    }

    public void mostrarInfo() {
        String estado = haAprobado() ? "APROBADO" : "REPROBADO";
        System.out.println("Estudiante: " + nombre + " | Edad: " + edad + " | Promedio: " + promedio + " | Estado: " + estado);
    }

}

    