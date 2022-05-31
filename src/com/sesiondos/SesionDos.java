package com.sesiondos;

public class SesionDos {
    public static void main(String[] args) {

        float precio = calcularImpuesto(300f);

        System.out.println("El precio con IVA incluido es de: " + precio);

    }

    static float calcularImpuesto(float precio) {
        return precio * 1.21f;
    }
}
