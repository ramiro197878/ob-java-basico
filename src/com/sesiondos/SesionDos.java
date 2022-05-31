package com.sesiondos;

public class SesionDos {
    public static void main(String[] args) {

        float precio = 300.0f;
        float calcular = calcularImpuesto(precio);

        System.out.println("El precio con IVA incluido es de: " + calcular);

    }

    static float calcularImpuesto(float precio) {
        return precio * 1.21f;
    }
}
