package com.example;

public class Libro {

    // 2. Atributos privados
    private String titulo;
    private String autor;
    private int paginas;

    // 2. CONSTRUCTOR VACÍO (Valores por defecto)
    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Anonimo";
        this.paginas = 0;
    }

    // 3. CONSTRUCTOR CON TÍTULO Y AUTOR (Las páginas quedan en 0)
    public Libro (String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = 0;
    }

    // 4. CONSTRUCTOR COMPLETO (Recibe todo)
    public Libro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // 5. MÉTODO PARA MOSTRAR LA INFO
    public void mostrarDetalles() {
        System.out.println("Libro: "+ titulo +" | Autor: "+autor+" | Páginas: "+paginas );
    }
}
