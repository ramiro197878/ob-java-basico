package com.sesiontres;

public class SesionTres {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Ana", "Julieta"};


        String resultado = "";
        for (int i = 0; i < nombres.length; i++) {
           resultado = resultado.concat(nombres[i] + " ");
        }
        System.out.println(resultado);
    }



}
