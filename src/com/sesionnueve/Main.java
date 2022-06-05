package com.sesionnueve;

import static com.sesionnueve.SesionNueve.*;

public class Main {
    public static void main(String[] args) {
        String cadena = reverse("hola mundo");
        System.out.println(cadena);


        arrayUnidimensional();

        arrayBidimesional();

        vectores();

        arrayListUno();

        arrayListDos();

        try {
            DividePorCero(4,0);

        }catch(ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }


        inputOutput();

    }
}
