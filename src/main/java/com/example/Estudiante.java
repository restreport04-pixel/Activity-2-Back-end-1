package com.example;

public class Estudiante {

    private String nombre;
    private int edad;
    private double promedio;


    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        setEdad(edad); // Usamos el setter para validar la edad desde el inicio
        this.promedio = promedio;
    }

    // Setter con validación
    public void setEdad(int edad) {
        if (edad>0)
        {
            this.edad = edad;
        }
    }

    // Método que devuelve un BOOLEAN (true o false)
    public boolean haAprobado() {
        return promedio >= 3.0; // Devuelve true si sacó 3 o más
    }

    public void mostrarInfo() {
        String estado = haAprobado() ? "APROBADO" : "REPROBADO";
        System.out.println("Estudiante: " + nombre + " | Promedio: " + promedio + " | Estado: " + estado);
    }
}
