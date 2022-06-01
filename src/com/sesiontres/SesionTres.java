package com.sesiontres;

public class SesionTres {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Ana", "Julieta"};


        String resultado = "";
        for (String nombre : nombres) {
            resultado = resultado.concat(nombre + " ");
        }
        System.out.println(resultado);
    }



}
