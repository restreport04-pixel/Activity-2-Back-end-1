package com.example;

public class CuentaBancaria {

    private String titular;
    private double saldo;

    // Constructor con validación
    public CuentaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        // Si intentan crear la cuenta con saldo negativo, la ponemos en 0
        if (saldoInicial<0)
        {
            this.saldo = 0;
        }
        else 
        {
            this.saldo = saldoInicial;
        }
    }

    // GETTERS Y SETTERS (Ventanillas de acceso)
    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    // Solo Getter para el saldo (Nadie puede hacer cuenta.saldo = 1000000)
    public double getSaldo(){
        return saldo;
    }

    // MÉTODO DEPOSITAR
    public void depositar(double cantidad) {
        if (cantidad>0)
        {
            this.saldo += cantidad;
        }
    }

    // MÉTODO RETIRAR con lógica de seguridad
    public void retirar(double cantidad) {
        if (cantidad>0 && cantidad<=saldo)
        {
            this.saldo -= cantidad;
        }
        else 
        {
            System.out.println("Error: Fondos insuficientes");
        }
    }
}
